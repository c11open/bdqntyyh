package cn.bdqn.entity;

import java.io.Serializable;

public class BIZ_CLAIM_VOUCHER_DETAIL implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1268176421066264514L;
	private Integer id;
	private Integer MAIN_ID;
	private String ITEM;
	private Integer ACCOUNT;
	private String DES;
	public BIZ_CLAIM_VOUCHER_DETAIL(){}
	public BIZ_CLAIM_VOUCHER_DETAIL(Integer id, Integer mAIN_ID, String iTEM,
			Integer aCCOUNT, String dES) {
		super();
		this.id = id;
		MAIN_ID = mAIN_ID;
		ITEM = iTEM;
		ACCOUNT = aCCOUNT;
		DES = dES;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMAIN_ID() {
		return MAIN_ID;
	}
	public void setMAIN_ID(Integer mAIN_ID) {
		MAIN_ID = mAIN_ID;
	}
	public String getITEM() {
		return ITEM;
	}
	public void setITEM(String iTEM) {
		ITEM = iTEM;
	}
	public Integer getACCOUNT() {
		return ACCOUNT;
	}
	public void setACCOUNT(Integer aCCOUNT) {
		ACCOUNT = aCCOUNT;
	}
	public String getDES() {
		return DES;
	}
	public void setDES(String dES) {
		DES = dES;
	}
	
}
