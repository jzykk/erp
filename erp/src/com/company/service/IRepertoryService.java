package com.company.service;

import java.util.List;

import com.company.bean.Repertory;
import com.company.vo.RepertoryVo;

/**
 * @author 金子阳
 * @category 库存表的业务逻辑层
 *
 */
public interface IRepertoryService {
	/**
	 * 查询所有库存车
	 * 
	 * @return
	 */
	public List<RepertoryVo> findcar();

	/**
	 * 查询所有库存装潢
	 * 
	 * @return
	 */
	public List<RepertoryVo> findDecorate();

	/**
	 * 查询库存
	 * 
	 * @param spid商品编号
	 * @return
	 */
	public Repertory find(String spid);

	/**
	 * 增加新商品库存信息
	 * 
	 * @param repertory
	 * @return
	 */
	public boolean add(Repertory repertory);

	/**
	 * 删除某商品的库存信息
	 * 
	 * @param spid商品id
	 * @return
	 */
	public boolean delete(String spid);

	/**
	 * 修改库存数量
	 * 
	 * @param repertory
	 * @return
	 */
	public boolean update(Repertory repertory);
}
