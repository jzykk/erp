package com.company.service;

import java.util.List;

import com.company.bean.State;

/**
 * @author 金子阳
 * @category 订单状态表的业务逻辑层
 *
 */
public interface IStateService {
	/**
	 * 查询所有状态
	 * 
	 * @return
	 */
	public List<State> find();

	/**
	 * 查询状态
	 * 
	 * @param stateId状态id
	 * @return
	 */
	public State find(String stateId);
}
