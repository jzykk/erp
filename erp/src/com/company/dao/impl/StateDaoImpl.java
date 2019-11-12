package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Procurement;
import com.company.bean.State;
import com.company.dao.IStateDao;

/**
 * @author Davi
 * @category 订单状态表的实现类
 */
public class StateDaoImpl extends BaseDao implements IStateDao {

	@Override
	public List<State> find() {
		List<State> list = new ArrayList<State>();
		try {
			super.connection();
			String sql = "select * from state";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				State state = new State(rs.getInt(1),rs.getString(2));
				list.add(state);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}
	@Override
	public State find(int stateId) {
		State state = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from state where stateId=?";
			super.getPst(sql);
			pstmt.setInt(1, stateId);
			
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				state = new State(rs.getInt(1),rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return state;
	}

}
