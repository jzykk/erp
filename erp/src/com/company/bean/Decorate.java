package com.company.bean;

/**
 * @author Davi
 * @category 装潢件信息表
 */
public class Decorate {
	/**
	 * 商品编号
	 */
	private int spid;

	/**
	 * 装潢名称
	 */
	private String decoratename;
	/**
	 * 类型Id
	 */
	private int typeid;
	/**
	 * 装潢 编号
	 */
	private int id;

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public String getDecoratename() {
		return decoratename;
	}

	public void setDecoratename(String decoratename) {
		this.decoratename = decoratename;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Decorate(int spid, String decoratename, int typeid, int id) {
		super();
		this.spid = spid;
		this.decoratename = decoratename;
		this.typeid = typeid;
		this.id = id;
	}

	public Decorate() {
		super();
	}

}
