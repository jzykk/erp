package com.company.dao;

import java.util.List;

import com.company.bean.Type;

/**
 * @author 金子阳
 * @category 商品类型的数据访问层
 *
 */
public interface ITypeDao {
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
	public Type find(int typeid);
}
