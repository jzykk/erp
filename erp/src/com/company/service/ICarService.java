package com.company.service;

import java.util.List;

import com.company.bean.Car;
import com.company.vo.CarVo;

/**
 * @author 金子阳
 * @category 商品车类的业务逻辑层
 *
 */
public interface ICarService {
	/**
	 * 查询所有商品车
	 * 
	 * @return
	 */
	public List<CarVo> find();

	/**
	 * 根据商品编号查询商品车信息
	 * 
	 * @param spid
	 * @return
	 */
	public CarVo find(String spid);

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
	public boolean add(Car car);

	/**
	 * 根据商品编号删除商品车
	 * 
	 * @param spid
	 * @return
	 */
	public boolean delete(String spid);
}
