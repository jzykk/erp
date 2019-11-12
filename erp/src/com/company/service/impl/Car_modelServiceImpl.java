package com.company.service.impl;

import java.util.List;

import com.company.bean.Car_model;
import com.company.dao.ICar_modelDao;
import com.company.dao.impl.Car_modelDaoImpl;
import com.company.service.ICar_modelService;

public class Car_modelServiceImpl implements ICar_modelService {
	private ICar_modelDao car_modelDao = new Car_modelDaoImpl();
	@Override
	public List<Car_model> find() {
		return car_modelDao.find();
	}

	@Override
	public boolean add(Car_model car_model) {
		return car_modelDao.add(car_model)>0?true:false;
	}

	@Override
	public Car_model find(String modelId) {
		Car_model car_model=null;
		if (modelId!=null&&modelId!="") {
			int mId=Integer.valueOf(modelId);
			 car_model=car_modelDao.find(mId);
		}
		
		return car_model;
	}

}
