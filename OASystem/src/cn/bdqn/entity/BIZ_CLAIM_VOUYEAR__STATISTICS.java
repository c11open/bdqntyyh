package cn.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class BIZ_CLAIM_VOUYEAR__STATISTICS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3766172574620798370L;
	private Integer id;
	private Integer TOTAL_COUNT;
	private Integer YEAR;
	private Date MODIFY_TIME;
	private Integer DEPARTMENT_ID;
	public BIZ_CLAIM_VOUYEAR__STATISTICS(){}
	public BIZ_CLAIM_VOUYEAR__STATISTICS(Integer id, Integer tOTAL_COUNT,
			Integer yEAR, Date mODIFY_TIME, Integer dEPARTMENT_ID) {
		super();
		this.id = id;
		TOTAL_COUNT = tOTAL_COUNT;
		YEAR = yEAR;
		MODIFY_TIME = mODIFY_TIME;
		DEPARTMENT_ID = dEPARTMENT_ID;
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
	public Date getMODIFY_TIME() {
		return MODIFY_TIME;
	}
	public void setMODIFY_TIME(Date mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}
	public Integer getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	public void setDEPARTMENT_ID(Integer dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	
}
