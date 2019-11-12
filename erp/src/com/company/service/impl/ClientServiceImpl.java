package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Client;
import com.company.bean.ClientKind;
import com.company.bean.Duty;
import com.company.bean.User;
import com.company.dao.IClientDao;
import com.company.dao.IClientKindDao;
import com.company.dao.impl.ClientDaoImpl;
import com.company.dao.impl.ClientKindDaoImpl;
import com.company.service.IClientService;
import com.company.vo.ClientVo;
import com.company.vo.UserVo;

public class ClientServiceImpl implements IClientService {
	private IClientDao clientDao = new ClientDaoImpl();
	private IClientKindDao clientKindDao = new ClientKindDaoImpl();

	@Override
	public boolean add(Client client) {
		return clientDao.add(client) > 0 ? true : false;
	}

	@Override
	public boolean update(Client client) {
		boolean flag = false;
		if (client != null && client.getClientid() != 0) {
			int i = clientDao.update(client);
			if (i > 0) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<ClientVo> find() {
		List<ClientVo> list = new ArrayList<ClientVo>();
		List<Client> list2 = clientDao.find();
		Change(list, list2);
		return list;
	}

	@Test
	public void test() {
		List<ClientVo> list = find("2");
		System.out.println(list);
	}

	@Override
	public List<ClientVo> find(String id) {
		List<ClientVo> list = new ArrayList<ClientVo>();
		int id1 = Integer.valueOf(id);
		List<Client> list2 = clientDao.find(id1);
		Change(list, list2);
		return list;
	}

	private void Change(List<ClientVo> list, List<Client> list2) {

		for (Client client : list2) {
			ClientKind clientKind = clientKindDao.findByKid(client.getKid());
			String kname = clientKind.getKname();
			ClientVo vo = new ClientVo(client.getClientid(), client.getKid(), kname, client.getClientname(),
					client.getCsex(), client.getCaddress(), client.getCcardid(), client.getPhone(), client.getId());
			list.add(vo);
		}
	}

	@Override
	public Client findById(String clientid, String id) {
		Client client = null;
		if (clientid != null && !clientid.equals("") && id != null && !id.equals("")) {
			int idInt = Integer.valueOf(clientid);
			int id1 = Integer.valueOf(id);
			client = clientDao.findById(idInt, id1);
		}
		return client;
	}

	@Override
	public Client findByName(String clientname, String id) {
		Client client = null;
		if (clientname != null && !clientname.equals("") && id != null && !id.equals("")) {

			int id1 = Integer.valueOf(id);
			client = (Client) clientDao.findByName(clientname, id1);
		}
		;
		return client;
	}

	@Override
	public Client find1(String clientid) {
		int id1 = Integer.valueOf(clientid);
		return clientDao.find1(id1);
	}

}
