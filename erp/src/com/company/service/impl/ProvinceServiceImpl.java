package com.company.service.impl;

import java.util.List;

import org.junit.Test;

import com.company.bean.Car;
import com.company.bean.Province;
import com.company.dao.IProvinceDao;
import com.company.dao.impl.ProvinceDaoImpl;
import com.company.service.IProvinceService;

/**
 * @author 金子阳
 * @category 省业务逻辑实现类
 */
public class ProvinceServiceImpl implements IProvinceService {

	private IProvinceDao provinceDao = new ProvinceDaoImpl();

	// @Test
	// public void test(){
	// for (Province p: findAll()) {
	// System.out.println(p.getProvince());
	// }
	// }

	@Test
	public void test1() {

		System.out.println(findObject("110000").getProvince());
	}

	@Override
	public List<Province> findAll() {
		return provinceDao.findAll();
	}

	@Override
	public Province findObject(String provinceId) {
		Province province = null;
		if (provinceId != null && !provinceId.equals("")) {

			province = provinceDao.findObject(provinceId);
		}
		return province;
	}

}
