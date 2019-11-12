package com.company.bean;

/**
 * @author Davi
 * @category 省表
 */
public class Province {
	/**
	 * Id
	 */
	private int id;
    /**
     * 省份ID
     */
    private String provinceID;
    /**
     * 省份
     */
    private String province;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinceID() {
		return provinceID;
	}
	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Province(int id, String provinceID, String province) {
		super();
		this.id = id;
		this.provinceID = provinceID;
		this.province = province;
	}
	public Province() {
		super();

	}
    
}
