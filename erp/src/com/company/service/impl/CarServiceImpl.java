package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Car;
import com.company.bean.Car_level;
import com.company.bean.Car_model;
import com.company.bean.Color;
import com.company.bean.Type;
import com.company.bean.User;
import com.company.dao.ICarDao;
import com.company.dao.ICar_levelDao;
import com.company.dao.ICar_modelDao;
import com.company.dao.IColorDao;
import com.company.dao.ITypeDao;
import com.company.dao.impl.CarDaoImpl;
import com.company.dao.impl.Car_levelDaoImpl;
import com.company.dao.impl.Car_modelDaoImpl;
import com.company.dao.impl.ColorDaoImpl;
import com.company.dao.impl.TypeDaoImpl;
import com.company.service.ICarService;
import com.company.vo.CarVo;
import com.sun.media.sound.ModelIdentifier;

public class CarServiceImpl implements ICarService {
	private ICarDao carDao = new CarDaoImpl();
	private ITypeDao TypeDao = new TypeDaoImpl();
	private IColorDao ColorDao = new ColorDaoImpl();
	private ICar_modelDao ModelDao = new Car_modelDaoImpl();
	private ICar_levelDao LevelDao = new Car_levelDaoImpl();

	@Override
	public List<CarVo> find() {
		List<CarVo> list = new ArrayList<CarVo>();
		List<Car> list2 = carDao.find();
		Change(list, list2);
		return list;
	}

	private void Change(List<CarVo> list, List<Car> list2) {
		for (Car car : list2) {
			Type type = TypeDao.find(car.getTypeid());
			Color color = ColorDao.find(car.getColorId());
			Car_model model = ModelDao.find(car.getModelId());
			Car_level car_level = LevelDao.find(car.getLevelId());
			CarVo carVo = new CarVo(car.getSpid(), type.getTypename(), color.getColor(), model.getModel(),
					car_level.getLevelname());
			list.add(carVo);
		}
	}

	private CarVo Change(CarVo carvo, Car car2) {

		Type type = TypeDao.find(car2.getTypeid());
		Color color = ColorDao.find(car2.getColorId());
		Car_model model = ModelDao.find(car2.getModelId());
		Car_level car_level = LevelDao.find(car2.getLevelId());
		System.out.println(type);
		System.out.println(color);
		System.out.println(model);
		System.out.println(car_level);
		carvo = new CarVo(car2.getSpid(), type.getTypename(), color.getColor(), model.getModel(),
				car_level.getLevelname());
		return carvo;
	}

	@Test
	public void test1() {
		CarVo carvo = find("1002");
		System.out.println(carvo);

	}

	@Override
	public CarVo find(String spid) {
		int spid1 = Integer.valueOf(spid);
		CarVo carvo = null;
		Car car2 = carDao.find(spid1);

		return Change(carvo, car2);
	}

	@Override
	public List<Car> findByMId(int modelId) {
		return carDao.findByMId(modelId);
	}

	@Override
	public boolean add(Car car) {
		return carDao.add(car) > 0 ? true : false;
	}

	@Override
	public boolean delete(String spid) {
		int carId = Integer.valueOf(spid);
		return carDao.delete(carId) > 0 ? true : false;
	}

}
