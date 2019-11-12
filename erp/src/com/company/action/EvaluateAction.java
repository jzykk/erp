package com.company.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bean.Evaluate;
import com.company.service.IEvaluateService;
import com.company.service.impl.EvaluateServiceImpl;
import com.company.vo.EvaluateVO;
import com.company.vo.EvaluateVO;

import net.sf.json.JSONObject;

/**
 * @author Davi
 * @category 评论的控制器
 * @category type: 1:查询所有评论,2：增加评论
 */
@WebServlet("/evaluate.action")
public class EvaluateAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private IEvaluateService evaluateService = new EvaluateServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String type = request.getParameter("type");
        String clientid = request.getParameter("clientid");
		JSONObject json = new JSONObject();
		if (type.equals("1")) {
			//以集合的形式显示出来
			List<EvaluateVO> list = evaluateService.find(clientid);
			json.put("list", list);
		} else if (type.equals("2")) {
			
			int clientid1 = Integer.valueOf(request.getParameter("clientid"));
			int evaluatesco = Integer.valueOf(request.getParameter("evaluatesco"));
			String content = request.getParameter("content");
			//创建evaluate对象，将值传入evaluate中
			Evaluate evaluate = new Evaluate(clientid1, new Date(System.currentTimeMillis()), evaluatesco, content);
			//调用evaluate的添加方法
		    boolean flag = evaluateService.add(evaluate);
			json.put("flag", flag);
		}
		out.print(json.toString());
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
