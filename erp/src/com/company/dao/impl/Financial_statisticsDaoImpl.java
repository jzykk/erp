package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Car_level;
import com.company.bean.Financial_statistics;
import com.company.dao.IFinancial_statisticsDao;

public class Financial_statisticsDaoImpl extends BaseDao implements IFinancial_statisticsDao {

	@Override
	public List<Financial_statistics> find() {
		List<Financial_statistics> list = new ArrayList<Financial_statistics>();
		try {
			super.connection();
			String sql = "select * from car_level";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Financial_statistics financial_statistics = new Financial_statistics(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDate(5));
				list.add(financial_statistics);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public int add(Financial_statistics financial_statistics) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into car_level (levelId,levelname)"
					+ " values (?,?)";
			super.getPst(sql);
			pstmt.setInt(1, financial_statistics.getFinId());
			pstmt.setInt(1, financial_statistics.getSpid());
			pstmt.setInt(1, financial_statistics.getSpNum());
			pstmt.setInt(1, financial_statistics.getPrice());
			pstmt.setDate(5,  financial_statistics.getSaledate());
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}
	}


