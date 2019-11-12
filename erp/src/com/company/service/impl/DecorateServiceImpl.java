package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Car;
import com.company.bean.Decorate;
import com.company.bean.Type;
import com.company.dao.ICarDao;
import com.company.dao.IDecorateDao;
import com.company.dao.ITypeDao;
import com.company.dao.impl.CarDaoImpl;
import com.company.dao.impl.DecorateDaoImpl;
import com.company.dao.impl.TypeDaoImpl;
import com.company.service.IDecorateService;
import com.company.vo.DecorateVo;

public class DecorateServiceImpl implements IDecorateService {
	private IDecorateDao decorateDao = new DecorateDaoImpl();
	private ITypeDao typeDao = new TypeDaoImpl();

	@Override
	public List<DecorateVo> find() {
		List<DecorateVo> decorateVos = new ArrayList<DecorateVo>();
		List<Decorate> decorates = decorateDao.find();
		change(decorateVos, decorates);
		return decorateVos;
	}

	private void change(List<DecorateVo> decorateVos, List<Decorate> decorates) {
		for (Decorate decorate : decorates) {
			Type type = typeDao.find(decorate.getTypeid());
			String name = type.getTypename();
			DecorateVo decorateVo = new DecorateVo(decorate.getSpid(), decorate.getId(), decorate.getDecoratename(),
					decorate.getTypeid(), name);
			decorateVos.add(decorateVo);
		}
	}

	@Test
	public void test() {
		Decorate decorate = find("2001");
		System.out.println(decorate);
	}

	@Override
	public Decorate find(String spid) {
		Decorate decorate = null;
		if (spid != null && !spid.equals("")) {
			int spid1 = Integer.valueOf(spid);
			decorate = decorateDao.find(spid1);
		}
		return decorate;
	}

	@Override
	public boolean add(Decorate decorate) {
		return decorateDao.add(decorate) > 0 ? true : false;
	}

	@Override
	public boolean delete(String spid) {
		int spid1 = Integer.valueOf(spid);
		return decorateDao.delete(spid1) > 0 ? true : false;
	}

}
