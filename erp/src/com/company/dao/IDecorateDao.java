package com.company.dao;

import java.util.List;

import com.company.bean.Decorate;

/**
 * @author 金子阳
 * @category 装潢件的数据访问层
 *
 */
public interface IDecorateDao {
	/**
	 * 查询所有装潢件信息
	 * 
	 * @return
	 */
	public List<Decorate> find();

	/**
	 * 根据商品编号查询装潢件
	 * 
	 * @param spid
	 * @return
	 */
	public Decorate find(int spid);

	/**
	 * 添加装潢件
	 * 
	 * @param decorate
	 * @return
	 */
	public int add(Decorate decorate);

	/**
	 * 删除装潢件
	 * 
	 * @param spid
	 * @return
	 */
	public int delete(int spid);
}
