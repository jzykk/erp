package com.company.service;

import java.util.List;

import com.company.bean.Procurement;

/**
 * @author 金子阳
 * @category 采购订单的业务逻辑层
 *
 */
public interface IProcurementService {
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
	public Procurement find(String proid);

	/**
	 * 查询订单
	 * 
	 * @param id员工编号
	 * @return
	 */
	public Procurement findById(String id);

	/**
	 * 新增订单
	 * 
	 * @param procurement
	 * @return
	 */
	public boolean add(Procurement procurement);

	/**
	 * 修改订单
	 * 
	 * @param procurement
	 * @return
	 */
	public boolean update(Procurement procurement);

	/**
	 * 删除订单
	 * 
	 * @param proid订单编号
	 * @return
	 */
	public boolean delete(String proid);
}
