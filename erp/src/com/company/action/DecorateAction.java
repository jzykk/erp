package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.service.IDecorateService;
import com.company.service.impl.DecorateServiceImpl;
import com.company.vo.DecorateVo;

/**
 * @author yd
 * @category 装潢信息列表
 */
@WebServlet("/decorate.action")
public class DecorateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DecorateAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置装潢业务逻辑实现对象
		IDecorateService decorateService = new DecorateServiceImpl();
		// 增加安全验证
		HttpSession session = request.getSession();
		// 从session中取出当前登录人
		Object obj = session.getAttribute("current_user");
		if(obj !=null){
			
			List<DecorateVo> list = decorateService.find();
			request.setAttribute("list", list);
			request.getRequestDispatcher("car.jsp?type=2").forward(request, response);
		}else{
			request.getRequestDispatcher("404.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
