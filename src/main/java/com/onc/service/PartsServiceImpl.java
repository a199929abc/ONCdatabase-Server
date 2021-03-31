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

import javax.servlet.http.Part;
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
    public boolean queryPartIsExist(Parts part) {
    Example partExample = new Example(Parts.class);
    Criteria criteria = partExample.createCriteria();
    criteria.andEqualTo("partno", part.getPartno());
    criteria.andEqualTo("status",part.getStatus());

    List<Parts> partResult = partMapper.selectByExample(partExample);
    return partResult.size() != 0 ? true : false;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Parts> queryPartList(Parts part) {
    Example partExample = new Example(Parts.class);
    Criteria criteria = partExample.createCriteria();
    criteria.andEqualTo("partno",part.getPartno());
    criteria.andEqualTo("status",part.getStatus());
    criteria.andEqualTo("rev",part.getRev());
    List <Parts> partResult = partMapper.selectByExample(partExample);
    System.out.println("There are "+partResult.size() +"similar result in oncdatabase");
    return partResult;
    }

    @Override
    public boolean queryIsRevDml(Parts part) {
        Example partExample = new Example(Parts.class);
        Criteria criteria = partExample.createCriteria();
        criteria.andEqualTo("partno",part.getPartno());
        criteria.andEqualTo("status",part.getStatus());
        criteria.andEqualTo("rev",part.getRev());
        List <Parts> partResult = partMapper.selectByExample(partExample);
        System.out.println("There are "+ partResult.size()+" result exist in database");
        return partResult.size() != 1 ? false : true;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Parts queryGetPartData(Parts part) {
        Example partExample = new Example(Parts.class);
        Criteria criteria = partExample.createCriteria();
        if(part.getRev()!=null){
            criteria.andEqualTo("partno", part.getPartno());
            criteria.andEqualTo("status",part.getStatus());
            criteria.andEqualTo("rev",part.getRev());
            Parts result = partMapper.selectOneByExample(partExample);
            return result;
        }else {
            criteria.andEqualTo("partno", part.getPartno());
            criteria.andEqualTo("status",part.getStatus());
            Parts result = partMapper.selectOneByExample(partExample);
            return result;
        }

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
