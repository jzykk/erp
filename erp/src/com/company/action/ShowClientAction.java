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
import com.company.service.IClientService;
import com.company.service.IUserService;
import com.company.service.impl.ClientServiceImpl;
import com.company.service.impl.UserServiceImpl;
import com.company.vo.ClientVo;


/**
 * @author yd
 * @category 显示客户信息
 * @category 
 */
@WebServlet("/showclient.action")
public class ShowClientAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowClientAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建业务逻辑对象
		IClientService clientService = new ClientServiceImpl();
		// 增加安全验证
		HttpSession session = request.getSession();
		// 从session中取出当前登录人
		Object obj = session.getAttribute("current_user");

		if (obj != null) {
			User user = (User) obj;
			System.out.println(user.getName());
			List<ClientVo> list = null;
			if (user.getDid() ==1||user.getDid() ==2||user.getDid() ==4||user.getDid() ==5) {
				// 调用业务逻辑对象方法得到用户列表
				 list = clientService.find();
				// 将集合放入request作用域中
				request.setAttribute("list", list);
				// 转发到：用户列表页面
				request.getRequestDispatcher("client.jsp").forward(request, response);
			}else{
				String uid = String.valueOf(user.getId());
				 list = clientService.find(uid);
				request.setAttribute("list", list);
				request.getRequestDispatcher("client.jsp").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("404.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
