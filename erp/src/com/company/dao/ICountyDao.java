package com.company.dao;

import java.util.List;

import com.company.bean.County;

/**
 * @author 金子阳
 * @category 区县的数据访问层
 */
public interface ICountyDao {

	/**
	 * 根据城市id，查询出所有的区县列表
	 * @param cityId
	 * @return
	 */
	public List<County> findAreasByCid(String cityId);
	
	/**
	 * 根据区县id查询出对应的区县对象
	 * @param areaId
	 * @return
	 */
	public County findObject(String areaId);
}
