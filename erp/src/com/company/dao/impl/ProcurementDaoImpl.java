package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.ClientKind;
import com.company.bean.Decorate;
import com.company.bean.Procurement;
import com.company.dao.IProcurementDao;

/**
 * @author Davi
 * @category 采购订单的实现类
 */
public class ProcurementDaoImpl extends BaseDao implements IProcurementDao {

	@Override
	public List<Procurement> find() {
		List<Procurement> list = new ArrayList<Procurement>();
		try {
			super.connection();
			String sql = "select * from procurement";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Procurement procurement = new Procurement(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getDate(6));
				list.add(procurement);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}
	@Override
	public Procurement find(int proid) {
		Procurement procurement = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from procurement where proid=?";
			super.getPst(sql);
			pstmt.setInt(1, proid);
			
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				procurement = new Procurement(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getDate(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return procurement;
	}

	@Override
	public Procurement findById(int id) {
		Procurement procurement = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from procurement where id = ?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			super.rs = pstmt.executeQuery();
			while(rs.next()){
				procurement = new Procurement(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getDate(6));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.close();
		}
	return procurement;
	}
	@Override
	public int add(Procurement procurement) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into decorate (proid,spid,id,proNum,proprice,prodate)"
					+ " values (?,?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, procurement.getProid());
			pstmt.setInt(2, procurement.getSpid());
			pstmt.setInt(3, procurement.getId());
			pstmt.setInt(4, procurement.getProNum());
			pstmt.setInt(4, procurement.getProprice());
			pstmt.setDate(4, procurement.getProdate());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}
	@Override
	public int update(Procurement procurement) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into decorate (proid,spid,id,proNum,proprice,prodate)"
					+ " values (?,?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, procurement.getProid());
			pstmt.setInt(2, procurement.getSpid());
			pstmt.setInt(3, procurement.getId());
			pstmt.setInt(4, procurement.getProNum());
			pstmt.setInt(4, procurement.getProprice());
			pstmt.setDate(4, procurement.getProdate());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}
	@Override
	public int delete(int proid) {
		int i = 0;
		try {
			super.connection();
			String sql = "delete from procurement where proid = ?";
			super.getPst(sql);
			pstmt.setInt(1,proid);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

}
