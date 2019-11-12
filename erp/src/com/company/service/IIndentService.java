package com.company.service;

import java.util.List;

import com.company.bean.Indent;
import com.company.vo.IndentVo;

/**
 * @author 金子阳
 * @category 订单的业务逻辑层
 */
public interface IIndentService {
	public List<IndentVo> find();
	/**
	 * 根据订单编号查询订单对象
	 * 
	 * @param indentId
	 * @return
	 */
	public Indent find(String indentId);

	/**
	 * 根据客户编号查询订单
	 * 
	 * @param clientid
	 * @return
	 */
	public List<IndentVo> findByClientid(String clientid);

	/**
	 * 根据员工编号查询订单
	 * 
	 * @param id
	 * @return
	 */
	public List<IndentVo> findById(String id);

	/**
	 * 新增订单
	 * 
	 * @param indent
	 * @return
	 */
	public boolean add(Indent indent);

	/**
	 * 删除订单
	 * 
	 * @param indent
	 * @return
	 */
	public boolean delete(String indentId);

	/**
	 * 修改订单
	 * 
	 * @param indent
	 * @return
	 */
	public boolean update(String indentId);
}
