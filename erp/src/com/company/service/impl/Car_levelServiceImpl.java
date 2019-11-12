package com.company.service.impl;

import java.util.List;

import com.company.bean.Car_level;
import com.company.dao.ICar_levelDao;
import com.company.dao.impl.Car_levelDaoImpl;
import com.company.service.ICar_levelService;

public class Car_levelServiceImpl implements ICar_levelService {
	private ICar_levelDao car_levelDao= new Car_levelDaoImpl(); 
	@Override
	public List<Car_level> find() {
		return car_levelDao.find();
	}

	@Override
	public boolean add(Car_level car_level) {
		return car_levelDao.add(car_level)>0?true:false;
	}

}
