package com.company.dao;

import java.util.List;

import com.company.bean.Car;

/**
 * @author 金子阳
 * @category 商品车的数据访问层
 *
 */
public interface ICarDao {
	/**
	 * 查询所有商品车
	 * 
	 * @return
	 */
	public List<Car> find();

	/**
	 * 根据商品编号查询商品车信息
	 * 
	 * @param spid
	 * @return
	 */
	public Car find(int spid);

	/**
	 * 根据型号ID查询商品车信息
	 * 
	 * @param modelId
	 * @return
	 */
	public List<Car> findByMId(int modelId);

	/**
	 * 增加商品车
	 * 
	 * @param car
	 * @return
	 */
	public int add(Car car);

	/**
	 * 根据商品编号删除商品车
	 * 
	 * @param spid
	 * @return
	 */
	public int delete(int spid);
}
