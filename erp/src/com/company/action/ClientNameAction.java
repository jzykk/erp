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
import com.company.service.impl.ClientServiceImpl;

import net.sf.json.JSONObject;

/**
 * @author castle
 * @category 客户姓名下拉框控制器
 */
@WebServlet("/clientname.action")
public class ClientNameAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClientNameAction() {
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
		User user = (User) obj;
		String id = String.valueOf(user.getId());
		List list = null;// 声明一个集合
		list = clientService.find(id);
		// 创建JSON对象
		JSONObject json = new JSONObject();
		// 将集合放入json中
		json.put("list", list);
		// 将json传出
		response.getWriter().print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
