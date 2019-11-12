package com.company.dao.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.company.bean.Evaluate;

import com.company.dao.IEvaluateDao;

public class EvaluateDaoImpl extends BaseDao implements IEvaluateDao {

	@Override
	public List<Evaluate> find(int clientid) {
		List<Evaluate> list = new ArrayList<Evaluate>();
		Evaluate evaluate = null;
		try {
			super.connection();
			String sql = "select * from evaluate where clientid = ?";
			super.getPst(sql);
			pstmt.setInt(1, clientid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				evaluate = new Evaluate(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getInt(4),rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public int add(Evaluate evaluate) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into evaluate (clientid,evaluatedate,evaluatesco,content)"
					+ " values (?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, evaluate.getClientid());
			pstmt.setDate(2, evaluate.getEvaluatedate());
			pstmt.setInt(3, evaluate.getEvaluatesco());
			pstmt.setString(4, evaluate.getContent());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

}
