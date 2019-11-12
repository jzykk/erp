package com.company.action;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bean.City;
import com.company.bean.County;
import com.company.bean.Province;
import com.company.bean.User;
import com.company.service.ICityService;
import com.company.service.ICountyService;
import com.company.service.IProvinceService;
import com.company.service.IUserService;
import com.company.service.impl.CityServiceImpl;
import com.company.service.impl.CountyServiceImpl;
import com.company.service.impl.ProvinceServiceImpl;
import com.company.service.impl.UserServiceImpl;

/**
 * @author Davi
 * @category 员工注册控制器
 */
@WebServlet("/regist.action")
public class RegistAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建用户业务逻辑对象
		IUserService userService = new UserServiceImpl();
		IProvinceService provinceService = new ProvinceServiceImpl();
		ICityService cityService = new CityServiceImpl();
		ICountyService countyService = new CountyServiceImpl();
		int id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("name");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		int did = Integer.valueOf(request.getParameter("did"));
		String sex = request.getParameter("sex");
		int age = Integer.valueOf(request.getParameter("age"));
		String tel = request.getParameter("tel");
		String card = request.getParameter("card");
		String provinceId = request.getParameter("provinceId");
		String cityId = request.getParameter("cityId");
		String areaId = request.getParameter("areaId");
		Province province = provinceService.findObject(provinceId);
		City city = cityService.findObject(cityId);
		County county = countyService.findObject(areaId);
		String pro = null;
		String cit = null;
		String cou = null;
		if (province != null) {
			pro = province.getProvince();
		} else {
			pro = "";
		}
		if (city != null) {
			cit = city.getCity();
		} else {
			cit = "";
		}
		if (county != null) {
			cou = county.getAreas();
		} else {
			cou = "";
		}
		String address = pro + cit + cou;
		// 调用业务逻辑方法返回结果
		User user = new User(id, did, name, pass1, sex, age, tel, card, address, new Date(System.currentTimeMillis()));
		boolean flag = userService.add(user);
		System.out.println(flag);
		// 根据返回值进行判断，响应
		if (flag) {
			response.sendRedirect("userlist.action?page=1");
		} else {
			response.sendRedirect("404.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
