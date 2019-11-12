package com.company.service.impl;

import java.util.List;

import com.company.bean.Car;
import com.company.bean.Color;
import com.company.dao.IClientKindDao;
import com.company.dao.IColorDao;
import com.company.dao.impl.ClientKindDaoImpl;
import com.company.dao.impl.ColorDaoImpl;
import com.company.service.IColorService;

public class ColorServiceImpl implements IColorService {
	private IColorDao colorDao = new ColorDaoImpl();
	@Override
	public List<Color> find() {
		return colorDao.find();
	}

	@Override
	public Color find(String cololId) {
		Color color = null;
		if (cololId != null && !cololId.equals("")) {
			int userId1 = Integer.valueOf(cololId);
			color = colorDao.find(userId1);
		}
		return color;
	}

	@Override
	public boolean add(Color color) {
		return colorDao.add(color)>0?true:false;
	}

}
