package com.company.service;

import java.util.List;

import com.company.bean.Car;
import com.company.bean.Car_model;

/**
 * @author 金子阳
 * @category 车型号的业务逻辑层
 * 
 */
public interface ICar_modelService {
	/**
	 * 查询所有型号
	 * 
	 * @return
	 */
	public List<Car_model> find();

	/**
	 * 增加一种型号
	 * 
	 * @param car_model
	 * @return
	 */
	public boolean add(Car_model car_model);

	/**
	 * 查询型号名称
	 * 
	 * @param modelId
	 * @return
	 */
	public Car_model find(String modelId);
}
