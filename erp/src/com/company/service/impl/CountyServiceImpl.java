package com.company.service.impl;

import java.util.List;

import org.junit.Test;

import com.company.bean.County;
import com.company.bean.Province;
import com.company.dao.ICountyDao;
import com.company.dao.impl.CountyDaoImpl;
import com.company.service.ICountyService;

/**
 * @author 金子阳
 * @category 区业务逻辑实现类
 */
public class CountyServiceImpl implements ICountyService {

	private ICountyDao countyDao = new CountyDaoImpl();
	
	@Test
	public void test1() {

		System.out.println(findObject("110101").getAreaID());
	}

	
	public List<County> findAreasByCid(String cityId) {
		List<County> list = null;
		if (cityId != null) {
			list = countyDao.findAreasByCid(cityId);
		}
		return list;
	}

	public County findObject(String areaId) {
		County county = null;
		if (areaId != null && !areaId.equals("")) {
			county = countyDao.findObject(areaId);
		}
		return county;
	}

}
