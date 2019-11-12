package com.company.service;

import java.util.List;

import com.company.bean.County;

/**
 * @author Administrator
 * @category 区县的业务逻辑层
 */
public interface ICountyService {

	/**
	 * 根据城市id，查询相对应的区县列表
	 * @param cityId
	 * @return
	 */
	public List<County> findAreasByCid(String cityId);

	/**
	 * 根据区县id，查询对应的区县对象
	 * @param areaId
	 * @return
	 */
	public County findObject(String areaId);
}
