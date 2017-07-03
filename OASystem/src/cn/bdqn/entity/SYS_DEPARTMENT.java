package cn.bdqn.entity;

import java.io.Serializable;

public class SYS_DEPARTMENT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7157148226168477732L;
	private Integer id;
	private String Name;
	public SYS_DEPARTMENT(){}
	public SYS_DEPARTMENT(Integer id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
