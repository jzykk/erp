package com.company.bean;

/**
 * @author yd
 * @category 客户类型表
 */
public class ClientKind {
	/**
	 * 类型编号
	 */
	private int kid;
	/**
	 * 类型名称
	 */
	private String kname;
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public ClientKind(int kid, String kname) {
		super();
		this.kid = kid;
		this.kname = kname;
	}
	public ClientKind() {
		super();
	}
	
	
}
