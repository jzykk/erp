package com.company.service;

import java.util.List;

import com.company.bean.Color;

/**
 * @author 金子阳
 * @category 颜色类的业务逻辑层
 *
 */
public interface IColorService {
	/**
	 * 查询所有颜色
	 * 
	 * @return
	 */
	public List<Color> find();

	/**
	 * 根据颜色编号查询颜色对象
	 * 
	 * @param cololId
	 * @return
	 */
	public Color find(String cololId);

	/**
	 * 增加颜色
	 * 
	 * @param color
	 * @return
	 */
	public boolean add(Color color);
}
