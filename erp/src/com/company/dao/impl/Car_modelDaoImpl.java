package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Car;
import com.company.bean.Car_level;
import com.company.bean.Car_model;
import com.company.dao.ICar_modelDao;

public class Car_modelDaoImpl extends BaseDao implements ICar_modelDao {

	@Override
	public List<Car_model> find() {
		List<Car_model> list = new ArrayList<Car_model>();
		try {
			super.connection();
			String sql = "select * from car_level";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Car_model car_model = new Car_model(rs.getInt(1), rs.getString(2));
				list.add(car_model);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}
	@Test 
	public void test1(){
		 List<Car_model> car_levels=	find();
		 System.out.println(car_levels);
	}
	@Override
	public int add(Car_model car_model) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into car_level (modellId,modellname)" + " values (?,?)";
			super.getPst(sql);
			pstmt.setInt(1, car_model.getModelId());
			pstmt.setString(2, car_model.getModel());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}
	@Test
	public void test() {
		Car_model car_level = new Car_model(3, "haohua");
		
		
		System.out.println(car_level.getModelId());
	}
	@Override
	public Car_model find(int modelId) {
		Car_model car_model = null;
		try {
			super.connection();
			String sql = "select * from car_model where modelId=?";
			super.getPst(sql);
			pstmt.setInt(1, modelId);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				car_model = new Car_model(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return car_model;

	}
	@Test
	public void test3() {
		Car_model car_level = find(1);
		System.out.println(car_level);
		System.out.println(car_level.getModelId());
	}
}
