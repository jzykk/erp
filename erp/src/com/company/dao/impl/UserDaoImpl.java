package com.company.dao.impl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.User;
import com.company.dao.IUserDao;

public class UserDaoImpl extends BaseDao implements IUserDao {

	@Override
	public User find(int id, String pass) {
		User user = null;
		try {
			super.connection();
			String sql = "select * from user where id=? and pass=?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return user;
	}

	@Override
	public User find(String name, String pass) {
		User user = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from user where name = ? and pass = ?";
			super.getPst(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return user;
	}

	@Override
	public int add(User user) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into User (id,did,name,pass,sex,age,tel,card,address,inputdate)"
					+ " values (?,?,?,?,?,?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, user.getId());
			pstmt.setInt(2, user.getDid());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getPass());
			pstmt.setString(5, user.getSex());
			pstmt.setInt(6, user.getAge());
			pstmt.setString(7, user.getTel());
			pstmt.setString(8, user.getCard());
			pstmt.setString(9, user.getAddress());
			pstmt.setDate(10, user.getInputdate());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Test
	public void test2() {
		List<User> list = this.findUserList(1);
		System.out.println(list.size());
	}

	@Override
	public List<User> findUserList(int page) {
		List<User> list = new ArrayList<User>();
		try {
			super.connection();
			String sql = "select * from user where id<>1 limit ?,10 ";
			super.getPst(sql);
			int pp = (page - 1) * 10;
			System.out.println("这是PP：" + pp);
			pstmt.setInt(1, pp);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10));

				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	public List<User> findUserById(int id) {
		List<User> list = new ArrayList<User>();
		try {
			super.connection();
			String sql = "select * from user where id = ?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10));

				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public int delete(int id) {
		int i = 0;
		try {
			super.connection();
			String sql = "delete from user where id = ?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Override
	public User find(int id) {
		User user = null;
		try {
			super.connection();
			String sql = "select * from User where id = ?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return user;
	}

	@Test
	public void test() {
		User u = new User(4, 3, "aa", "1212", "男", 7, "12312312", "123123", "");
		System.out.println(u.getDid());
		System.out.println(u.getName());
		System.out.println(u.getPass());
		System.out.println(u.getSex());
		System.out.println(u.getAge());
		System.out.println(u.getTel());
		System.out.println(u.getCard());
		System.out.println(u.getAddress());
		System.out.println(u.getId());
		int i = update(u);
		System.out.println(i);
	}

	@Override
	public int update(User user) {
		int i = 0;
		try {
			super.connection();
			String sql = "update `user` set did=?, pass=?,sex=?,age=?,tel=?, card=?,address=? where id=?";
			super.getPst(sql);
			pstmt.setInt(1, user.getDid());
			pstmt.setString(2, user.getPass());
			pstmt.setString(3, user.getSex());
			pstmt.setInt(4, user.getAge());
			pstmt.setString(5, user.getTel());
			pstmt.setString(6, user.getCard());
			pstmt.setString(7, user.getAddress());
			pstmt.setInt(8, user.getId());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Override
	public User findByUserName(String name) {
		User user = null;
		try {
			super.connection();
			String sql = "select * from User where name=?";
			super.getPst(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return user;
	}

}
