<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户信息列表-阿斯顿马丁</title>
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
			<h1 class="userxinxi1">客户信息列表</h1>
			<table class="table table-hover">
			<br>
				<tr>
					<th class="userxinxi2">客户编号</th>
					<th class="userxinxi2">客户类型</th>
					<th class="userxinxi2">姓名</th>
					<th class="userxinxi2">性别</th>
					<th class="userxinxi2">住址</th>
					<th class="userxinxi2">身份证号</th>
					<th class="userxinxi2">电话</th>
					<th class="userxinxi2">负责员工</th>
					<th class="userxinxi2">操作</th>
				</tr>
				<c:forEach items="${list}" var="clientVo">
					<tr>
						<td><a class="userxinxi3" href="#" name="clientid">${clientVo.clientid}<a></td>
						<td><a class="userxinxi3" href="#" name="kname">${clientVo.kname}<a></td>
						<td><a class="userxinxi3" href="#" name="clientname">${clientVo.clientname}</a></td>
						<td class="userxinxi3" name="csex"><c:if
								test="${clientVo.csex=='女' }">女</c:if> <c:if
								test="${clientVo.csex!='女' }">男</c:if></td>
						<td class="userxinxi3" name="caddress">${clientVo.caddress}</td>
						<td class="userxinxi3" name="phone">${clientVo.ccardid}</td>
						<td class="userxinxi3" name="ccardid">${clientVo.phone}</td>
						<td class="userxinxi3" name="id">${clientVo.id}</td>
						<td class="userxinxi3"><a href="personsselect.action">编辑</a></td>
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
