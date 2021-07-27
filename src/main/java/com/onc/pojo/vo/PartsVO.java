package com.onc.pojo.vo;

import com.onc.pojo.Boms;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public class PartsVO {
        public Integer getPartsId() {
            return partsId;
        }

        public void setPartsId(Integer partsId) {
            this.partsId = partsId;
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

        public Date getRevcreated() {
            return revcreated;
        }

        public void setRevcreated(Date revcreated) {
            this.revcreated = revcreated;
        }

        public String getRedline() {
            return redline;
        }

        public void setRedline(String redline) {
            this.redline = redline;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getHold() {
            return hold;
        }

        public void setHold(String hold) {
            this.hold = hold;
        }

        public String getReserved() {
            return reserved;
        }

        public void setReserved(String reserved) {
            this.reserved = reserved;
        }

        public String getBom() {
            return bom;
        }

        public void setBom(String bom) {
            this.bom = bom;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getDraft() {
            return draft;
        }

        public void setDraft(String draft) {
            this.draft = draft;
        }

        public String getOption() {
            return option;
        }

        public void setOption(String option) {
            this.option = option;
        }

        public String getSchematics() {
            return schematics;
        }

        public void setSchematics(String schematics) {
            this.schematics = schematics;
        }

        public String getProposal() {
            return proposal;
        }

        public void setProposal(String proposal) {
            this.proposal = proposal;
        }

        public String getStandardstock() {
            return standardstock;
        }

        public void setStandardstock(String standardstock) {
            this.standardstock = standardstock;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getCheckedby() {
            return checkedby;
        }

        public void setCheckedby(String checkedby) {
            this.checkedby = checkedby;
        }

        public String getCbempno() {
            return cbempno;
        }

        public void setCbempno(String cbempno) {
            this.cbempno = cbempno;
        }

        public Date getCheckedts() {
            return checkedts;
        }

        public void setCheckedts(Date checkedts) {
            this.checkedts = checkedts;
        }

        public String getApprovedby() {
            return approvedby;
        }

        public void setApprovedby(String approvedby) {
            this.approvedby = approvedby;
        }

        public String getAbempno() {
            return abempno;
        }

        public void setAbempno(String abempno) {
            this.abempno = abempno;
        }

        public Date getApprovedts() {
            return approvedts;
        }

        public void setApprovedts(Date approvedts) {
            this.approvedts = approvedts;
        }

        public String getDateofobsolescence() {
            return dateofobsolescence;
        }

        public void setDateofobsolescence(String dateofobsolescence) {
            this.dateofobsolescence = dateofobsolescence;
        }

        public String getSoc() {
            return soc;
        }

        public void setSoc(String soc) {
            this.soc = soc;
        }

        public String getNavsea() {
            return navsea;
        }

        public void setNavsea(String navsea) {
            this.navsea = navsea;
        }


        public String getComponentno() {
            return componentno;
        }

        public void setComponentno(String componentno) {
            this.componentno = componentno;
        }

        public String getCagecode() {
            return cagecode;
        }

        public void setCagecode(String cagecode) {
            this.cagecode = cagecode;
        }

        public String getMfgpartno() {
            return mfgpartno;
        }

        public void setMfgpartno(String mfgpartno) {
            this.mfgpartno = mfgpartno;
        }

        public String getItemgroup() {
            return itemgroup;
        }

        public void setItemgroup(String itemgroup) {
            this.itemgroup = itemgroup;
        }

        public String getItemtype() {
            return itemtype;
        }

        public void setItemtype(String itemtype) {
            this.itemtype = itemtype;
        }

        public String getUnits() {
            return units;
        }

        public void setUnits(String units) {
            this.units = units;
        }

        public String getPrototype() {
            return prototype;
        }

        public void setPrototype(String prototype) {
            this.prototype = prototype;
        }

        public String getSendtobaan() {
            return sendtobaan;
        }

        public void setSendtobaan(String sendtobaan) {
            this.sendtobaan = sendtobaan;
        }

        public Date getBaanstatus() {
            return baanstatus;
        }

        public void setBaanstatus(Date baanstatus) {
            this.baanstatus = baanstatus;
        }

        public String getHyperlink() {
            return hyperlink;
        }

        public void setHyperlink(String hyperlink) {
            this.hyperlink = hyperlink;
        }

        public String getClientapproved() {
            return clientapproved;
        }

        public void setClientapproved(String clientapproved) {
            this.clientapproved = clientapproved;
        }

        public String getApprovalreference() {
            return approvalreference;
        }

        public void setApprovalreference(String approvalreference) {
            this.approvalreference = approvalreference;
        }

        public String getCacategory() {
            return cacategory;
        }

        public void setCacategory(String cacategory) {
            this.cacategory = cacategory;
        }

        private Integer partsId;


        private String partno;

        private String rev;

        private Date revcreated;

        private String redline;

        private String status;

        private String description;

        private String hold;

        private String reserved;

        private String bom;

        private String reference;

        private String draft;

        private String option;

        private String schematics;

        private String proposal;

        private String standardstock;

        private String size;

        private String checkedby;

        private String cbempno;

        private Date checkedts;

        private String approvedby;

        private String abempno;

        private Date approvedts;

        private String dateofobsolescence;

        private String soc;

        private String navsea;

        private String componentno;

        private String cagecode;

        private String mfgpartno;

        private String itemgroup;

        private String itemtype;

        private String units;

        private String prototype;

        private String sendtobaan;

        private Date baanstatus;

        private String hyperlink;
        private String clientapproved;
        private String approvalreference;
        private String cacategory;
        private String mfgName;

        public String getMfgName() {
            return mfgName;
        }

        public void setMfgName(String mfgName) {
            this.mfgName = mfgName;
        }



        public List<BomsVO> getJsonbom() {
            return jsonbom;
        }

        public void setJsonbom(List<BomsVO> jsonbom) {
        this.jsonbom = jsonbom;
        }

        private List<BomsVO> jsonbom;

        }
