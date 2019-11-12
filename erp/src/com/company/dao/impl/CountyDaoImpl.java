package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.City;
import com.company.bean.County;
import com.company.dao.ICountyDao;

public class CountyDaoImpl extends BaseDao implements ICountyDao {

	public List<County> findAreasByCid(String cityId) {
		List<County> list = new ArrayList<County>();
		try {
			connection();
			String sql = "select * from county where cityId = ?";
			getPst(sql);
			pstmt.setString(1, cityId);
			rs = pstmt.executeQuery();
			while(rs.next()){
				County county = new County();
				county.setId(rs.getInt(1));
				county.setAreaID(rs.getString(2));
				county.setAreas(rs.getString(3));
				county.setCityID(rs.getString(4));
				list.add(county);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	public County findObject(String areaId) {
		County county = null;
		try {
			super.connection();
			String sql = "select * from county where areaId=?";
			super.getPst(sql);
			pstmt.setString(1, areaId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				county = new County(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return county;
	} 

}
