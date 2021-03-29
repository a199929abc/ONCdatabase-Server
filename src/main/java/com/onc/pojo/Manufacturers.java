package com.onc.pojo;

import javax.persistence.*;

public class Manufacturers {
    @Id
    @Column(name = "CageCode")
    private String cagecode;

    @Column(name = "mfgName")
    private String mfgname;

    @Column(name = "BusinessPartnerNo")
    private String businesspartnerno;

    @Column(name = "SearchKey")
    private String searchkey;

    /**
     * @return CageCode
     */
    public String getCagecode() {
        return cagecode;
    }

    /**
     * @param cagecode
     */
    public void setCagecode(String cagecode) {
        this.cagecode = cagecode;
    }

    /**
     * @return mfgName
     */
    public String getMfgname() {
        return mfgname;
    }

    /**
     * @param mfgname
     */
    public void setMfgname(String mfgname) {
        this.mfgname = mfgname;
    }

    /**
     * @return BusinessPartnerNo
     */
    public String getBusinesspartnerno() {
        return businesspartnerno;
    }

    /**
     * @param businesspartnerno
     */
    public void setBusinesspartnerno(String businesspartnerno) {
        this.businesspartnerno = businesspartnerno;
    }

    /**
     * @return SearchKey
     */
    public String getSearchkey() {
        return searchkey;
    }

    /**
     * @param searchkey
     */
    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }
}