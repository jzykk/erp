package com.company.bean;

/**
 * @author yd
 *@category 职务类
 */
public class Duty {
	/**
	 * 职务编号
	 */
	private int did;
	/**
	 * 名字
	 */
	private String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Duty(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Duty() {
		super();
	}
	
	
}
