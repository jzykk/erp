package com.company.dao;

import java.util.List;

import com.company.bean.Client;

/**
 * @author 金子阳
 * @category 客户信息数据控制层
 */
public interface IClientDao {
	/**
	 * 查询所有客户信息（管理员权限）
	 * 
	 * @return
	 */
	public List<Client> find();

	/**
	 * 根据客户ID和员工Id查询客户对象
	 * 
	 * @param 客户ID
	 * @return
	 */
	public Client findById(int clientid, int id);
	/**
	 * 根据客户ID查询客户对象集合
	 * 
	 * @param 客户ID
	 * @return
	 */
	public List<Client> find( int id);
	/**
	 * 根据客户ID查询客户对象
	 * 
	 * @param 客户ID
	 * @return
	 */
	public Client find1( int clientid);

	/**
	 * 根据客户姓名查询客户对象
	 * 
	 * @param 客户姓名
	 * @return
	 */
	public List<Client> findByName(String clientname, int id);

	/**
	 * 添加客户对象
	 * 
	 * @param 客户对象
	 * @return
	 */
	public int add(Client client);

	/**
	 * 修改客户信息
	 * 
	 * @param 客户对象
	 * @return
	 */
	public int update(Client client);
}
