package com.company.bean;

/**
 * @author Davi
 * @category 市表
 */
public class City {
	/**
	 * id
	 */
	private int id;
	/**
	 * 城市ID
	 */
	private String cityID;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 省份ID
	 */
	private String provinceID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityID() {
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}

	public City(int id, String cityID, String city, String provinceID) {
		super();
		this.id = id;
		this.cityID = cityID;
		this.city = city;
		this.provinceID = provinceID;
	}

	public City() {
		super();
	}

}
