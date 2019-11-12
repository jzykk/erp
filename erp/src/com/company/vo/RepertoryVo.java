package com.company.vo;

/**
 * @author Davi
 * @category RepertoryVo
 */
public class RepertoryVo {
	/**
	 * 商品ID
	 */
	private int spid;
	/**
	 * 商品名称
	 */
	private String spname;
	/**
	 * 库存数量
	 */
	private int repertorynum;

	public RepertoryVo() {
		super();
	}

	public RepertoryVo(int spid, String spname, int repertorynum) {
		super();
		this.spid = spid;
		this.spname = spname;
		this.repertorynum = repertorynum;
	}

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public String getSpname() {
		return spname;
	}

	public void setSpname(String spname) {
		this.spname = spname;
	}

	public int getRepertorynum() {
		return repertorynum;
	}

	public void setRepertorynum(int repertorynum) {
		this.repertorynum = repertorynum;
	}

}
