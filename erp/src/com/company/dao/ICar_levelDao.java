package com.company.dao;

import java.util.List;

import com.company.bean.Car_level;

/**
 * @author 金子阳
 * @category 车辆配置表的数据访问层
 *
 */
public interface ICar_levelDao {
	
	/**
	 * 查询所有的配置
	 * 
	 * @return
	 */
	public List<Car_level> find();

	/**
	 * 增加一种配置
	 * 
	 * @param car_level
	 * @return
	 */
	public int add(Car_level car_level);

	public Car_level find(int levelId);
}
