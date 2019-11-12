package com.company.vo;

/**
 * @author yd
 * @category 装潢Vo
 *
 */
public class DecorateVo {
	/**
	 * 商品编号
	 */
	private int spid;
	/**
	 * 装潢 编号
	 */
	private int id;

	/**
	 * 装潢名称
	 */
	private String decoratename;
	/**
	 * 类型Id
	 */
	private int typeid;

	 /**
	 * 类型名称
	 */
	private String typename;

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

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public DecorateVo(int spid, int id, String decoratename, int typeid, String typename) {
		super();
		this.spid = spid;
		this.id = id;
		this.decoratename = decoratename;
		this.typeid = typeid;
		this.typename = typename;
	}

	public DecorateVo() {
		super();
	}
	
	

}
