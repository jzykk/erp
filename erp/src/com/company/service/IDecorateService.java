/**
 * 
 */
package com.company.service;

import java.util.List;

import com.company.bean.Decorate;
import com.company.vo.DecorateVo;

/**
 * @author 金子阳
 * @category 装潢的业务逻辑层
 *
 */
public interface IDecorateService {
	/**
	 * 查询所有装潢件信息
	 * 
	 * @return
	 */
	public List<DecorateVo> find();

	/**
	 * 根据商品编号查询装潢件
	 * 
	 * @param spid
	 * @return
	 */
	public Decorate find(String spid);

	/**
	 * 添加装潢件
	 * 
	 * @param decorate
	 * @return
	 */
	public boolean add(Decorate decorate);

	/**
	 * 删除装潢件
	 * 
	 * @param spid
	 * @return
	 */
	public boolean delete(String spid);
}
