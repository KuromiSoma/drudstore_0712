package org.drug.store.ptuketukeregister;

import lombok.Data;

@Data
public class PtUketukeRegisterForm {
	private String ptName;
	private String birthdayDtYear;
	private String birthdayDtMonth;
	private String birthdayDtDay;
	private int insuranceNo;
	private String insuranceCd;
	private String insuranceCd2;
	private int fuyoFlg;
	private int genderFlg;
	private String expDtYear;
	private String expDtMonth;
	private String expDtDay;
	private String receiptDtYear;
	private String receiptDtMonth;
	private String receiptDtDay;
	private int[] mdNo;
	
	public String getPtName() {
		return ptName;
	}
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	public String getBirthdayDtYear() {
		return birthdayDtYear;
	}
	public void setBirthdayDtYear(String birthdayDtYear) {
		this.birthdayDtYear = birthdayDtYear;
	}
	public String getBirthdayDtMonth() {
		return birthdayDtMonth;
	}
	public void setBirthdayDtMonth(String birthdayDtMonth) {
		this.birthdayDtMonth = birthdayDtMonth;
	}
	public String getBirthdayDtDay() {
		return birthdayDtDay;
	}
	public void setBirthdayDtDay(String birthdayDtDay) {
		this.birthdayDtDay = birthdayDtDay;
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
	public int getGenderFlg() {
		return genderFlg;
	}
	public void setGenderFlg(int genderFlg) {
		this.genderFlg = genderFlg;
	}
	public String getExpDtYear() {
		return expDtYear;
	}
	public void setExpDtYear(String expDtYear) {
		this.expDtYear = expDtYear;
	}
	public String getExpDtMonth() {
		return expDtMonth;
	}
	public void setExpDtMonth(String expDtMonth) {
		this.expDtMonth = expDtMonth;
	}
	public String getExpDtDay() {
		return expDtDay;
	}
	public void setExpDtDay(String expDtDay) {
		this.expDtDay = expDtDay;
	}
	public String getReceiptDtYear() {
		return receiptDtYear;
	}
	public void setReceiptDtYear(String receiptDtYear) {
		this.receiptDtYear = receiptDtYear;
	}
	public String getReceiptDtMonth() {
		return receiptDtMonth;
	}
	public void setReceiptDtMonth(String receiptDtMonth) {
		this.receiptDtMonth = receiptDtMonth;
	}
	public String getReceiptDtDay() {
		return receiptDtDay;
	}
	public void setReceiptDtDay(String receiptDtDay) {
		this.receiptDtDay = receiptDtDay;
	}
	public int[] getMdNo() {
		return mdNo;
	}
	public void setMdNo(int[] mdNo) {
		this.mdNo = mdNo;
	}
	
	
}
