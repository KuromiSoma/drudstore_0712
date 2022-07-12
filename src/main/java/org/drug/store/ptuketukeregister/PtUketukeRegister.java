package org.drug.store.ptuketukeregister;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class PtUketukeRegister {
	private String ptName;
	private Timestamp birthdayDt;
	private int insuranceNo;
	private String insuranceCd;
	private String insuranceCd2;
	private int fuyoFlg;
	private int genderFlg;
    private Timestamp expDt;
    private String receiptDate;
	private int[] mdNo;
	
	public String getPtName() {
		return ptName;
	}
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	public Timestamp getBirthdayDt() {
		return birthdayDt;
	}
	public void setBirthdayDt(Timestamp birthdayDt) {
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
	public int getGenderFlg() {
		return genderFlg;
	}
	public void setGenderFlg(int genderFlg) {
		this.genderFlg = genderFlg;
	}
	public Timestamp getExpDt() {
		return expDt;
	}
	public void setExpDt(Timestamp expDt) {
		this.expDt = expDt;
	}
	public String getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	public int[] getMdNo() {
		return mdNo;
	}
	public void setMdNo(int[] mdNo) {
		this.mdNo = mdNo;
	}
	
}
