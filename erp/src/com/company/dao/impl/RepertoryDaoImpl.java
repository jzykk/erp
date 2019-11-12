package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Procurement;
import com.company.bean.Repertory;
import com.company.dao.IRepertoryDao;

/**
 * @author Davi
 * @category 库存表的实现类
 */
public class RepertoryDaoImpl extends BaseDao implements IRepertoryDao {

	@Override
	public List<Repertory> find() {
		List<Repertory> list = new ArrayList<Repertory>();
		try {
			super.connection();
			String sql = "select * from repertory";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Repertory repertory = new Repertory(rs.getInt(1),rs.getInt(2));
				list.add(repertory);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}
	@Override
	public Repertory find(int spid) {
		Repertory repertory = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from repertory where spid=?";
			super.getPst(sql);
			pstmt.setInt(1, spid);
			
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				repertory = new Repertory(rs.getInt(1),rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return repertory;
	}
	@Override
	public int add(Repertory repertory) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into repertory (spid,repertorynum)"
					+ " values (?,?)";
			super.getPst(sql);
			pstmt.setInt(1, repertory.getSpid());
			pstmt.setInt(2, repertory.getRepertorynum());
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
			String sql = "delete from repertory where spid = ?";
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

	@Override
	public int update(Repertory repertory) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into repertory (spid,repertorynum)"
					+ " values (?,?)";
			super.getPst(sql);
			pstmt.setInt(1, repertory.getSpid());
			pstmt.setInt(2, repertory.getRepertorynum());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

}
