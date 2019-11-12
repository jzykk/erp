package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Car;
import com.company.bean.Car_level;
import com.company.bean.Client;
import com.company.bean.ClientKind;
import com.company.dao.IClientKindDao;

/**
 * @author Davi
 * @category 客户类型数据实现类
 */
public class ClientKindDaoImpl extends BaseDao implements IClientKindDao {

	@Override
	public List<ClientKind> find() {
		List<ClientKind> list = new ArrayList<ClientKind>();
		try {
			super.connection();
			String sql = "select * from clientkind";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				ClientKind clientkind = new ClientKind(rs.getInt(1),rs.getString(2));
				list.add(clientkind);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public ClientKind findByKid(int kid) {
		ClientKind clientkid = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from clientkind where kid = ?";
			super.getPst(sql);
			pstmt.setInt(1, kid);
			super.rs = pstmt.executeQuery();
			while(rs.next()){
				clientkid = new ClientKind(rs.getInt(1),rs.getString(2));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.close();
		}
	return clientkid;
	}
}
