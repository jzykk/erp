package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.Indent;
import com.company.bean.User;
import com.company.service.IIndentService;
import com.company.service.impl.IndentServiceImpl;
import com.company.vo.IndentVo;

/**
 * @author yd
 * @category 添加订单信息
 * @category type 1：删除 2：编辑订单 3：保存订单
 */
@WebServlet("/editindent.action")
public class EsitIndentAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EsitIndentAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置订单业务逻辑实现对象
		IIndentService iIndentService = new IndentServiceImpl();
		// 从session中取到当前用户
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("current_user");
		if (obj != null) {
			// 取出参数
			Indent indent = null;
			List<IndentVo> list = null;
			String type = request.getParameter("type");
			if (type.equals("1")) {
				String indentId = request.getParameter("indentId");
				boolean flag = iIndentService.delete(indentId);
				if (flag) {
					response.sendRedirect("indents.jsp?uid=" + indent.getIndentId());
				} else {
					request.getRequestDispatcher("404.jsp").forward(request, response);
				}
			} else if (type.equals("2")) {
				
				list = iIndentService.find();
				request.setAttribute("list", list);
				request.getRequestDispatcher("addindent.jsp").forward(request, response);

			} else if (type.equals("3")) {
				String indentId = request.getParameter("indentId");
				String statename = request.getParameter("statename");
				String clientname = request.getParameter("clientname");
				String name = request.getParameter("name");
				String indentdate = request.getParameter("indentdate");
				String insurance = request.getParameter("insurance");
				String transaction_price = request.getParameter("transaction_price");
				boolean flag = iIndentService.update(indentId);
				if (flag) {
					request.getRequestDispatcher("indents.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("404.jsp").forward(request, response);
				}

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
