package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.User;
import com.company.service.IUserService;
import com.company.service.impl.UserServiceImpl;

import net.sf.json.JSONObject;

@WebServlet("/useajax.action")
public class UseAjaxAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UseAjaxAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IUserService userService = new UserServiceImpl();
		String p = request.getParameter("page");
		int page = Integer.valueOf(p);
		List list = null;// 声明一个集合

		list = userService.findUserList(page);
		System.out.println(list);
		// 创建JSON对象
		JSONObject json = new JSONObject();
		// 将结合放入json中
		json.put("lists", list);
		// 将JSON传出
		response.getWriter().print(json);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
