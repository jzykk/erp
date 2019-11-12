package com.company.dao.impl;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Client;
import com.company.bean.User;
import com.company.dao.IClientDao;

public class ClientDaoImpl extends BaseDao implements IClientDao {

	@Override
	public int add(Client client) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into client (kid,clientname,csex,caddress,ccardid,phone,id)"
					+ " values (?,?,?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, client.getKid());

			pstmt.setString(2, client.getClientname());
			pstmt.setString(3, client.getCsex());
			pstmt.setString(4, client.getCaddress());
			pstmt.setString(5, client.getCcardid());
			pstmt.setString(6, client.getPhone());
			pstmt.setInt(7, client.getId());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Override
	public int update(Client client) {
		int i = 0;
		try {
			super.connection();
			String sql = "update client set clientid =?,kid=?, clientname=?,csex=?,caddress=?,ccardid=?,phone=? id=? where clientid=?";
			super.getPst(sql);
			pstmt.setInt(1, client.getClientid());
			pstmt.setInt(2, client.getKid());
			pstmt.setString(3, client.getClientname());
			pstmt.setString(4, client.getCsex());
			pstmt.setString(5, client.getCaddress());
			pstmt.setString(6, client.getCcardid());
			pstmt.setString(7, client.getPhone());
			pstmt.setInt(8, client.getId());
			pstmt.setInt(9, client.getClientid());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Test
	public void test1() {
		List<Client> list = find();
		System.out.println(list);
	}

	@Override
	public List<Client> find() {
		List<Client> list = new ArrayList<Client>();
		try {
			super.connection();
			String sql = "select * from client";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Client client = new Client(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));

				list.add(client);
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
		Client client = findById(2, 1);
		System.out.println(client);
	}

	@Override
	public Client findById(int clientid, int id) {
		Client client = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from client where clientid = ? and id = ?";
			super.getPst(sql);
			pstmt.setInt(1, clientid);
			pstmt.setInt(2, id);
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				client = new Client(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return client;
	}

	@Override
	public List<Client> findByName(String clientname, int id) {
		List<Client> list = new ArrayList<Client>();
		try {
			super.connection();
			String sql = "select * from client where clientname=? and id=?";
			super.getPst(sql);
			pstmt.setString(1, clientname);
			pstmt.setInt(2, id);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Client client = new Client(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));

				list.add(client);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Test
	public void test2() {
		List<Client> list = find(3);
		System.out.println(list);
	}

	@Override
	public List<Client> find(int id) {
		List<Client> list = new ArrayList<Client>();
		try {
			super.connection();
			String sql = "select * from client where id=?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Client client = new Client(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				;

				list.add(client);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public Client find1(int clientid) {
		Client client = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from client where clientid = ? ";
			super.getPst(sql);
			pstmt.setInt(1, clientid);

			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				client = new Client(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return client;

	}

}
