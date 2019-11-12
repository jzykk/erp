package com.company.dao;

import java.util.List;

import com.company.bean.Color;

/**
 * @author 金子阳
 * @category 颜色类的数据访问层
 *
 */
public interface IColorDao {
	/**
	 * 查询所有颜色
	 * 
	 * @return
	 */
	public List<Color> find();

	/**
	 * 根据颜色编号查询颜色对象
	 * 
	 * @param colorId
	 * @return
	 */
	public Color find(int colorId);

	/**
	 * 增加颜色
	 * 
	 * @param color
	 * @return
	 */
	public int add(Color color);
}
