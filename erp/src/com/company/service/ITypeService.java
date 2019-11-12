package com.company.service;

import java.util.List;

import com.company.bean.Type;

/**
 * @author 金子阳
 * @category 商品类型的业务逻辑层
 *
 */
public interface ITypeService {
	/**
	 * 查询所有类型
	 * 
	 * @return
	 */
	public List<Type> find();

	/**
	 * 查询类型
	 * 
	 * @param typeid类型编号
	 * @return
	 */
	public Type find(String typeid);
}
