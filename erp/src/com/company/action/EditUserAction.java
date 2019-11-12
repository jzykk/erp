package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import com.company.vo.UserVo;

/**
 * @author 金子阳
 * @category 用户列表控制器
 * @category type 1:删除，2:准备编辑，3:保存编辑
 */
@WebServlet("/edituser.action")
public class EditUserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditUserAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("111");
		// 创建业务逻辑对象
		IUserService userService = new UserServiceImpl();
		IProvinceService provinceService = new ProvinceServiceImpl();
		ICityService cityService = new CityServiceImpl();
		ICountyService countyService = new CountyServiceImpl();
		// 从session中取到当前用户
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("current_user");
		// 传递给业务逻辑得到返回值结果
		String idstr = request.getParameter("id");
		String headimg = null;
		if (obj != null) {
			// 判断是否为管理员
			User user = (User) obj;

			// 取出参数
			String type = request.getParameter("type");
			if (type.equals("1")) {

				String uid = request.getParameter("uid");
				System.out.println(uid);
				boolean flag = userService.delete(uid);
				// 转发到用户列表页面
				if (flag) {
					response.sendRedirect("userlist.action?page=1&uid=" + user.getId());
				} else {
					System.err.println(1);
					request.setAttribute("err", 1);
					request.getRequestDispatcher("userlist.action?page=1&uid=" + user.getId()).forward(request, response);

				}
			} else if (type.equals("2")) {
				// headimg = UpLoadImg.headUload(this.getServletConfig(),
				// request, response);
				// System.out.println(headimg);
				user = userService.find(idstr);
				request.setAttribute("user", user);
				request.getRequestDispatcher("updateuser.jsp").forward(request, response);

			} else if (type.equals("3")) {

				String id = request.getParameter("id");
				String name = request.getParameter("name1");
				System.err.println(name);
				String picture = headimg;
				String pass1 = request.getParameter("pass1");
				String pass2 = request.getParameter("pass2");
				String did = request.getParameter("did");
				String sex = request.getParameter("sex");
				String age = request.getParameter("age");
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
				int iid = Integer.valueOf(id);
				int idid = Integer.valueOf(did);
				int iage = Integer.valueOf(age);
				User u = new User(iid, idid, name, pass1, sex, iage, tel, card, address);
				System.err.println(u.getName());
				boolean flag = userService.update(u);
				if (flag) {
					request.getRequestDispatcher("userlist.action?page=1").forward(request, response);
				} else {
					request.getRequestDispatcher("404.jsp").forward(request, response);
				}
			}

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
