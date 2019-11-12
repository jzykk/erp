package com.company.dao;

import java.util.List;

import com.company.bean.Price;

/**
 * @author 金子阳
 * @category 商品表的数据访问层
 *
 */
public interface IPriceDao {
	/**
	 * 查询所有商品价格
	 * 
	 * @return
	 */
	public List<Price> find();

	/**
	 * 查询商品价格
	 * 
	 * @param spid商品编号
	 * @return
	 */
	public Price find(int spid);
}
