package com.company.dao;

import java.util.List;

import com.company.bean.Repertory;

/**
 * @author 金子阳
 * @category 库存表的数据访问层
 *
 */
public interface IRepertoryDao {
	/**
	 * 查询所有库存
	 * 
	 * @return
	 */
	public List<Repertory> find();

	/**
	 * 查询库存
	 * 
	 * @param spid商品编号
	 * @return
	 */
	public Repertory find(int spid);

	/**
	 * 增加新商品库存信息
	 * 
	 * @param repertory
	 * @return
	 */
	public int add(Repertory repertory);

	/**
	 * 删除某商品的库存信息
	 * 
	 * @param spid商品id
	 * @return
	 */
	public int delete(int spid);

	/**
	 * 修改库存数量
	 * 
	 * @param repertory
	 * @return
	 */
	public int update(Repertory repertory);
}
