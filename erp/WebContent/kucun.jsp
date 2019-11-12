<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>库存信息列表-阿斯顿马丁</title>

<link rel="stylesheet" type="text/css" href="css/client.css" />
<link href="css/header.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<link href="css/wei.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	<!-- 头部  -->
	<c:import url="header.jsp"></c:import>

	<!-- user信息 -->
	<div class="userxinxi">
		<div class="d2 allwidth">
			<h1 class="userxinxi1">库存信息列表</h1>
			<br>
			<table class="table table-hover">
				<tr>
					<th class="userxinxi2">商品ID</th>
					<th class="userxinxi2">商品</th>
					<th class="userxinxi2">库存数量</th>
					<c:if test="${current_user.did==5||current_user.did==1 }">
						<th class="userxinxi2">操作</th>
					</c:if>

				</tr>
				<c:forEach items="${RepertoryVo}" var="Rep">
					<tr>
						<td class="userxinxi3">${Rep.spid}</td>
						<td><a class="userxinxi3">${Rep.spname}</td>
						<td class="userxinxi3">${Rep.repertorynum}</td>
						<c:if test="${current_user.did==5||current_user.did==1 }">
							<td class="userxinxi3"><a href="#">编辑</a></td>
						</c:if>

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
