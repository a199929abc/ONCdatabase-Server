package com.onc.pojo.vo;

import javax.persistence.Column;
import javax.persistence.Id;

public class BomsVO {
    private Integer bomsId;
    private String partno;
    private String rev;
    private String mfgpartno;
    private String bompartno;
    private String bomrev;
    private String instructions;
    private Integer qty;
    private String findno;
    private String bompartname;
    private String bommfgpartno;



    public String getMfgpartno() {
        return mfgpartno;
    }

    public void setMfgpartno(String mfgpartno) {
        this.mfgpartno = mfgpartno;
    }

    public Integer getBomsId() {
        return bomsId;
    }

    public void setBomsId(Integer bomsId) {
        this.bomsId = bomsId;
    }

    public String getPartno() {
        return partno;
    }

    public void setPartno(String partno) {
        this.partno = partno;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getBompartno() {
        return bompartno;
    }

    public void setBompartno(String bompartno) {
        this.bompartno = bompartno;
    }

    public String getBomrev() {
        return bomrev;
    }

    public void setBomrev(String bomrev) {
        this.bomrev = bomrev;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getFindno() {
        return findno;
    }

    public void setFindno(String findno) {
        this.findno = findno;
    }

    public String getBompartname() {
        return bompartname;
    }

    public void setBompartname(String bompartname) {
        this.bompartname = bompartname;
    }

    public String getBommfgpartno() {
        return bommfgpartno;
    }

    public void setBommfgpartno(String bommfgpartno) {
        this.bommfgpartno = bommfgpartno;
    }

    public String getBommfgname() {
        return bommfgname;
    }

    public void setBommfgname(String bommfgname) {
        this.bommfgname = bommfgname;
    }

    private String bommfgname;

}
