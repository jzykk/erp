package com.company.vo;

public class ClientVo {
	/**
	 * 客户编号
	 */
	private int clientid;

	/**
	 * 类型编号
	 */
	private int kid;
	/**
	 * 类型名称
	 */
	private String kname;

	/**
	 * 客户姓名
	 */
	private String clientname;
	/**
	 * 客户性别
	 */
	private String csex;
	/**
	 * 客户住址
	 */
	private String caddress;
	/**
	 * 身份证号
	 */
	private String ccardid;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 员工用户id
	 */
	private int id;
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
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
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCcardid() {
		return ccardid;
	}
	public void setCcardid(String ccardid) {
		this.ccardid = ccardid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ClientVo(int clientid, int kid, String kname, String clientname, String csex, String caddress,
			String ccardid, String phone, int id) {
		super();
		this.clientid = clientid;
		this.kid = kid;
		this.kname = kname;
		this.clientname = clientname;
		this.csex = csex;
		this.caddress = caddress;
		this.ccardid = ccardid;
		this.phone = phone;
		this.id = id;
	}
	public ClientVo() {
		super();
	}
	
}
