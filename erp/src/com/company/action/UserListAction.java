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
import com.company.vo.UserVo;

/**
 * @author Davi
 * @category 用户列表控制器
 */
@WebServlet("/userlist.action")
public class UserListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserListAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建业务逻辑对象
		IUserService userService = new UserServiceImpl();
		// 增加安全验证
		HttpSession session = request.getSession();
		// 从session中取出当前登录人
		Object obj = session.getAttribute("current_user");
		request.setAttribute("err", request.getAttribute("err"));
		String p = request.getParameter("page");
		request.setAttribute("page", p);
		int page = Integer.valueOf(p);
		if (obj != null) {
			User user = (User) obj;
			if (user.getDid() != 1) {

				// 调用业务逻辑对象方法得到用户列表
				List<UserVo> list = userService.findById(user.getId());
				List<UserVo> list1 = null;
				request.setAttribute("pages", 1);
				// 将集合放入request作用域中
				request.setAttribute("userList", list);
				// 转发到：用户列表页面
				request.getRequestDispatcher("user.jsp").forward(request, response);
			} else {

				// 调用业务逻辑对象方法得到用户列表
				List<UserVo> list = userService.findUserList(page);
				List<UserVo> list1 = null;
				int i = 0;
				do {
					i++;
					list1 = userService.findUserList(i);

				} while (list1.size() != 0);
				System.out.println(i);
				int pages = i - 1;
				request.setAttribute("pages", pages);
				// 将集合放入request作用域中
				request.setAttribute("userList", list);
				// 转发到：用户列表页面
				request.getRequestDispatcher("user.jsp").forward(request, response);
			}

		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
