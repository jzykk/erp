package com.company.dao;

import java.util.List;

import com.company.bean.Evaluate;

/**
 * @author 金子阳
 * @category 评论的数据访问层
 *
 */
public interface IEvaluateDao {
	/**
	 * 查询评论
	 * 
	 * @param clientid客户编号
	 * @return
	 */
	public List<Evaluate> find(int clientid);

	/**
	 * 增加评论
	 * 
	 * @param evaluate
	 * @return
	 */
	public int add(Evaluate evaluate);
}
