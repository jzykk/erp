package com.company.bean;

/**
 * @author Davi
 * @category 库存表
 */
public class Repertory {
	/**
	 * 商品ID
	 */
	private int spid;
	/**
	 * 库存数量
	 */
	private int repertorynum;

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public int getRepertorynum() {
		return repertorynum;
	}

	public void setRepertorynum(int repertorynum) {
		this.repertorynum = repertorynum;
	}

	public Repertory(int spid, int repertorynum) {
		super();
		this.spid = spid;
		this.repertorynum = repertorynum;
	}

	public Repertory() {
		super();
	}

}
