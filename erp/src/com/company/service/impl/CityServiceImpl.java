package com.company.service.impl;

import java.util.List;

import org.junit.Test;

import com.company.bean.City;
import com.company.bean.County;
import com.company.dao.ICityDao;
import com.company.dao.impl.CityDaoImpl;
import com.company.service.ICityService;

/**
 * @author 金子阳
 * @category 市业务逻辑实现类
 */
public class CityServiceImpl implements ICityService {

	private ICityDao cityDao = new CityDaoImpl();
	
	@Test
	public void test1() {

		System.out.println(findObject("110100").getCityID());
	}

	public List<City> findCitiesByPid(String provinceId) {
		List<City> list = null;
		if (provinceId != null) {
			list = cityDao.findCitiesByPid(provinceId);
		}
		return list;
	}
//
//	@Test
//	public void test() {
//		City city = findObject("450200");
//		System.out.println(city);
//	}

	public City findObject(String cityId) {
		City city = null;
		if (cityId != null && !cityId.equals("")) {
			city = cityDao.findObject(cityId);
		}
		return city;
	}
}
