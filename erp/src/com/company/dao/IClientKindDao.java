package com.company.dao;

import java.util.List;

import com.company.bean.ClientKind;

/**
 * @author 金子阳
 * @category 客户类型数据访问层
 *
 */
public interface IClientKindDao {
	/**
	 * 查询所有客户类型
	 * 
	 * @return
	 */
	public List<ClientKind> find();

	/**
	 * 根据类型id查询类型
	 * 
	 * @param kid
	 * @return
	 */
	public ClientKind findByKid(int kid);
}