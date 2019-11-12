package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Duty;
import com.company.bean.User;
import com.company.dao.IDutyDao;

public class DutyDaoImpl extends BaseDao implements IDutyDao {

	@Override
	public List<Duty> find() {
		List<Duty> list = new ArrayList<Duty>();
		try {
			super.connection();
			String sql = "select * from user where id<>1 order by id desc";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Duty duty = new Duty(rs.getInt(1),rs.getString(2));

				list.add(duty);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public Duty find(int did) {
		Duty duty = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from duty where did=?";
			super.getPst(sql);
			pstmt.setInt(1, did);
			
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				duty = new Duty(rs.getInt(1),rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return duty;
	}

}
