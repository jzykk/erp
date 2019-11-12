package com.company.action;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;

import com.company.bean.City;
import com.company.bean.Client;
import com.company.bean.County;
import com.company.bean.Province;
import com.company.bean.User;
import com.company.service.ICityService;
import com.company.service.IClientService;
import com.company.service.ICountyService;
import com.company.service.IProvinceService;
import com.company.service.IUserService;
import com.company.service.impl.CityServiceImpl;
import com.company.service.impl.ClientServiceImpl;
import com.company.service.impl.CountyServiceImpl;
import com.company.service.impl.ProvinceServiceImpl;
import com.company.service.impl.UserServiceImpl;
import com.company.vo.EvaluateVO;

import net.sf.json.JSONObject;

/**
 * @author Davi
 * @category 客户添加控制器
 * @category type 1：添加客户 2：编辑客户
 */
@WebServlet("/addclient.action")
public class AddClientAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddClientAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 创建用户业务逻辑对象
		IClientService clientService = new ClientServiceImpl();
		IProvinceService provinceService = new ProvinceServiceImpl();
		ICityService cityService = new CityServiceImpl();
		ICountyService countyService = new CountyServiceImpl();

		// 从session中取到当前用户
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("current_user");
		if (obj != null) {
			User user = (User) obj;
			// 接收type类型参数
			String type = request.getParameter("type");
			System.out.println(type);
			if (type.equals("1")) {
				System.out.println("进入type1");
				int kid = Integer.valueOf(request.getParameter("kid"));
				String clientname = request.getParameter("clientname");
				String csex = request.getParameter("csex");
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
				String caddress = pro + cit + cou;
				String ccardid = request.getParameter("ccardid");
				String phone = request.getParameter("tel");
				int id = user.getId();
				// 调用业务逻辑方法返回结果
				Client client = new Client(kid, clientname, csex, caddress, ccardid, phone, id);
				boolean flag = clientService.add(client);
				// 根据返回值进行判断，响应
				if (flag) {
					response.sendRedirect("showclient.action");
				} else {
					response.sendRedirect("404.jsp");
				}
			} else if (type.equals("2")) {
				System.out.println("进入type2");
				int kid = Integer.valueOf(request.getParameter("kid"));
				int clientid = Integer.valueOf(request.getParameter("clientid"));
				String clientname = request.getParameter("clientname");
				String csex = request.getParameter("csex");
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
				String caddress = pro + cit + cou;
				String ccardid = request.getParameter("ccardid");
				String phone = request.getParameter("tel");
				int id = user.getId();
				Client client = new Client(clientid, kid, clientname, csex, caddress, ccardid, phone, id);
				boolean flag = clientService.update(client);
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
