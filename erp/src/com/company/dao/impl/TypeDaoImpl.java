package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Price;
import com.company.bean.Type;
import com.company.dao.ITypeDao;

public class TypeDaoImpl extends BaseDao implements ITypeDao {

	@Override
	public List<Type> find() {
		List<Type> list = new ArrayList<Type>();
		try {
			super.connection();
			String sql = "select * from type";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Type type = new Type(rs.getInt(1), rs.getString(2));
				list.add(type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public Type find(int typeid) {
		Type type = null;
		try {
			super.connection();
			String sql = "select * from type where typeid=? ";
			super.getPst(sql);
			pstmt.setInt(1, typeid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				type = new Type(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return type;
	}

}
