package com.company.bean;

import java.sql.Date;

/**
 * @author yd
 * @category 订单类
 */
public class Indent {
	/**
	 *订单编号
	 */
	private int indentId;
	/**
	 * 状态Id
	 */
	private int stateId;/**
	 * 商品编号
	 */
	private int spid;
	/**
	 * 客户编号
	 */
	private int clientid;
	/**
	 * 员工编号
	 */
	private int id;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Indent(int indentId, int stateId, int spid, int clientid, int id, Date indentdate, String insurance,
			int transaction_price) {
		super();
		this.indentId = indentId;
		this.stateId = stateId;
		this.spid = spid;
		this.clientid = clientid;
		this.id = id;
		this.indentdate = indentdate;
		this.insurance = insurance;
		this.transaction_price = transaction_price;
	}
	public Indent() {
		super();
	}
	
	
}
