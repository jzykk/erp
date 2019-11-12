package com.company.bean;

import java.sql.Date;

/**
 * @author Davi
 * @category 财务统计表
 */
public class Financial_statistics {
	/**
	 * 统计ID
	 */
	private int finId;
	/**
	 * 商品ID
	 */
	private int spid;
	/**
	 * 商品数量
	 */
	private int spNum;
	/**
	 * 成交价
	 */
	private int price;
	/**
	 * 销售日期
	 */
	private Date saledate;

	public int getFinId() {
		return finId;
	}

	public void setFinId(int finId) {
		this.finId = finId;
	}

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public int getSpNum() {
		return spNum;
	}

	public void setSpNum(int spNum) {
		this.spNum = spNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getSaledate() {
		return saledate;
	}

	public void setSaledate(Date saledate) {
		this.saledate = saledate;
	}

	public Financial_statistics(int finId, int spid, int spNum, int price, Date saledate) {
		super();
		this.finId = finId;
		this.spid = spid;
		this.spNum = spNum;
		this.price = price;
		this.saledate = saledate;
	}

	public Financial_statistics() {
		super();
	}

}
