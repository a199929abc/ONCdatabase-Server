package com.onc.service;

import com.onc.mapper.BomsMapper;
import com.onc.mapper.ManufacturersMapper;
import com.onc.mapper.PartsMapper;
import com.onc.pojo.Boms;
import com.onc.pojo.Manufacturers;
import com.onc.pojo.Parts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.util.List;

@Service
public class PartsServiceImpl implements PartService{

    @Autowired
    private PartsMapper partMapper;
    @Autowired
    private ManufacturersMapper ManufacturerMapper;

    @Autowired
    private BomsMapper BomMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryPartIsExist(String partNum,String status) {
    Example partExample = new Example(Parts.class);
    Criteria criteria = partExample.createCriteria();
    criteria.andEqualTo("partno", partNum);
    criteria.andEqualTo("status",status);
    Parts result = partMapper.selectOneByExample(partExample);
    return result != null ? true : false;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Parts> queryPartList(String partNum) {
    return  null;
    }

    @Override
    public Parts queryGetPartData(String partNum, String status) {
        Example partExample = new Example(Parts.class);
        Criteria criteria = partExample.createCriteria();
        criteria.andEqualTo("partno", partNum);
        criteria.andEqualTo("status",status);
        Parts result = partMapper.selectOneByExample(partExample);
        return result;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public String queryGetMfgName(Parts part) {
        String cageCode = part.getCagecode();
        Example mfgExample = new Example(Manufacturers.class);
        Criteria criteria = mfgExample.createCriteria();
        criteria.andEqualTo("cagecode",cageCode);
        Manufacturers mfgResult = ManufacturerMapper.selectOneByExample(mfgExample);
        System.out.println("Manufacturer name is: " + mfgResult.getMfgname());
        return mfgResult.getMfgname();

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Boms> queryBoms(Parts part) {
    String partId = part.getPartno();
    Example bomExample = new Example(Boms.class);
    Criteria criteria = bomExample.createCriteria();
    criteria.andEqualTo("partno",partId);
    List<Boms> bomsResult = BomMapper.selectByExample(bomExample);
    System.out.println("list size is : "+ bomsResult.size());
        for(int i=0;i<bomsResult.size();i++){
            System.out.println("BOM: " +  bomsResult.get(i).getBompartno());
        }
        return bomsResult;
    }

    @Override
    public boolean queryBomsIsExist(Parts part) {
        String partId = part.getPartno();
        Example bomExample = new Example(Boms.class);
        Criteria criteria = bomExample.createCriteria();
        criteria.andEqualTo("partno",partId);
        List<Boms> bomsResult = BomMapper.selectByExample(bomExample);
        return  bomsResult.size() != 0 ? true : false;
    }
}
