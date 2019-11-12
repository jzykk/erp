package com.company.service.impl;

import java.util.List;

import com.company.bean.Procurement;
import com.company.bean.State;
import com.company.dao.IProcurementDao;
import com.company.dao.IStateDao;
import com.company.dao.impl.ProcurementDaoImpl;
import com.company.dao.impl.StateDaoImpl;
import com.company.service.IStateService;

/**
 * @author Davi
 * @category 订单状态业务逻辑实现类
 */
public class StateServiceImpl implements IStateService {
	private IStateDao stateDao = new StateDaoImpl();
	@Override
	public List<State> find() {
		return stateDao.find();
	}

	@Override
	public State find(String stateId) {
		State state = null;
		if (stateId != null && !stateId.equals("")) {
			int stateId1 = Integer.valueOf(stateId);
			state = stateDao.find(stateId1);
		}
		return state;
	}

}
