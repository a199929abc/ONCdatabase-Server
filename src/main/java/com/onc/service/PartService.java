package com.onc.service;


import com.onc.pojo.Boms;
import com.onc.pojo.Parts;

import javax.servlet.http.Part;
import java.util.List;

public interface PartService {

    public boolean queryPartIsExist(String partNum,String status);

    public List<Parts> queryPartList(String partNum);

    public Parts queryGetPartData(String partNum,String status);

    public String queryGetMfgName (Parts part);

    public List<Boms> queryBoms (Parts part);

    public boolean queryBomsIsExist(Parts part);
}
