package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Province;
import com.company.bean.Repertory;
import com.company.bean.User;
import com.company.dao.IProvinceDao;

public class ProvinceDaoImpl extends BaseDao implements IProvinceDao {

	public List<Province> findAll() {
		List<Province> list = new ArrayList<Province>();
		try {
			super.connection();
			String sql = "select * from province";
			super.getPst(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Province pro = new Province();
				pro.setId(rs.getInt(1));
				pro.setProvinceID(rs.getString(2));
				pro.setProvince(rs.getString(3));
				list.add(pro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	public Province findObject(String provinceId) {
		Province province = null;
		try {
			super.connection();
			String sql = "select * from province where provinceId=?";
			super.getPst(sql);
			pstmt.setString(1, provinceId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				province = new Province(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return province;
	}

}
