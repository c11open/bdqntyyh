package cn.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class BIZ_LEAVE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1163211954501076493L;
	private Integer id;
	private String EMPLOYEE_SN;
	private Date STARTTIME;
	private Date ENDTIME;
	private Integer LEAVEDAY;
	private String REASON;
	private String STATUS;
	private String LEAVETYPE;
	private String NEXT_DEAL_SN;
	private String APPROVE_OPINION;
	private Date CREATETIME;
	private Date MODIFYTIME;
	public BIZ_LEAVE(){}
	public BIZ_LEAVE(Integer id, String eMPLOYEE_SN, Date sTARTTIME,
			Date eNDTIME, Integer lEAVEDAY, String rEASON, String sTATUS,
			String lEAVETYPE, String nEXT_DEAL_SN, String aPPROVE_OPINION,
			Date cREATETIME, Date mODIFYTIME) {
		super();
		this.id = id;
		EMPLOYEE_SN = eMPLOYEE_SN;
		STARTTIME = sTARTTIME;
		ENDTIME = eNDTIME;
		LEAVEDAY = lEAVEDAY;
		REASON = rEASON;
		STATUS = sTATUS;
		LEAVETYPE = lEAVETYPE;
		NEXT_DEAL_SN = nEXT_DEAL_SN;
		APPROVE_OPINION = aPPROVE_OPINION;
		CREATETIME = cREATETIME;
		MODIFYTIME = mODIFYTIME;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEMPLOYEE_SN() {
		return EMPLOYEE_SN;
	}
	public void setEMPLOYEE_SN(String eMPLOYEE_SN) {
		EMPLOYEE_SN = eMPLOYEE_SN;
	}
	public Date getSTARTTIME() {
		return STARTTIME;
	}
	public void setSTARTTIME(Date sTARTTIME) {
		STARTTIME = sTARTTIME;
	}
	public Date getENDTIME() {
		return ENDTIME;
	}
	public void setENDTIME(Date eNDTIME) {
		ENDTIME = eNDTIME;
	}
	public Integer getLEAVEDAY() {
		return LEAVEDAY;
	}
	public void setLEAVEDAY(Integer lEAVEDAY) {
		LEAVEDAY = lEAVEDAY;
	}
	public String getREASON() {
		return REASON;
	}
	public void setREASON(String rEASON) {
		REASON = rEASON;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getLEAVETYPE() {
		return LEAVETYPE;
	}
	public void setLEAVETYPE(String lEAVETYPE) {
		LEAVETYPE = lEAVETYPE;
	}
	public String getNEXT_DEAL_SN() {
		return NEXT_DEAL_SN;
	}
	public void setNEXT_DEAL_SN(String nEXT_DEAL_SN) {
		NEXT_DEAL_SN = nEXT_DEAL_SN;
	}
	public String getAPPROVE_OPINION() {
		return APPROVE_OPINION;
	}
	public void setAPPROVE_OPINION(String aPPROVE_OPINION) {
		APPROVE_OPINION = aPPROVE_OPINION;
	}
	public Date getCREATETIME() {
		return CREATETIME;
	}
	public void setCREATETIME(Date cREATETIME) {
		CREATETIME = cREATETIME;
	}
	public Date getMODIFYTIME() {
		return MODIFYTIME;
	}
	public void setMODIFYTIME(Date mODIFYTIME) {
		MODIFYTIME = mODIFYTIME;
	}
	
}
