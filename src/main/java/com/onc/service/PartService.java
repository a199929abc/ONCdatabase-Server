package com.onc.service;


import com.onc.pojo.Boms;
import com.onc.pojo.Parts;
import com.onc.pojo.vo.BomsVO;

import javax.servlet.http.Part;
import java.util.List;

public interface PartService {

    public boolean queryPartIsExist(Parts part);

    public List<Parts> queryPartList(Parts part);

    public boolean queryIsRevDml (Parts part);

    public Parts queryGetPartData(Parts part);

    public String queryGetMfgName (Parts part);

    public List<Boms> queryBoms (Parts part, String rev);

    public boolean queryBomsIsExist(Parts parts );

    public Parts queryBomPart(String partNum,String rev);


}
