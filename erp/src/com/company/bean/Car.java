package com.company.bean;

/**
 * @author yd
 * @category 商品车类
 */
public class Car {
	/**
	 * 商品编号
	 */
	private int spid;
	/**
	 * 类型编号
	 */
	private int typeid;
	/**
	 * 颜色编号
	 */
	private int colorId;
	/**
	 * 型号ID
	 */
	private int modelId;
	/**
	 *配置Id 
	 */
	private int levelId;
	/**
	 * 车Id
	 */
	private int id;
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public int getColorId() {
		return colorId;
	}
	public void setColorId(int colorId) {
		this.colorId = colorId;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public int getLevelId() {
		return levelId;
	}
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Car(int spid, int typeid, int colorId, int modelId, int levelId, int id) {
		super();
		this.spid = spid;
		this.typeid = typeid;
		this.colorId = colorId;
		this.modelId = modelId;
		this.levelId = levelId;
		this.id = id;
	}
	public Car() {
		super();
	}
	
	
}
