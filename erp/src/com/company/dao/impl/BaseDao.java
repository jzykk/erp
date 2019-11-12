package com.company.dao.impl;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

/**
 * @author 金子阳
 * @category 数据库连接基类
 */
public class BaseDao {

	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;

	// 注册驱动
	protected void regist() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testName() throws Exception {
		connection();
	}

	// 创建数据库连接
	protected void connection() {
		try {
			regist();
			conn = DriverManager.getConnection(
					"jdbc:mysql://172.3.21.210:3306/erp?useUnicode=true&characterEncoding=utf8", "root", "root");
			
			System.out.println("mysql连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 创建sql语句
	protected void getPst(String sql) {
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 执行sql返回结果集

	// 关闭数据库连接
	protected void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
