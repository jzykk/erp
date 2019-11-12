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
import com.company.service.IRepertoryService;
import com.company.service.impl.RepertoryServiceImpl;
import com.company.vo.RepertoryVo;

/**
 * Servlet implementation class RepertoryDecAction
 */
@WebServlet("/repertorydec.action")
public class RepertoryDecAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RepertoryDecAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建业务逻辑实现对象
		IRepertoryService repertoryService = new RepertoryServiceImpl();
		// 增加安全验证
		HttpSession session = request.getSession();
		// 从session中取出当前登录人
		Object obj = session.getAttribute("current_user");
		if (obj != null) {
			User user = (User) obj;
			System.out.println(user.getName());

			List<RepertoryVo> list = repertoryService.findDecorate();

			request.setAttribute("RepertoryVo", list);
			System.out.println(list);
			request.getRequestDispatcher("kucun.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("404.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
