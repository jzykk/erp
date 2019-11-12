package com.company.service;

import java.util.List;

import com.company.bean.Duty;

/**
 * @author 金子阳
 * @category 职务的业务逻辑层
 *
 */
public interface IDutyService {
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
	public Duty find(String did);
}
