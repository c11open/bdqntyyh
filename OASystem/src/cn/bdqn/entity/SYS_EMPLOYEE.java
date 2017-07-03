package cn.bdqn.entity;

import java.io.Serializable;

public class SYS_EMPLOYEE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7093855882012115312L;
	private String Sn;
	private Integer POSITION_ID;
	private Integer DEPARTMENT_ID;
	private String Name;
	private String Password;
	private String Status;
	public SYS_EMPLOYEE(){}
	public SYS_EMPLOYEE(String sn, Integer pOSITION_ID, Integer dEPARTMENT_ID,
			String name, String password, String status) {
		super();
		Sn = sn;
		POSITION_ID = pOSITION_ID;
		DEPARTMENT_ID = dEPARTMENT_ID;
		Name = name;
		Password = password;
		Status = status;
	}
	public String getSn() {
		return Sn;
	}
	public void setSn(String sn) {
		Sn = sn;
	}
	public Integer getPOSITION_ID() {
		return POSITION_ID;
	}
	public void setPOSITION_ID(Integer pOSITION_ID) {
		POSITION_ID = pOSITION_ID;
	}
	public Integer getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	public void setDEPARTMENT_ID(Integer dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
}
