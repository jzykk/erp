package com.company.bean;

/**
 * @author yd
 * @category 商品类型类
 */
public class Type {
	 /**
	 * 类型编号
	 */
	private int typeid;
	
	 /**
	 * 类型名称
	 */
	private String typename;
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
	public Type(int typeid, String typename) {
		super();
		this.typeid = typeid;
		this.typename = typename;
	}
	public Type() {
		super();
	}
	 
	 
}
