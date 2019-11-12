package com.company.service.impl;

import java.util.List;

import com.company.bean.Financial_statistics;
import com.company.dao.IFinancial_statisticsDao;
import com.company.dao.impl.Financial_statisticsDaoImpl;
import com.company.service.IFinancial_statisticsService;

public class Financial_statisticsServiceImpl implements IFinancial_statisticsService {
	private IFinancial_statisticsDao financial_statisticsDao = new  Financial_statisticsDaoImpl();
	@Override
	public List<Financial_statistics> find() {
		return financial_statisticsDao.find();
	}

	@Override
	public boolean add(Financial_statistics financial_statistics) {
		return financial_statisticsDao.add(financial_statistics)>0?true:false;
	}

}
