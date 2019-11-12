package com.company.service;

import java.util.List;

import com.company.bean.Car_level;

/**
 * @author 金子阳
 * @category 车辆配置表的业务逻辑层
 */
public interface ICar_levelService {
	/**
	 * 查询所有的配置
	 * 
	 * @return
	 */
	public List<Car_level> find();
	/**
	 * 增加一种配置
	 * @param car_level
	 * @return
	 */
	public boolean add(Car_level car_level);
}
