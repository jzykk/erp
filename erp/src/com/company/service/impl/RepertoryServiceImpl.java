package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.company.bean.Car;
import com.company.bean.Car_model;
import com.company.bean.Decorate;
import com.company.bean.Procurement;
import com.company.bean.Repertory;
import com.company.dao.ICar_modelDao;
import com.company.dao.IProcurementDao;
import com.company.dao.IRepertoryDao;
import com.company.dao.impl.Car_modelDaoImpl;
import com.company.dao.impl.ProcurementDaoImpl;
import com.company.dao.impl.RepertoryDaoImpl;
import com.company.service.ICarService;
import com.company.service.ICar_modelService;
import com.company.service.IDecorateService;
import com.company.service.IRepertoryService;
import com.company.vo.CarVo;
import com.company.vo.RepertoryVo;

/**
 * @author Davi
 * @category 库存表的逻辑实现类
 */
public class RepertoryServiceImpl implements IRepertoryService {
	private IRepertoryDao repertoryDao = new RepertoryDaoImpl();
	private ICarService carservice = new CarServiceImpl();
	private IDecorateService decorateService = new DecorateServiceImpl();

	/**
	 * 查询商品车RepertoryVo列表
	 * 
	 * @return
	 */
	@Override
	public List<RepertoryVo> findcar() {
		List<RepertoryVo> list = new ArrayList<>();
		List<Repertory> list2 = repertoryDao.find();
		change(list, list2);
		return list;
	}

	/**
	 * 查询商品车change
	 * 
	 * @return
	 */
	private void change(List<RepertoryVo> list, List<Repertory> list2) {
		for (Repertory repertory : list2) {
			String spid = String.valueOf(repertory.getSpid());
			System.out.println(spid);
			if (repertory.getSpid() / 1000 == 1) {
				CarVo carvo = carservice.find(spid);
				RepertoryVo repertoryVo = new RepertoryVo(repertory.getSpid(),
						carvo.getModelname() + "-" + carvo.getColorname() + "-" + carvo.getLevelname(),
						repertory.getRepertorynum());
				list.add(repertoryVo);
			}

		}
	}

	/**
	 * 查询装潢change
	 * 
	 * @return
	 */
	private void changeDecorate(List<RepertoryVo> list, List<Repertory> list2) {
		for (Repertory repertory : list2) {
			String spid = String.valueOf(repertory.getSpid());
			System.out.println(spid);
			if (repertory.getSpid() / 1000 == 2) {
				Decorate decorate = decorateService.find(spid);
				RepertoryVo repertoryVo = new RepertoryVo(repertory.getSpid(), decorate.getDecoratename(),
						repertory.getRepertorynum());
				list.add(repertoryVo);
			}

		}
	}

	/**
	 * 查询装潢RepertoryVo列表
	 * 
	 * @return
	 */
	@Override
	public List<RepertoryVo> findDecorate() {
		List<RepertoryVo> list = new ArrayList<>();
		List<Repertory> list2 = repertoryDao.find();
		changeDecorate(list, list2);
		return list;
	}

	@Override
	public Repertory find(String spid) {
		Repertory repertory = null;
		if (spid != null && !spid.equals("")) {
			int spid1 = Integer.valueOf(spid);
			repertory = repertoryDao.find(spid1);
		}
		return repertory;
	}

	@Override
	public boolean add(Repertory repertory) {
		return repertoryDao.add(repertory) > 0 ? true : false;
	}

	@Override
	public boolean delete(String spid) {
		int proid1 = Integer.valueOf(spid);
		return repertoryDao.delete(proid1) > 0 ? true : false;

	}

	@Override
	public boolean update(Repertory repertory) {
		return repertoryDao.add(repertory) > 0 ? true : false;
	}

}
