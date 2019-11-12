package com.company.vo;

import java.sql.Date;

/**
 * @author yd
 * @category 订单类vo
 */
public class IndentVo {
	/**
	 *订单编号
	 */
	private int indentId;
	/**
	 * 状态Id
	 */
	private int stateId;
	/**
	 * 状态名称
	 */
	private String statename;
	/**
	 * 商品编号
	 */
	private int spid;
	 
	/**
	 * 客户编号
	 */
	private int clientid;
	/**
	 * 客户姓名
	 */
	private String clientname;
	/**
	 * 员工编号
	 */
	private int id;
	/**
	 * 员工名字
	 */
	private String name;
	
	/**
	 * 签订日期
	 */
	private Date indentdate;
	/**
	 * 保险
	 */
	private String insurance;
	/**
	 * 成交价
	 */
	private int transaction_price;
	public int getIndentId() {
		return indentId;
	}
	public void setIndentId(int indentId) {
		this.indentId = indentId;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getIndentdate() {
		return indentdate;
	}
	public void setIndentdate(Date indentdate) {
		this.indentdate = indentdate;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public int getTransaction_price() {
		return transaction_price;
	}
	public void setTransaction_price(int transaction_price) {
		this.transaction_price = transaction_price;
	}
	public IndentVo(int indentId, int stateId, String statename, int spid,  int clientid,
			String clientname, int id, String name, Date indentdate, String insurance, int transaction_price) {
		super();
		this.indentId = indentId;
		this.stateId = stateId;
		this.statename = statename;
		this.spid = spid;
		
		this.clientid = clientid;
		this.clientname = clientname;
		this.id = id;
		this.name = name;
		this.indentdate = indentdate;
		this.insurance = insurance;
		this.transaction_price = transaction_price;
	}
	public IndentVo() {
		super();
	}
	
	

}
