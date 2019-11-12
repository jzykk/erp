package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Color;
import com.company.bean.Decorate;
import com.company.bean.Indent;
import com.company.dao.IDecorateDao;

/**
 * @author Davi
 * @category 装潢件的实现类
 */
public class DecorateDaoImpl extends BaseDao implements IDecorateDao {

	@Override
	public List<Decorate> find() {
		List<Decorate> list = new ArrayList<Decorate>();
		try {
			super.connection();
			String sql = "select * from decorate";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Decorate decorate = new Decorate(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
				list.add(decorate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public Decorate find(int spid) {
		Decorate decorate = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from decorate where spid=?";
			super.getPst(sql);
			pstmt.setInt(1, spid);
			
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				decorate = new Decorate(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return decorate;
	}


	@Override
	public int add(Decorate decorate) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into decorate (spid,decoratename,typeid,id)"
					+ " values (?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, decorate.getSpid());
			pstmt.setString(2, decorate.getDecoratename());
			pstmt.setInt(3, decorate.getTypeid());
			pstmt.setInt(4, decorate.getId());
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
			String sql = "delete from decorate where spid = ?";
			super.getPst(sql);
			pstmt.setInt(1,spid);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}
}
