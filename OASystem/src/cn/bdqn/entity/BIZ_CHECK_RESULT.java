package cn.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class BIZ_CHECK_RESULT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3229803601932059387L;
	private Integer id;
	private Integer CLAIM_ID;
	private Date CHECK_TIME;
	private String CHECKER_SN;
	private String RESULT;
	private String COMM;
	public BIZ_CHECK_RESULT(){}
	public BIZ_CHECK_RESULT(Integer id, Integer cLAIM_ID, Date cHECK_TIME,
			String cHECKER_SN, String rESULT, String cOMM) {
		super();
		this.id = id;
		CLAIM_ID = cLAIM_ID;
		CHECK_TIME = cHECK_TIME;
		CHECKER_SN = cHECKER_SN;
		RESULT = rESULT;
		COMM = cOMM;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCLAIM_ID() {
		return CLAIM_ID;
	}
	public void setCLAIM_ID(Integer cLAIM_ID) {
		CLAIM_ID = cLAIM_ID;
	}
	public Date getCHECK_TIME() {
		return CHECK_TIME;
	}
	public void setCHECK_TIME(Date cHECK_TIME) {
		CHECK_TIME = cHECK_TIME;
	}
	public String getCHECKER_SN() {
		return CHECKER_SN;
	}
	public void setCHECKER_SN(String cHECKER_SN) {
		CHECKER_SN = cHECKER_SN;
	}
	public String getRESULT() {
		return RESULT;
	}
	public void setRESULT(String rESULT) {
		RESULT = rESULT;
	}
	public String getCOMM() {
		return COMM;
	}
	public void setCOMM(String cOMM) {
		COMM = cOMM;
	}
	
}
