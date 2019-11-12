package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Car_level;
import com.company.bean.User;
import com.company.dao.ICar_levelDao;

public class Car_levelDaoImpl extends BaseDao implements ICar_levelDao {
	@Test 
	public void test1(){
		 List<Car_level> car_levels=	find();
		 System.out.println(car_levels);
	}
	@Override
	public List<Car_level> find() {
		List<Car_level> list = new ArrayList<Car_level>();
		try {
			super.connection();
			String sql = "select * from car_level";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Car_level car_level = new Car_level(rs.getInt(1), rs.getString(2));
				list.add(car_level);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	/*@Test
	public void test() {
		Car_level car_level = find(1);
		System.out.println(car_level);
		System.out.println(car_level.getLevelname());
	}*/

	@Override
	public Car_level find(int levelId) {
		Car_level car_level = null;
		try {
			super.connection();
			String sql = "select * from car_level where levelId=?";
			super.getPst(sql);
			pstmt.setInt(1, levelId);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				car_level = new Car_level(rs.getInt(1), rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return car_level;
	}

	@Override
	public int add(Car_level car_level) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into car_level (levelId,levelname)" + " values (?,?)";
			super.getPst(sql);
			pstmt.setInt(1, car_level.getLevelId());
			pstmt.setString(2, car_level.getLevelname());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}
	@Test
	public void test() {
		Car_level car_level = new Car_level(3, "haohua");
		
		
		System.out.println(car_level.getLevelname());
	}
}
