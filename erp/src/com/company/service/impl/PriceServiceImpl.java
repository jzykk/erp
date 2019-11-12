package com.company.service.impl;

import java.util.List;

import com.company.bean.Price;
import com.company.bean.User;
import com.company.dao.IPriceDao;
import com.company.dao.impl.PriceDaoImpl;
import com.company.service.IPriceService;

public class PriceServiceImpl implements IPriceService {
	private IPriceDao priceDao = new PriceDaoImpl();
	@Override
	public List<Price> find() {
		return priceDao.find();
	}

	@Override
	public Price find(String spid) {
		Price price = null;
		if (spid != null && !spid.equals("")) {
			int userId = Integer.valueOf(spid);
			price = priceDao.find(userId);
		}
		return price;
	}

}
