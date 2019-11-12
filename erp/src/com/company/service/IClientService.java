package com.company.service;

import java.util.List;

import com.company.bean.Client;
import com.company.vo.ClientVo;

/**
 * @author 金子阳
 * @category 客户的业务逻辑层
 */
public interface IClientService {
	/**
	 * 查询所有客户信息（管理员权限）
	 * 
	 * @return
	 */
	public List<ClientVo> find();
	/**
	 * 根据客户ID查询客户对象
	 * 
	 * @param 客户ID
	 * @return
	 */
	public List<ClientVo> find(String id);
	public Client find1(String clientid);

	/**
	 * 根据客户ID和员工id查询客户对象
	 * 
	 * @param 客户ID
	 * @return
	 */
	public Client findById(String clientid, String id);

	/**
	 * 根据客户姓名查询客户对象
	 * 
	 * @param 客户姓名
	 * @return
	 */
	public Client findByName(String clientname, String id);

	/**
	 * 添加客户对象
	 * 
	 * @param 客户对象
	 * @return
	 */
	public boolean add(Client client);

	/**
	 * 修改客户信息
	 * 
	 * @param 客户对象
	 * @return
	 */
	public boolean update(Client client);

}
