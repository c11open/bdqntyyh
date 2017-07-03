package cn.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class BIZ_CLAIM_VOUCHER implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8362022434925209160L;
	private Integer id;
	private String NEXT_DEAL_SN;
	private String CREATE_SN;
	private Date CREATE_TIME;
	private String EVENT;
	private Integer TOTAL_ACCOUNT;
	private String STATUS;
	private Date MODIFY_TIME;
	public BIZ_CLAIM_VOUCHER(){}
	public BIZ_CLAIM_VOUCHER(Integer id, String nEXT_DEAL_SN, String cREATE_SN,
			Date cREATE_TIME, String eVENT, Integer tOTAL_ACCOUNT,
			String sTATUS, Date mODIFY_TIME) {
		super();
		this.id = id;
		NEXT_DEAL_SN = nEXT_DEAL_SN;
		CREATE_SN = cREATE_SN;
		CREATE_TIME = cREATE_TIME;
		EVENT = eVENT;
		TOTAL_ACCOUNT = tOTAL_ACCOUNT;
		STATUS = sTATUS;
		MODIFY_TIME = mODIFY_TIME;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNEXT_DEAL_SN() {
		return NEXT_DEAL_SN;
	}
	public void setNEXT_DEAL_SN(String nEXT_DEAL_SN) {
		NEXT_DEAL_SN = nEXT_DEAL_SN;
	}
	public String getCREATE_SN() {
		return CREATE_SN;
	}
	public void setCREATE_SN(String cREATE_SN) {
		CREATE_SN = cREATE_SN;
	}
	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}
	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}
	public String getEVENT() {
		return EVENT;
	}
	public void setEVENT(String eVENT) {
		EVENT = eVENT;
	}
	public Integer getTOTAL_ACCOUNT() {
		return TOTAL_ACCOUNT;
	}
	public void setTOTAL_ACCOUNT(Integer tOTAL_ACCOUNT) {
		TOTAL_ACCOUNT = tOTAL_ACCOUNT;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public Date getMODIFY_TIME() {
		return MODIFY_TIME;
	}
	public void setMODIFY_TIME(Date mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}
	
}
