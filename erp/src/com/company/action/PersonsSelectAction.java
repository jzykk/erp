package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.Client;
import com.company.bean.ClientKind;
import com.company.bean.User;
import com.company.service.IClientKindService;
import com.company.service.IClientService;
import com.company.service.impl.ClientKindServiceImpl;
import com.company.service.impl.ClientServiceImpl;
import com.company.vo.ClientVo;

/**
 * @author yd
 * @category 客户个人信息展示
 */
@WebServlet("/personsselect.action")
public class PersonsSelectAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PersonsSelectAction() {
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
		System.out.println("的点点滴滴");

		if (obj != null) {
			User user = (User) obj;
			System.out.println("~~~~~~~~~");
			System.out.println(user.getName());
			Client client = null;
			String clientid = request.getParameter("clientid");

			if (clientid != null && !clientid.equals("")) {
				client = clientService.find1(clientid);
				request.setAttribute("client1", client);
				request.getRequestDispatcher("updateClient.jsp").forward(request, response);

			} else {
				request.getRequestDispatcher("404.jsp").forward(request, response);
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
