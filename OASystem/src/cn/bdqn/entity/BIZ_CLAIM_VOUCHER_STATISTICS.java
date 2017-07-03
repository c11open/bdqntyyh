package cn.bdqn.entity;

import java.io.Serializable;

public class BIZ_CLAIM_VOUCHER_STATISTICS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9019992584743574210L;
	private Integer id;
	private Integer TOTAL_COUNT;
	private Integer YEAR;
	private Integer MONTH;
	private Integer DEPARTMENT_ID;
	private Integer MODIFY_TIME;
	public BIZ_CLAIM_VOUCHER_STATISTICS(){}
	public BIZ_CLAIM_VOUCHER_STATISTICS(Integer id, Integer tOTAL_COUNT,
			Integer yEAR, Integer mONTH, Integer dEPARTMENT_ID,
			Integer mODIFY_TIME) {
		super();
		this.id = id;
		TOTAL_COUNT = tOTAL_COUNT;
		YEAR = yEAR;
		MONTH = mONTH;
		DEPARTMENT_ID = dEPARTMENT_ID;
		MODIFY_TIME = mODIFY_TIME;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTOTAL_COUNT() {
		return TOTAL_COUNT;
	}
	public void setTOTAL_COUNT(Integer tOTAL_COUNT) {
		TOTAL_COUNT = tOTAL_COUNT;
	}
	public Integer getYEAR() {
		return YEAR;
	}
	public void setYEAR(Integer yEAR) {
		YEAR = yEAR;
	}
	public Integer getMONTH() {
		return MONTH;
	}
	public void setMONTH(Integer mONTH) {
		MONTH = mONTH;
	}
	public Integer getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	public void setDEPARTMENT_ID(Integer dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	public Integer getMODIFY_TIME() {
		return MODIFY_TIME;
	}
	public void setMODIFY_TIME(Integer mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}
	
}
