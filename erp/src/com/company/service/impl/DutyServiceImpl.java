package com.company.service.impl;

import java.util.List;

import com.company.bean.Duty;
import com.company.bean.User;
import com.company.dao.IDutyDao;
import com.company.dao.impl.DutyDaoImpl;
import com.company.service.IDutyService;

public class DutyServiceImpl implements IDutyService {
	private IDutyDao dutyDao = new DutyDaoImpl();
	@Override
	public List<Duty> find() {
		
		return dutyDao.find();
	}

	@Override
	public Duty find(String did) {
		
		Duty duty = null;
		if (did != null && !did.equals("")) {
			int userId = Integer.valueOf(did);
			duty = dutyDao.find(userId);
		}
		return duty;
	}

}
