package com.onc.controller;

import com.onc.pojo.Boms;
import com.onc.pojo.Manufacturers;
import com.onc.pojo.Parts;
import com.onc.pojo.vo.BomsVO;
import com.onc.pojo.vo.PartsVO;
import com.onc.pojo.vo.RevVO;
import com.onc.service.PartService;
import com.onc.utils.JSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class searchController {

    @Autowired
    private PartService partService;

    @RequestMapping("/nav/search")
    public JSONResult login(@RequestBody Parts part) throws Exception{
        String PartNo = part.getPartno();
        String PartStatus = part.getStatus();
        PartsVO partVO = new PartsVO();

        System.out.println("Searching part num : "+PartNo);
        //System.out.println("Search part status : " +PartStatus);
        //System.out.println(part.getRev());

        boolean partIsExist = partService.queryPartIsExist(part);

        //1. Part Exist Process Part number
        if(partIsExist){
            if(part.getRev().equals("")){
                part.setRev(null);
            }
            //1.1 Whether have multiple parts
            if(partService.queryIsRevDml(part)){
                Parts result = partService.queryGetPartData(part);
                System.out.println("part is unique");

                if(result.getCagecode()!=null){
                    System.out.println("This part have a cage code.");
                    String mfgName = partService.queryGetMfgName(result);
                    partVO.setMfgName(mfgName);
                }
                // 1.2 Whether have Building Material
                if (partService.queryBomsIsExist(part)){
                    System.out.println("BOM exist ");
                    List<Boms> bomResult=partService.queryBoms(part, result.getRev());
                    List<BomsVO> bomsVO =new ArrayList<>();
                    BomsVO bomVO;

                    for(int i=0; i<bomResult.size();i++){
                        Parts bomPart=partService.queryBomPart(
                                bomResult.get(i).getBompartno(),
                                bomResult.get(i).getBomrev());
                        bomVO = new BomsVO();
                        bomVO.setBommfgpartno(bomResult.get(i).getBompartno());
                        bomVO.setInstructions(bomPart.getDescription());
                        bomVO.setMfgpartno(bomPart.getMfgpartno());
                        bomVO.setQty(bomResult.get(i).getQty());
                        bomVO.setBomrev(bomResult.get(i).getBomrev());
                        bomVO.setRev(bomResult.get(i).getRev());


                        if(bomPart.getCagecode()!=null){
                            String bomsMfgName = partService.queryGetMfgName(bomPart);
                            bomVO.setBommfgname(bomsMfgName);

                        }
                        //bomResult.get(i).setBompartno(bomResult.get(i).getBompartno());
                        //bomResult.get(i).setInstructions(bomPart.getDescription());
                        //bomResult.get(i).setFindno(bomPart.getMfgpartno());
                        bomsVO.add(bomVO);
                         }
                    partVO.setJsonbom(bomsVO);

                }else{
                    System.out.println("BOM not exist");
                }
                BeanUtils.copyProperties(result,partVO);

                return JSONResult.ok(partVO);

            }else{
                List<Parts> revResult = partService.queryPartList(part);
                return JSONResult.errorMapRev(revResult);
            }
        }else{
            System.out.println("Part doesn't exit.");
            return JSONResult.errorMsg("Part is not exist...");
        }



    }
}
