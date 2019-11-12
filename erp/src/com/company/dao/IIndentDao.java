package com.company.dao;

import java.util.List;

import com.company.bean.Indent;

/**
 * @author 金子阳
 * @category 订单数据访问层
 *
 */
public interface IIndentDao {
	/**
	 * 查询所有
	 * 
	 * @param indentId
	 * @return
	 */
	public List<Indent> find();
	/**
	 * 根据订单编号查询订单对象
	 * 
	 * @param indentId
	 * @return
	 */
	public Indent find(int indentId);

	/**
	 * 根据客户编号查询订单
	 * 
	 * @param clientid
	 * @return
	 */
	public List<Indent> findByClientid(int clientid);

	/**
	 * 根据员工编号查询订单
	 * 
	 * @param id
	 * @return
	 */
	public List<Indent> findById(int id);

	/**
	 * 新增订单
	 * 
	 * @param indent
	 * @return
	 */
	public int add(Indent indent);

	/**
	 * 删除订单
	 * 
	 * @param indent
	 * @return
	 */
	public int delete(int indentId);

	/**
	 * 修改订单
	 * 
	 * @param indent
	 * @return
	 */
	public int update(int indentId);
}
