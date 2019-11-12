package com.company.bean;

/**
 * @author Davi
 * @category 商品表
 */
public class Price {
	/**
	 * 商品ID
	 */
	private int spid;
	/**
	 * 价格
	 */
	private int price;

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Price(int spid, int price) {
		super();
		this.spid = spid;
		this.price = price;
	}

	public Price() {
		super();
	}

}
