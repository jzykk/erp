package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.City;
import com.company.bean.Province;
import com.company.dao.ICityDao;

public class CityDaoImpl extends BaseDao implements ICityDao {

	public List<City> findCitiesByPid(String provinceId) {
		List<City> list = new ArrayList<City>();
		try {
			connection();
			String sql = "select * from city where provinceId = ?";
			getPst(sql);
			pstmt.setString(1, provinceId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				City city = new City();
				city.setId(rs.getInt(1));
				city.setCityID(rs.getString(2));
				city.setCity(rs.getString(3));
				city.setProvinceID(rs.getString(4));
				list.add(city);
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
		City city = findObject("450200");
		System.out.println(city);
	}

	public City findObject(String cityId) {
		City city = null;
		try {
			super.connection();
			String sql = "select * from city where cityId=?";
			super.getPst(sql);
			pstmt.setString(1, cityId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4));
				city = new City(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return city;
	}

}
