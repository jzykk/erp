package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.company.bean.Price;

import com.company.dao.IPriceDao;

public class PriceDaoImpl extends BaseDao implements IPriceDao {

	@Override
	public List<Price> find() {
		List<Price> list = new ArrayList<Price>();
		try {
			super.connection();
			String sql = "select * from price";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Price price = new Price(rs.getInt(1),rs.getInt(2));
				list.add(price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public Price find(int spid) {
		Price price = null;
		try {
			super.connection();
			String sql = "select * from price where spid=? ";
			super.getPst(sql);
			pstmt.setInt(1, spid);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				price = new Price(rs.getInt(1),rs.getInt(2));
						}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return price;
	}

}
