package com.company.service;

import java.util.List;

import com.company.bean.ClientKind;

/**
 * @author 金子阳
 * @category 客户类型业务逻辑层
 *
 */
public interface IClientKindService {
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
	public ClientKind findByKid(String kid);
}
