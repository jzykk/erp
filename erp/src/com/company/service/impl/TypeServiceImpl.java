package com.company.service.impl;

import java.util.List;

import com.company.bean.Price;
import com.company.bean.Type;
import com.company.dao.ITypeDao;
import com.company.dao.impl.TypeDaoImpl;
import com.company.service.ITypeService;

public class TypeServiceImpl implements ITypeService {
	private ITypeDao typeDao = new TypeDaoImpl();
	@Override
	public List<Type> find() {
		return typeDao.find();
	}

	@Override
	public Type find(String typeid) {
		Type type = null;
		if (typeid != null && !typeid.equals("")) {
			int typeId = Integer.valueOf(typeid);
			type = typeDao.find(typeId);
		}
		return type;
	}

}
