package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.ClientKind;
import com.company.bean.Color;
import com.company.bean.Duty;
import com.company.dao.IColorDao;

/**
 * @author Davi
 * @category 颜色类的实现类
 */
public class ColorDaoImpl extends BaseDao implements IColorDao {

	@Override
	public List<Color> find() {
		List<Color> list = new ArrayList<Color>();
		try {
			super.connection();
			String sql = "select * from color";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Color color = new Color(rs.getInt(1),rs.getString(2));
				list.add(color);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public Color find(int cololId) {
		Color color = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from color where colorId=?";
			super.getPst(sql);
			pstmt.setInt(1, cololId);
			
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				color = new Color(rs.getInt(1),rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return color;
	}
	@Override
	public int add(Color color) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into color (colorId,color)"
					+ " values (?,?)";
			super.getPst(sql);
			pstmt.setInt(1, color.getColorId());
			pstmt.setString(2, color.getColor());
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

}
