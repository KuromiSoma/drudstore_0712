package org.drug.store.ptuserlist;

import lombok.Data;

@Data
public class PtUserForm {
    private int ptNo;
    private String ptName;
    private String birthdayDt;
	private int insuranceNo;
	private String insuranceCd;
	private String insuranceCd2;
    private int fuyoFlg;
    private String expDt;
	public int getPtNo() {
		return ptNo;
	}
	public void setPtNo(int ptNo) {
		this.ptNo = ptNo;
	}
	public String getPtName() {
		return ptName;
	}
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	public String getBirthdayDt() {
		return birthdayDt;
	}
	public void setBirthdayDt(String birthdayDt) {
		this.birthdayDt = birthdayDt;
	}
	public int getInsuranceNo() {
		return insuranceNo;
	}
	public void setInsuranceNo(int insuranceNo) {
		this.insuranceNo = insuranceNo;
	}
	public String getInsuranceCd() {
		return insuranceCd;
	}
	public void setInsuranceCd(String insuranceCd) {
		this.insuranceCd = insuranceCd;
	}
	public String getInsuranceCd2() {
		return insuranceCd2;
	}
	public void setInsuranceCd2(String insuranceCd2) {
		this.insuranceCd2 = insuranceCd2;
	}
	public int getFuyoFlg() {
		return fuyoFlg;
	}
	public void setFuyoFlg(int fuyoFlg) {
		this.fuyoFlg = fuyoFlg;
	}
	public String getExpDt() {
		return expDt;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
	}
	public Object getNm_add() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getNk_tel() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
