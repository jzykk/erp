package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.company.bean.Client;
import com.company.bean.Duty;
import com.company.bean.User;
import com.company.dao.IDutyDao;
import com.company.dao.IUserDao;
import com.company.dao.impl.DutyDaoImpl;
import com.company.dao.impl.UserDaoImpl;
import com.company.service.IUserService;
import com.company.vo.UserVo;

import javafx.collections.ListChangeListener.Change;

public class UserServiceImpl implements IUserService {
	private IUserDao userdao = new UserDaoImpl();
	private IDutyDao dutyDao = new DutyDaoImpl();

	@Override
	public User find(String id, String pass) {
		User user = null;
		if (id != null && !id.equals("")) {
			int idInt = Integer.valueOf(id);
			user = userdao.find(idInt, pass);
		}
		return user;
	}

	@Override
	public User findByName(String name, String pass) {
		User user = null;
		if (name != null && !name.equals("")) {
			user = userdao.find(name, pass);
		}
		return user;
	}

	@Override
	public boolean add(User user) {
		return userdao.add(user) > 0 ? true : false;
	}

	@Override
	public List<UserVo> findUserList(int page) {
		List<UserVo> list = new ArrayList<UserVo>();
		List<User> list2 = userdao.findUserList(page);
		Change(list, list2);
		return list;
	}

	private void Change(List<UserVo> list, List<User> list2) {
		for (User user : list2) {
			Duty duty = dutyDao.find(user.getDid());
			String dname = duty.getDname().toString();
			String inputdate = user.getInputdate().toString();
			UserVo vo = new UserVo(user.getId(), user.getDid(), dname, user.getName(), user.getPass(), user.getSex(),
					user.getAge(), user.getTel(), user.getCard(), user.getAddress(), inputdate);
			list.add(vo);
		}
	}

	@Override
	public boolean delete(String id) {
		int userId = Integer.valueOf(id);
		return userdao.delete(userId) > 0 ? true : false;
	}

	@Override
	public User find(String id) {
		User user = null;
		if (id != null && !id.equals("")) {
			int userId = Integer.valueOf(id);
			user = userdao.find(userId);
		}
		return user;
	}

	public List<UserVo> findById(int id) {
		List<UserVo> list = new ArrayList<UserVo>();
		List<User> list2 = userdao.findUserById(id);
		Change(list, list2);
		return list;
	}

	@Test
	public void test() {
		User u = new User(4, 3, "aa", "1212", "男", 7, "12312312", "123123", "");
		boolean flag = update(u);
		System.out.println(flag);
	}

	@Override
	public boolean update(User user) {
		boolean flag = false;
		if (user != null && user.getId() != 0) {
			int i = userdao.update(user);
			if (i > 0) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public boolean findByUserName(String name) {

		return userdao.findByUserName(name) == null ? true : false;
	}

	@Override
	public boolean findById(String id) {
		int userId = Integer.valueOf(id);
		return userdao.find(userId) == null ? true : false;
	}

}
