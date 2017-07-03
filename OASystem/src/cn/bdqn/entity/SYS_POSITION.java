package cn.bdqn.entity;

import java.io.Serializable;

public class SYS_POSITION implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3258308868738460573L;
	private Integer id;
	private String NAME_CN;
	private String NAME_EN;
	public SYS_POSITION(){}
	public SYS_POSITION(Integer id, String nAME_CN, String nAME_EN) {
		super();
		this.id = id;
		NAME_CN = nAME_CN;
		NAME_EN = nAME_EN;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNAME_CN() {
		return NAME_CN;
	}
	public void setNAME_CN(String nAME_CN) {
		NAME_CN = nAME_CN;
	}
	public String getNAME_EN() {
		return NAME_EN;
	}
	public void setNAME_EN(String nAME_EN) {
		NAME_EN = nAME_EN;
	}
	
	
}
