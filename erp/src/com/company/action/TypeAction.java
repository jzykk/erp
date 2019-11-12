package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.service.ICarService;
import com.company.service.IDecorateService;
import com.company.service.ITypeService;
import com.company.service.impl.CarServiceImpl;
import com.company.service.impl.DecorateServiceImpl;
import com.company.service.impl.TypeServiceImpl;

import net.sf.json.JSONObject;

/**
 * @author 金子阳
 * @category 商品类型下拉框控制器
 *
 */
@WebServlet("/type.action")
public class TypeAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TypeAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建业务逻辑对象
		ITypeService typeService = new TypeServiceImpl();
		ICarService carService = new CarServiceImpl();
		IDecorateService decorateService = new DecorateServiceImpl();
		String type = request.getParameter("type");
		String typeid = request.getParameter("typeid");
		List list = null;// 声明一个集合
		if (type.equals("1")) {
			list = typeService.find();
		} else if (type.equals("2") && typeid.equals("1")) {
			list = carService.find();
		} else if (type.equals("2") && typeid.equals("2")) {
			list = decorateService.find();
		}

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
