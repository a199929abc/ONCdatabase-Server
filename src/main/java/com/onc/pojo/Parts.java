package com.onc.pojo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name ="parts")
public class Parts {
    @Id
    @Column(name = "parts_id")
    private Integer partsId;

    @Column(name = "PartNo")
    private String partno;

    @Column(name = "Rev")
    private String rev;

    @Column(name = "RevCreated")
    private Date revcreated;

    @Column(name = "Redline")
    private String redline;

    @Column(name = "Status")
    private String status;

    @Column(name = "Description")
    private String description;

    @Column(name = "Hold")
    private String hold;

    @Column(name = "Reserved")
    private String reserved;

    @Column(name = "BOM")
    private String bom;

    @Column(name = "Reference")
    private String reference;

    @Column(name = "Draft")
    private String draft;

    @Column(name = "`Option`")
    private String option;

    @Column(name = "`Schematics`")
    private String schematics;

    @Column(name = "`Proposal`")
    private String proposal;

    @Column(name = "`StandardStock`")
    private String standardstock;

    @Column(name = "`Size`")
    private String size;

    @Column(name = "`CheckedBy`")
    private String checkedby;

    @Column(name = "`CBEmpNo`")
    private String cbempno;

    @Column(name = "CheckedTS")
    private Date checkedts;

    @Column(name = "ApprovedBy")
    private String approvedby;

    @Column(name = "ABEmpNo")
    private String abempno;

    @Column(name = "ApprovedTS")
    private Date approvedts;

    @Column(name = "DateOfObsolescence")
    private String dateofobsolescence;

    @Column(name = "SOC")
    private String soc;

    @Column(name = "Navsea")
    private String navsea;

    @Column(name = "MCD")
    private String mcd;

    @Column(name = "ComponentNo")
    private String componentno;

    @Column(name = "CageCode")
    private String cagecode;

    @Column(name = "MfgPartNo")
    private String mfgpartno;

    @Column(name = "ItemGroup")
    private String itemgroup;

    @Column(name = "ItemType")
    private String itemtype;

    @Column(name = "Units")
    private String units;

    @Column(name = "Prototype")
    private String prototype;

    @Column(name = "SendToBaan")
    private String sendtobaan;

    @Column(name = "BaanStatus")
    private Date baanstatus;

    @Column(name = "Hyperlink")
    private String hyperlink;

    @Column(name = "ClientApproved")
    private String clientapproved;

    @Column(name = "ApprovalReference")
    private String approvalreference;

    @Column(name = "CACategory")
    private String cacategory;

    /**
     * @return parts_id
     */
    public Integer getPartsId() {
        return partsId;
    }

    /**
     * @param partsId
     */
    public void setPartsId(Integer partsId) {
        this.partsId = partsId;
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
     * @return RevCreated
     */
    public Date getRevcreated() {
        return revcreated;
    }

    /**
     * @param revcreated
     */
    public void setRevcreated(Date revcreated) {
        this.revcreated = revcreated;
    }

    /**
     * @return Redline
     */
    public String getRedline() {
        return redline;
    }

    /**
     * @param redline
     */
    public void setRedline(String redline) {
        this.redline = redline;
    }

    /**
     * @return Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Hold
     */
    public String getHold() {
        return hold;
    }

    /**
     * @param hold
     */
    public void setHold(String hold) {
        this.hold = hold;
    }

    /**
     * @return Reserved
     */
    public String getReserved() {
        return reserved;
    }

    /**
     * @param reserved
     */
    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    /**
     * @return BOM
     */
    public String getBom() {
        return bom;
    }

    /**
     * @param bom
     */
    public void setBom(String bom) {
        this.bom = bom;
    }

    /**
     * @return Reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return Draft
     */
    public String getDraft() {
        return draft;
    }

    /**
     * @param draft
     */
    public void setDraft(String draft) {
        this.draft = draft;
    }

    /**
     * @return Option
     */
    public String getOption() {
        return option;
    }

    /**
     * @param option
     */
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * @return Schematics
     */
    public String getSchematics() {
        return schematics;
    }

    /**
     * @param schematics
     */
    public void setSchematics(String schematics) {
        this.schematics = schematics;
    }

    /**
     * @return Proposal
     */
    public String getProposal() {
        return proposal;
    }

    /**
     * @param proposal
     */
    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    /**
     * @return StandardStock
     */
    public String getStandardstock() {
        return standardstock;
    }

    /**
     * @param standardstock
     */
    public void setStandardstock(String standardstock) {
        this.standardstock = standardstock;
    }

    /**
     * @return Size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return CheckedBy
     */
    public String getCheckedby() {
        return checkedby;
    }

    /**
     * @param checkedby
     */
    public void setCheckedby(String checkedby) {
        this.checkedby = checkedby;
    }

    /**
     * @return CBEmpNo
     */
    public String getCbempno() {
        return cbempno;
    }

    /**
     * @param cbempno
     */
    public void setCbempno(String cbempno) {
        this.cbempno = cbempno;
    }

    /**
     * @return CheckedTS
     */
    public Date getCheckedts() {
        return checkedts;
    }

    /**
     * @param checkedts
     */
    public void setCheckedts(Date checkedts) {
        this.checkedts = checkedts;
    }

    /**
     * @return ApprovedBy
     */
    public String getApprovedby() {
        return approvedby;
    }

    /**
     * @param approvedby
     */
    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    /**
     * @return ABEmpNo
     */
    public String getAbempno() {
        return abempno;
    }

    /**
     * @param abempno
     */
    public void setAbempno(String abempno) {
        this.abempno = abempno;
    }

    /**
     * @return ApprovedTS
     */
    public Date getApprovedts() {
        return approvedts;
    }

    /**
     * @param approvedts
     */
    public void setApprovedts(Date approvedts) {
        this.approvedts = approvedts;
    }

    /**
     * @return DateOfObsolescence
     */
    public String getDateofobsolescence() {
        return dateofobsolescence;
    }

    /**
     * @param dateofobsolescence
     */
    public void setDateofobsolescence(String dateofobsolescence) {
        this.dateofobsolescence = dateofobsolescence;
    }

    /**
     * @return SOC
     */
    public String getSoc() {
        return soc;
    }

    /**
     * @param soc
     */
    public void setSoc(String soc) {
        this.soc = soc;
    }

    /**
     * @return Navsea
     */
    public String getNavsea() {
        return navsea;
    }

    /**
     * @param navsea
     */
    public void setNavsea(String navsea) {
        this.navsea = navsea;
    }

    /**
     * @return MCD
     */
    public String getMcd() {
        return mcd;
    }

    /**
     * @param mcd
     */
    public void setMcd(String mcd) {
        this.mcd = mcd;
    }

    /**
     * @return ComponentNo
     */
    public String getComponentno() {
        return componentno;
    }

    /**
     * @param componentno
     */
    public void setComponentno(String componentno) {
        this.componentno = componentno;
    }

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
     * @return MfgPartNo
     */
    public String getMfgpartno() {
        return mfgpartno;
    }

    /**
     * @param mfgpartno
     */
    public void setMfgpartno(String mfgpartno) {
        this.mfgpartno = mfgpartno;
    }

    /**
     * @return ItemGroup
     */
    public String getItemgroup() {
        return itemgroup;
    }

    /**
     * @param itemgroup
     */
    public void setItemgroup(String itemgroup) {
        this.itemgroup = itemgroup;
    }

    /**
     * @return ItemType
     */
    public String getItemtype() {
        return itemtype;
    }

    /**
     * @param itemtype
     */
    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    /**
     * @return Units
     */
    public String getUnits() {
        return units;
    }

    /**
     * @param units
     */
    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * @return Prototype
     */
    public String getPrototype() {
        return prototype;
    }

    /**
     * @param prototype
     */
    public void setPrototype(String prototype) {
        this.prototype = prototype;
    }

    /**
     * @return SendToBaan
     */
    public String getSendtobaan() {
        return sendtobaan;
    }

    /**
     * @param sendtobaan
     */
    public void setSendtobaan(String sendtobaan) {
        this.sendtobaan = sendtobaan;
    }

    /**
     * @return BaanStatus
     */
    public Date getBaanstatus() {
        return baanstatus;
    }

    /**
     * @param baanstatus
     */
    public void setBaanstatus(Date baanstatus) {
        this.baanstatus = baanstatus;
    }

    /**
     * @return Hyperlink
     */
    public String getHyperlink() {
        return hyperlink;
    }

    /**
     * @param hyperlink
     */
    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    /**
     * @return ClientApproved
     */
    public String getClientapproved() {
        return clientapproved;
    }

    /**
     * @param clientapproved
     */
    public void setClientapproved(String clientapproved) {
        this.clientapproved = clientapproved;
    }

    /**
     * @return ApprovalReference
     */
    public String getApprovalreference() {
        return approvalreference;
    }

    /**
     * @param approvalreference
     */
    public void setApprovalreference(String approvalreference) {
        this.approvalreference = approvalreference;
    }

    /**
     * @return CACategory
     */
    public String getCacategory() {
        return cacategory;
    }

    /**
     * @param cacategory
     */
    public void setCacategory(String cacategory) {
        this.cacategory = cacategory;
    }
}