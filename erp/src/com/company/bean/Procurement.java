package com.company.bean;

import java.sql.Date;

/**
 * @author yd
 * @category 采购订单类
 *
 */
public class Procurement {
	/**
	 * 进单编号
	 */
	private int proid;
	
	/**
	 * 商品Id
	 */
	private int spid;
	/**
	 * 员工编号
	 */
	private int id;
	/**
	 * 采购数量
	 */
	private int proNum;
	/**
	 * 进货价格
	 */
	private int proprice;
	/**
	 * 进货日期
	 */
	private Date prodate;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProNum() {
		return proNum;
	}
	public void setProNum(int proNum) {
		this.proNum = proNum;
	}
	public int getProprice() {
		return proprice;
	}
	public void setProprice(int proprice) {
		this.proprice = proprice;
	}
	public Date getProdate() {
		return prodate;
	}
	public void setProdate(Date prodate) {
		this.prodate = prodate;
	}
	public Procurement(int proid, int spid, int id, int proNum, int proprice, Date prodate) {
		super();
		this.proid = proid;
		this.spid = spid;
		this.id = id;
		this.proNum = proNum;
		this.proprice = proprice;
		this.prodate = prodate;
	}
	public Procurement() {
		super();
	}
	
	
}
