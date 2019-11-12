package com.company.vo;

public class CarVo {
	/**
	 * 商品编号
	 */
	private int spid;
	/**
	 * 类型编号
	 */
	private int typeid;
	/**
	 * 类型名称
	 */
	private String typename;
	/**
	 * 颜色编号
	 */
	private int colorId;
	/**
	 * 颜色
	 */
	private String colorname;
	/**
	 * 型号ID
	 */
	private int modelId;
	/**
	 * 型号名称
	 */
	private String modelname;
	/**
	 *配置Id 
	 */
	private int levelId;
	/**
     * 配置名称
     */
    private String levelname;
	/**
	 * 车Id
	 */
	private int id;
	public CarVo(int spid, int typeid, String typename, int colorId, String colorname, int modelId, String modelname,
			int levelId, String levelname, int id) {
		super();
		this.spid = spid;
		this.typeid = typeid;
		this.typename = typename;
		this.colorId = colorId;
		this.colorname = colorname;
		this.modelId = modelId;
		this.modelname = modelname;
		this.levelId = levelId;
		this.levelname = levelname;
		this.id = id;
	}
	public CarVo(int spid, String typename, String colorname, String modelname, String levelname) {
		super();
		this.spid = spid;
		this.typename = typename;
		this.colorname = colorname;
		this.modelname = modelname;
		this.levelname = levelname;
	}
	public CarVo() {
		super();
	}
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
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public int getColorId() {
		return colorId;
	}
	public void setColorId(int colorId) {
		this.colorId = colorId;
	}
	public String getColorname() {
		return colorname;
	}
	public void setColorname(String colorname) {
		this.colorname = colorname;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getLevelId() {
		return levelId;
	}
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	public String getLevelname() {
		return levelname;
	}
	public void setLevelname(String levelname) {
		this.levelname = levelname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
