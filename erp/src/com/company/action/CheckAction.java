package com.company.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.service.IUserService;
import com.company.service.impl.UserServiceImpl;

/**
 * @author Davi
 * @category 检查用户名是否存在的控制器
 */
@WebServlet("/check.action")
public class CheckAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckAction() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建用户业务逻辑对象
		IUserService userService = new UserServiceImpl();
		String type = request.getParameter("type");
		if (type.equals("1")) {
			System.out.println("t1");
			// 接收ajax传入的名字
			String name = request.getParameter("name");
			// 调用业务逻辑对象的检查方法
			boolean flag = userService.findByUserName(name);
			// 将结果输出
			response.getWriter().print(flag);
		} else if (type.equals("2")) {
			System.out.println("t2");
			String id = request.getParameter("id");
			System.out.println(id);
			boolean flag = userService.findById(id);
			response.getWriter().print(flag);
			System.out.println(flag);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
