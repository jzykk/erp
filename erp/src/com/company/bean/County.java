package com.company.bean;

/**
 * @author Davi
 * @category 区县表
 */
public class County {
	/**
	 * id
	 */
	private int id;
	/**
	 * 地区ID
	 */
	private String areaID;
	/**
	 * 地区
	 */
	private String areas;
	/**
	 * 城市ID
	 */
	private String cityID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreaID() {
		return areaID;
	}

	public void setAreaID(String areaID) {
		this.areaID = areaID;
	}

	public String getAreas() {
		return areas;
	}

	public void setAreas(String areas) {
		this.areas = areas;
	}

	public String getCityID() {
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public County(int id, String areaID, String areas, String cityID) {
		super();
		this.id = id;
		this.areaID = areaID;
		this.areas = areas;
		this.cityID = cityID;
	}

	public County() {
		super();
	}

}
