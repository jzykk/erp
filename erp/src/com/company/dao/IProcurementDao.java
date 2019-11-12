package com.company.dao;

import java.util.List;

import com.company.bean.Procurement;

/**
 * @author 金子阳
 * @category 采购订单的数据访问层
 *
 */
public interface IProcurementDao {
	/**
	 * 查询所有订单
	 * 
	 * @return
	 */
	public List<Procurement> find();

	/**
	 * 查询订单
	 * 
	 * @param proid订单编号
	 * @return
	 */
	public Procurement find(int proid);

	/**
	 * 查询订单
	 * 
	 * @param id员工编号
	 * @return
	 */
	public Procurement findById(int id);

	/**
	 * 新增订单
	 * 
	 * @param procurement
	 * @return
	 */
	public int add(Procurement procurement);

	/**
	 * 修改订单
	 * 
	 * @param procurement
	 * @return
	 */
	public int update(Procurement procurement);

	/**
	 * 删除订单
	 * 
	 * @param proid订单编号
	 * @return
	 */
	public int delete(int proid);
}
