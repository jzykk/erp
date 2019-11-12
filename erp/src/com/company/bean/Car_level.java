package com.company.bean;

/**
 * @author Davi
 * @category 车辆配置表
 */
public class Car_level {
	
    /**
     * 配置ID
     */
    private int levelId;
    
    /**
     * 配置名称
     */
    private String levelname;

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

	public Car_level(int levelId, String levelname) {
		super();
		this.levelId = levelId;
		this.levelname = levelname;
	}

	public Car_level() {
		super();
	}
    
}
