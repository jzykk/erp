package com.company.dao;

import java.util.List;

import com.company.bean.State;

/**
 * @author 金子阳
 * @category 订单状态表的数据访问层
 *
 */
public interface IStateDao {
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
	public State find(int stateId);
}
