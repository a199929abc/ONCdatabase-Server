package com.onc.pojo;

import javax.persistence.*;

public class Boms {
    @Id
    @Column(name = "boms_id")
    private Integer bomsId;

    @Column(name = "PartNo")
    private String partno;

    @Column(name = "Rev")
    private String rev;

    @Column(name = "BOMPartNo")
    private String bompartno;

    @Column(name = "BOMRev")
    private String bomrev;

    @Column(name = "Instructions")
    private String instructions;

    @Column(name = "Qty")
    private Integer qty;

    @Column(name = "findNo")
    private String findno;

    /**
     * @return boms_id
     */
    public Integer getBomsId() {
        return bomsId;
    }

    /**
     * @param bomsId
     */
    public void setBomsId(Integer bomsId) {
        this.bomsId = bomsId;
    }

    /**
     * @return PartNo
     */
    public String getPartno() {
        return partno;
    }

    /**
     * @param partno
     */
    public void setPartno(String partno) {
        this.partno = partno;
    }

    /**
     * @return Rev
     */
    public String getRev() {
        return rev;
    }

    /**
     * @param rev
     */
    public void setRev(String rev) {
        this.rev = rev;
    }

    /**
     * @return BOMPartNo
     */
    public String getBompartno() {
        return bompartno;
    }

    /**
     * @param bompartno
     */
    public void setBompartno(String bompartno) {
        this.bompartno = bompartno;
    }

    /**
     * @return BOMRev
     */
    public String getBomrev() {
        return bomrev;
    }

    /**
     * @param bomrev
     */
    public void setBomrev(String bomrev) {
        this.bomrev = bomrev;
    }

    /**
     * @return Instructions
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * @param instructions
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * @return Qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return findNo
     */
    public String getFindno() {
        return findno;
    }

    /**
     * @param findno
     */
    public void setFindno(String findno) {
        this.findno = findno;
    }
}