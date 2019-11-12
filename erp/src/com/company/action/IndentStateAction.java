package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.service.IStateService;
import com.company.service.impl.StateServiceImpl;

import net.sf.json.JSONObject;

/**
 * @author 金子阳
 * @category 订单状态下拉框控制器
 *
 */
@WebServlet("/indentstate.action")
public class IndentStateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IndentStateAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建业务逻辑对象
		IStateService stateService = new StateServiceImpl();
		List list = null;// 声明一个集合
		list = stateService.find();
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
