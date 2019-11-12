package com.company.service;

import java.util.List;

import com.company.bean.Financial_statistics;

/**
 * @author 金子阳
 * @category 财务统计表业务逻辑层
 *
 */
public interface IFinancial_statisticsService {
	/**
	 * 查询所有统计表
	 * 
	 * @return
	 */
	public List<Financial_statistics> find();

	/**
	 * 新增统计表对象
	 * 
	 * @param financial_statistics
	 * @return
	 */
	public boolean add(Financial_statistics financial_statistics);
}
