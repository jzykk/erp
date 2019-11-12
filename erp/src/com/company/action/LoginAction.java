package com.company.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.User;
import com.company.service.IUserService;

import com.company.service.impl.UserServiceImpl;

/**
 * @author Davi
 * @category 登录控制器
 */
@WebServlet("/login.action")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建业务逻辑对象
		IUserService userService = new UserServiceImpl();
		// 接收用户输入的验证码
		String captcha = request.getParameter("captcha");
		// 判断用户输入的验证码是否正确
		String sessionCaptcha = request.getSession().getAttribute("simpleCaptcha").toString();
		// 判断用户输入的验证码是否正确
		if (captcha.equals(sessionCaptcha)) {
			// 接收用户传入的用户名+密码
			String name = request.getParameter("name");
			String pass = request.getParameter("pass");
			System.out.println(name);
			System.out.println(pass);
			// 调用业务逻辑对象的方法（查询），得到用户对象
			User user = userService.findByName(name, pass);
			// 根据返回结果响应
			if (user != null) {
				System.out.println("登录成功");
				// 创建Session，将用户对象放入到session中
				HttpSession session = request.getSession();
				session.setAttribute("current_user", user);
				session.setMaxInactiveInterval(3600);
				if (user.getDid() == 1) {
					request.getRequestDispatcher("userlist.action?page=1").forward(request, response);
				} else if (user.getDid() == 2 || user.getDid() == 3 || user.getDid() == 4) {
					request.getRequestDispatcher("indent.action").forward(request, response);
				} else if (user.getDid() == 5) {
					request.getRequestDispatcher("repertorycar.action").forward(request, response);
				} else {
					// 转发到404页面
					request.getRequestDispatcher("404.jsp").forward(request, response);
				}
			} else {
				System.out.println("失败");
				request.setAttribute("mes", "密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} else {
			System.out.println("验证码校验错误");
			request.setAttribute("mes", "验证码错误");
			// 转发到登录页面
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
