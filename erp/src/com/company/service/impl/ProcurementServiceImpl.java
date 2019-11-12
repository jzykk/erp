package com.company.service.impl;

import java.util.List;

import com.company.bean.Car;
import com.company.bean.Procurement;
import com.company.dao.ICarDao;
import com.company.dao.IProcurementDao;
import com.company.dao.impl.CarDaoImpl;
import com.company.dao.impl.ProcurementDaoImpl;
import com.company.service.IProcurementService;

/**
 * @author Davi
 * @category 采购订单的业务逻辑实现类
 */
public class ProcurementServiceImpl implements IProcurementService {
	private IProcurementDao procurementDao = new ProcurementDaoImpl();

	@Override
	public List<Procurement> find() {
		return procurementDao.find();
	}

	@Override
	public Procurement find(String proid) {
		Procurement procurement = null;
		if (proid != null && !proid.equals("")) {
			int userId = Integer.valueOf(proid);
			procurement = procurementDao.find(userId);
		}
		return procurement;
	}

	@Override
	public Procurement findById(String id) {
		int id1 = Integer.valueOf(id);
		return procurementDao.findById(id1);
	}

	@Override
	public boolean add(Procurement procurement) {
		return procurementDao.add(procurement) > 0 ? true : false;
	}

	@Override
	public boolean update(Procurement procurement) {
		return procurementDao.add(procurement) > 0 ? true : false;
	}

	@Override
	public boolean delete(String proid) {
		int proid1 = Integer.valueOf(proid);
		return procurementDao.delete(proid1) > 0 ? true : false;

	}
}