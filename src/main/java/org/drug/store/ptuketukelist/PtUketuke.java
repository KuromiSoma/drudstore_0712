package org.drug.store.ptuketukelist;

import lombok.Data;

@Data
public class PtUketuke {
	private int ukeNo;
    private String receiptDate;
    private String hpName;
	private String drName;
	public int getUkeNo() {
		return ukeNo;
	}
	public void setUkeNo(int ukeNo) {
		this.ukeNo = ukeNo;
	}
	public String getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	public String getHpName() {
		return hpName;
	}
	public void setHpName(String hpName) {
		this.hpName = hpName;
	}
	public String getDrName() {
		return drName;
	}
	public void setDrName(String drName) {
		this.drName = drName;
	}
	
}
