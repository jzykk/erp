package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Client;
import com.company.bean.Indent;
import com.company.bean.State;
import com.company.bean.User;
import com.company.dao.IClientDao;
import com.company.dao.IIndentDao;
import com.company.dao.IPriceDao;
import com.company.dao.IStateDao;
import com.company.dao.IUserDao;
import com.company.dao.impl.ClientDaoImpl;
import com.company.dao.impl.IndentDaoImpl;
import com.company.dao.impl.PriceDaoImpl;
import com.company.dao.impl.StateDaoImpl;
import com.company.dao.impl.UserDaoImpl;
import com.company.service.IIndentService;
import com.company.vo.IndentVo;
import com.company.vo.UserVo;

import javafx.collections.ListChangeListener.Change;

/**
 * @author Davi
 * @category 订单的业务逻辑实现类
 */
public class IndentServiceImpl implements IIndentService {
	private IIndentDao indentDao = new IndentDaoImpl();
	private IStateDao stateDao = new StateDaoImpl();
	private IPriceDao priceDao = new PriceDaoImpl();
	private IClientDao clientDao = new ClientDaoImpl();
	private IUserDao userdao = new UserDaoImpl();

	@Override
	public Indent find(String indentId) {
		Indent indent = null;
		if (indentId != null && !indentId.equals("")) {
			int indentId1 = Integer.valueOf(indentId);
			indent = indentDao.find(indentId1);
		}
		return indent;
	}

	@Override
	public List<IndentVo> findByClientid(String clientid) {
		List<IndentVo> indentVos = new ArrayList<IndentVo>();
		int clientid1 = Integer.valueOf(clientid);
		List<Indent> indents = indentDao.findByClientid(clientid1);
		Change(indentVos, indents);
		return indentVos;
	}

	// @Test
	// public void test() {
	// List<IndentVo> indentVos = find();
	// for (IndentVo indentVo : indentVos) {
	// System.out.println(indentVo.getId() + "+" + indentVo.getClientid());
	// }
	// }

	@Override
	public List<IndentVo> find() {
		List<IndentVo> indentVos = new ArrayList<IndentVo>();
		List<Indent> indents = indentDao.find();
		Change(indentVos, indents);
		return indentVos;
	}

	private void Change(List<IndentVo> indentVos, List<Indent> indents) {
		for (Indent indent : indents) {
			Client client = clientDao.findById(indent.getClientid(), indent.getId());
			String clientname = client.getClientname();
			User user = userdao.find(indent.getId());
			String name = user.getName();
			State state = stateDao.find(indent.getStateId());
			String statename = state.getStatename();
			IndentVo vo = new IndentVo(indent.getIndentId(), indent.getStateId(), statename, indent.getSpid(),
					indent.getClientid(), clientname, indent.getId(), name, indent.getIndentdate(),
					indent.getInsurance(), indent.getTransaction_price());
			indentVos.add(vo);
		}
	}

	@Test
	public void tes1t() {

		List<IndentVo> indentVos = findById("5");
		System.out.println(indentVos);
	}

	@Override
	public List<IndentVo> findById(String id) {
		List<IndentVo> indentVos = new ArrayList<IndentVo>();
		int id1 = Integer.valueOf(id);
		List<Indent> indents = indentDao.findById(id1);
		System.out.println("AaA:" + indents);
		Change(indentVos, indents);
		return indentVos;
	}

	@Override
	public boolean add(Indent indent) {

		return indentDao.add(indent) > 0 ? true : false;
	}

	@Override
	public boolean delete(String indentId) {
		int indentId1 = Integer.valueOf(indentId);
		return indentDao.delete(indentId1) > 0 ? true : false;
	}

	@Override
	public boolean update(String indentId) {
		int indentId1 = Integer.valueOf(indentId);
		return indentDao.delete(indentId1) > 0 ? true : false;
	}

}
