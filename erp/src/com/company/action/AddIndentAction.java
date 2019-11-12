package com.company.action;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.Indent;
import com.company.bean.User;
import com.company.service.IIndentService;
import com.company.service.impl.IndentServiceImpl;

/**
 * @author 金子阳
 * @category 添加订单控制器
 */
@WebServlet("/addindent.action")
public class AddIndentAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddIndentAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 创建用户业务逻辑对象
		IIndentService indentService=new IndentServiceImpl();
		HttpSession session = request.getSession();
		// 从session中取出当前登录人
		Object obj = session.getAttribute("current_user");
		User user = (User) obj;
		String iId=request.getParameter("indentId");
		int indentId=Integer.valueOf(iId);
		String stId=request.getParameter("stateId");
		int stateId=Integer.valueOf(stId);
		String spId=request.getParameter("spid");
		int spid=Integer.valueOf(spId);
		String cId=request.getParameter("clientid");
		int clientid=Integer.valueOf(cId);
		int id=user.getId();
		String insurance=request.getParameter("insurance");
		String tranprice=request.getParameter("transaction_price");
		int transaction_price=Integer.valueOf(tranprice);
		Indent indent = new Indent(indentId, stateId, spid, clientid, id, new Date(System.currentTimeMillis()), insurance, transaction_price);
		boolean flag=indentService.add(indent);
		if (flag) {
			response.sendRedirect("indent.action");
		}else{
			response.sendRedirect("404.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
