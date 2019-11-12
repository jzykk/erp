package com.company.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.bean.Client;
import com.company.bean.Evaluate;
import com.company.bean.Evaluate;
import com.company.bean.User;
import com.company.dao.IClientDao;
import com.company.dao.IEvaluateDao;
import com.company.dao.impl.ClientDaoImpl;
import com.company.dao.impl.EvaluateDaoImpl;
import com.company.service.IEvaluateService;
import com.company.vo.EvaluateVO;

public class EvaluateServiceImpl implements IEvaluateService {
	private IEvaluateDao evaluateDao = new EvaluateDaoImpl();
	private IClientDao clientDao= new ClientDaoImpl();
	@Override
	public List<EvaluateVO> find(String clientid) {
		List<EvaluateVO> evaluateVos = new ArrayList<EvaluateVO>();
		int clientid1 = Integer.valueOf(clientid);
		List<Evaluate> evaluates = evaluateDao.find(clientid1);
		change(evaluateVos,evaluates);
		return evaluateVos;
	}

	private void change(List<EvaluateVO> evaluateVos, List<Evaluate> evaluates) {
		for (Evaluate evaluate : evaluates) {
			Client client = clientDao.find1(evaluate.getClientid());
			String name = client.getClientname();
			EvaluateVO vo = new EvaluateVO(evaluate.getEvaluateId(), evaluate.getClientid(), name, evaluate.getEvaluatedate(), evaluate.getEvaluatesco(), evaluate.getContent());
			evaluateVos.add(vo);
		}
	}

	@Override
	public boolean add(Evaluate evaluate) {
		return evaluateDao.add(evaluate)>0?true:false;
	}

}
