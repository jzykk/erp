package com.company.service;

import java.util.List;

import com.company.bean.Price;

/**
 * @author 金子阳
 * @category 商品表的业务逻辑层
 *
 */
public interface IPriceService {
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
	public Price find(String spid);
}
