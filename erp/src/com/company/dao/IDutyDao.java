package com.company.dao;

import java.util.List;

import com.company.bean.Duty;

/**
 * @author 金子阳
 * @category 职务的数据访问层
 *
 */
public interface IDutyDao {
	/**
	 * 查询所有职务
	 * 
	 * @return
	 */
	public List<Duty> find();

	/**
	 * 通过职位编号查询职务
	 * 
	 * @param did
	 * @return
	 */
	public Duty find(int did);
}
