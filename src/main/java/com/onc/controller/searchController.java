package com.onc.controller;

import com.onc.pojo.Boms;
import com.onc.pojo.Manufacturers;
import com.onc.pojo.Parts;
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
        System.out.println("Search part num : "+PartNo);
        System.out.println("Search part status : " +PartStatus);
        System.out.println(part.getRev());
        PartsVO partVO = new PartsVO();
        boolean partIsExist = partService.queryPartIsExist(part);

        if(partIsExist){
            if(part.getRev().equals("")){
                part.setRev(null);
            }

            System.out.println("Part exist in database.");

            if(partService.queryIsRevDml(part)){
                Parts result = partService.queryGetPartData(part);
                System.out.println("part is unique");

                if(result.getCagecode()!=null){
                    System.out.println("This part have a cage code.");
                    String mfgName = partService.queryGetMfgName(result);
                    partVO.setMfgName(mfgName);
                }

                if (partService.queryBomsIsExist(part)){
                    System.out.println("BOM exist ");
                    List<Boms> bomResult=partService.queryBoms(part);
                    partVO.setJsonbom(bomResult);

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
