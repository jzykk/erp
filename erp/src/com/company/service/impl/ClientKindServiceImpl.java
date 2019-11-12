package com.company.service.impl;

import java.util.List;

import com.company.bean.ClientKind;
import com.company.bean.Indent;
import com.company.dao.IClientKindDao;
import com.company.dao.IIndentDao;
import com.company.dao.impl.ClientKindDaoImpl;
import com.company.dao.impl.IndentDaoImpl;
import com.company.service.IClientKindService;

/**
 * @author Davi
 * @category 客户类型的业务逻辑实现类
 */
public class ClientKindServiceImpl implements IClientKindService {
	private IClientKindDao clientkindDao = new ClientKindDaoImpl();
	@Override
	public List<ClientKind> find() {
	
		return clientkindDao.find();
	}

	@Override
	public ClientKind findByKid(String kid) {
		ClientKind clientkind = null;
		if (kid != null &&!kid.equals("")) {
			int kid1 = Integer.valueOf(kid);
			clientkind = clientkindDao.findByKid(kid1);
		}
		return clientkind;
	}
}
