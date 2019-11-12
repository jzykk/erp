<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单信息列表-阿斯顿马丁</title>
<link rel="stylesheet" type="text/css" href="css/indents.css" />
</head>
<body>
	<!-- 头部  -->
	<c:import url="header.jsp"></c:import>
	<!-- user信息 -->
	<div class="userxinxi">
		<div class="d2 allwidth">
			<h1 class="userxinxi1">订单信息列表</h1>
			<br>
			<table class="table table-hover">
				<tr>
					<th class="userxinxi2">订单编号</th>
					
					<th class="userxinxi2">商品编号</th>
					<th class="userxinxi2">客户姓名</th>
					<th class="userxinxi2">销售顾问</th>
					<th class="userxinxi2">录入时间</th>
					<th class="userxinxi2">保险</th>
					<th class="userxinxi2">成交价</th>
					<th class="userxinxi2">订单状态</th>
					<th class="userxinxi2">操作</th>
				</tr>
				<c:forEach items="${indentVos}" var="indentVo">
					<tr>
						<td class="userxinxi3">${indentVo.indentId}</td>
						
						<td><a class="userxinxi3" href="#">${indentVo.spid}<a></td>
						<td class="userxinxi3">${indentVo.clientname}</td>
						<td class="userxinxi3">${indentVo.name}</td>
						<td class="userxinxi3">${indentVo.indentdate}</td>
						<td class="userxinxi3">${indentVo.insurance}</td>
						<td class="userxinxi3">${indentVo.transaction_price}</td>
						<td class="userxinxi3">${indentVo.statename}</td>
						<%-- <td class="userxinxi3">${indentVo.spid}</td> --%>
						<td class="userxinxi3"><c:if
								test="${current_user.did==1||current_user.did==3}">
								<a href="addindent.action?type=2">删除</a>&nbsp;&nbsp;<a href="#">编辑</a>
							</c:if>
							<c:if
								test="${current_user.did==2&&indentVo.stateId==3}">
								<a href="#">驳回</a>&nbsp;&nbsp;<a href="#">同意</a>
							</c:if></td>
					</tr>
				</c:forEach>
			</table>

		</div>
	</div>
	</div>
	<!-- 脚部 -->
	<c:import url="wei.jsp"></c:import>
	<!-- 脚部结束 -->
</body>
</html>