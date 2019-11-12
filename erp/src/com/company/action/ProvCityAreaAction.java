package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.service.ICityService;
import com.company.service.ICountyService;
import com.company.service.IProvinceService;
import com.company.service.impl.CityServiceImpl;
import com.company.service.impl.CountyServiceImpl;
import com.company.service.impl.ProvinceServiceImpl;

import net.sf.json.JSONObject;

/**
 * @author Davi
 * @category 省市区的控制器
 * @category type:1.省份  2.市  3.区县
 */
@WebServlet("/pca.action")
public class ProvCityAreaAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProvCityAreaAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建业务逻辑对象
		IProvinceService provinceService = new ProvinceServiceImpl();
		ICityService cityService = new CityServiceImpl();
	    ICountyService areaService = new CountyServiceImpl();
		//接收type类型参数
		String type = request.getParameter("type");
		List list = null;//声明一个集合
		if(type.equals("1")){
			//查省
			list = provinceService.findAll();
		}else if(type.equals("2")){
			//查市
			String provinceId = request.getParameter("provinceId");
			list = cityService.findCitiesByPid(provinceId);
		}else{
			//查区县
			String cityId = request.getParameter("cityId");
			list = areaService.findAreasByCid(cityId);
		}
		//创建JSON对象
		JSONObject json = new JSONObject();
		//将结合放入json中
		json.put("list", list);
		//将JSON传出
		response.getWriter().print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
