package com.company.action;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.Duty;
import com.company.bean.Indent;
import com.company.bean.User;
import com.company.service.IDutyService;
import com.company.service.IIndentService;
import com.company.service.impl.DutyServiceImpl;
import com.company.service.impl.IndentServiceImpl;
import com.company.vo.IndentVo;

/**
 * @author yd
 * @category 订单控制器
 *
 */
@WebServlet("/indent.action")
public class IndentAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IndentAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建订单业务逻辑实现对象
		IIndentService indentService = new IndentServiceImpl();
		// 增加安全验证
		HttpSession session = request.getSession();
		// 从session中取出当前登录人
		Object obj = session.getAttribute("current_user");
		// List<IndentVo> list = null;
		if (obj != null) {
			User user = (User) obj;
			System.out.println(user.getName());
			if (user.getDid() == 2 || user.getDid() == 1 || user.getDid() == 4 || user.getDid() == 5) {
				List<IndentVo> list = indentService.find();

				request.setAttribute("indentVos", list);
				System.out.println(list);
				request.getRequestDispatcher("indents.jsp").forward(request, response);
			} else if (user.getDid() == 3) {
				System.out.println("进入了3");
				String uid = String.valueOf(user.getId());
				System.out.println(user.getId());
				List<IndentVo> list = indentService.findById(uid);
				request.setAttribute("indentVos", list);
				System.out.println(list);
				request.getRequestDispatcher("indents.jsp").forward(request, response);

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
