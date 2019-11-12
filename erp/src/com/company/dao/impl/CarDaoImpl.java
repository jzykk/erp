package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Car;
import com.company.bean.User;
import com.company.dao.ICarDao;

public class CarDaoImpl extends BaseDao implements ICarDao {
	@Override
	public List<Car> find() {
		List<Car> list = new ArrayList<Car>();
		try {
			super.connection();
			String sql = "select * from car ";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Car car = new Car(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));

				list.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Test
	public void test() {
		Car car = find(1002);
		System.out.println(car);
	}

	@Override
	public Car find(int spid) {
		Car car = null;
		try {
			super.connection();
			String sql = "select * from car where spid = ?";
			super.getPst(sql);
			pstmt.setInt(1, spid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				car = new Car(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return car;
	}

	@Override
	public List<Car> findByMId(int modelId) {
		List<Car> list = new ArrayList<Car>();
		try {
			super.connection();
			String sql = "select * from car where modelId=? order by id desc";
			super.getPst(sql);
			pstmt.setInt(1, modelId);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Car car = new Car(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));

				list.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public int add(Car car) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into User (typeid,colorId,modelId,levelId,id)" + " values (?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, car.getTypeid());
			pstmt.setInt(2, car.getColorId());
			pstmt.setInt(3, car.getModelId());
			pstmt.setInt(4, car.getLevelId());
			pstmt.setInt(5, car.getId());

			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Override
	public int delete(int spid) {
		int i = 0;
		try {
			super.connection();
			String sql = "delete from car where spid = ?";
			super.getPst(sql);
			pstmt.setInt(1, spid);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

}
