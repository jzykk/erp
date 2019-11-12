package com.company.dao.impl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Client;
import com.company.bean.Indent;
import com.company.bean.User;
import com.company.dao.IIndentDao;

/**
 * @author Davi
 * @category 订单数据实现类
 */
public class IndentDaoImpl extends BaseDao implements IIndentDao {

	@Override
	public Indent find(int indentId) {
		Indent indent = null;
		try {
			connection();
			String sql = "select * from indent where indentId = ?";
			getPst(sql);
			pstmt.setInt(1, indentId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				indent = new Indent();
				indent.setIndentId(rs.getInt(1));
				indent.setStateId(rs.getInt(2));
				indent.setSpid(rs.getInt(3));
				indent.setClientid(rs.getInt(4));
				indent.setId(rs.getInt(5));
				indent.setIndentdate(rs.getDate(6));
				indent.setInsurance(rs.getString(7));
				indent.setTransaction_price(rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}

		return indent;
	}

	@Override
	public List<Indent> findByClientid(int clientid) {
		List<Indent> list = new ArrayList<Indent>();

		try {
			super.connection();
			String sql = "select * from Indent where clientId=?";
			super.getPst(sql);
			pstmt.setInt(1, clientid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Indent indent = new Indent();
				indent.setIndentId(rs.getInt(1));
				indent.setStateId(rs.getInt(2));
				indent.setSpid(rs.getInt(3));
				indent.setClientid(rs.getInt(4));
				indent.setId(rs.getInt(5));
				indent.setIndentdate(rs.getDate(6));
				indent.setInsurance(rs.getString(7));
				indent.setTransaction_price(rs.getInt(8));
				list.add(indent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Test
	public void test() {
		List<Indent> list = findById(5);
		System.out.println(list);
	}

	@Override
	public List<Indent> findById(int id) {
		List<Indent> list = new ArrayList<Indent>();
		try {
			super.connection();
			String sql = "select * from Indent where id=?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Indent indent = new Indent();
				indent.setIndentId(rs.getInt(1));
				indent.setStateId(rs.getInt(2));
				indent.setSpid(rs.getInt(3));
				indent.setClientid(rs.getInt(4));
				indent.setId(rs.getInt(5));
				indent.setIndentdate(rs.getDate(6));
				indent.setInsurance(rs.getString(7));
				indent.setTransaction_price(rs.getInt(8));
				list.add(indent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public int add(Indent indent) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into indent (indentId,stateId,spid,clientid,id,indentdate,insurance,transaction_price)"
					+ " values (?,?,?,?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, indent.getIndentId());
			pstmt.setInt(2, indent.getStateId());
			pstmt.setInt(3, indent.getSpid());
			pstmt.setInt(4, indent.getClientid());
			pstmt.setInt(5, indent.getId());
			pstmt.setDate(6, indent.getIndentdate());
			pstmt.setString(7, indent.getInsurance());
			pstmt.setInt(8, indent.getTransaction_price());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Override
	public int delete(int indentId) {
		int i = 0;
		try {
			super.connection();
			String sql = "delete from indent where indentId = ?";
			super.getPst(sql);
			pstmt.setInt(1, indentId);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Override
	public int update(int indentId) {
		int i = 0;
		try {
			super.connection();
			String sql = "update  set indentid=?, stateId=?,spid=?,clientid=?,id=?,indentdate=? insurance=?,transaction_pric=?";
			pstmt.setInt(1, indentId);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Override
	public List<Indent> find() {
		List<Indent> list = new ArrayList<Indent>();
		try {
			super.connection();
			String sql = "select * from indent ";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Indent indent = new Indent();
				indent.setIndentId(rs.getInt(1));
				indent.setStateId(rs.getInt(2));
				indent.setSpid(rs.getInt(3));
				indent.setClientid(rs.getInt(4));
				indent.setId(rs.getInt(5));
				indent.setIndentdate(rs.getDate(6));
				indent.setInsurance(rs.getString(7));
				indent.setTransaction_price(rs.getInt(8));
				list.add(indent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

}
