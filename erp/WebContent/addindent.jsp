<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加订单-阿斯顿马丁</title>
<link rel="stylesheet" type="text/css" href="css/addclient.css" />
<link href="css/header.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<link href="css/wei.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="js/bootstrap.min.js"></script>
<script src="js/option.js"></script>
</head>
<body>
	<!-- 头部  -->
	<c:import url="header.jsp"></c:import>

	<!--
        	添加订单
        -->
	<div class="deng2">
		<div class="container allwidth">
			<div class="widthtwo regist">
				<h1 style="color: white; font-family: '楷体'; font-weight: bolder;">添&nbsp;加&nbsp;订&nbsp;单</h1>
				<form id="form1" action="addindent.action" method="post">
					<table class="t1">
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">订单编号：<input
								id="indentId" onblur="nameBlur()" type="text"
								class="form-control" name="indentId" /> <span id="name_exit"
								style="color: red;"></span>

							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">订单状态:<br />
								<select class="form-control address" id="indentstate"
								name="stateId">
									<option value='0'>订单状态</option>
							</select>
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">商品类型:<br />
								<select class="form-control address" id="typename"
								name="typename" onchange="showspname(this.value)"></select>
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">商品:<br />
								<select class="form-control address" id="spname" name="spid"></select>
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">订单客户:<br />
								<select class="form-control address" id="clientid"
								name="clientid""></select>
							</td>
						</tr>
						
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">保险:<br />
								<select class="form-control address" id="provincedId"
								name="insurance">
									<option value='是'>是</option>
									<option value='否'>否</option>
							</select>
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">成交价:<input
								id="tel" type="text" class="form-control"
								name="transaction_price" /></td>
						</tr>
						<tr class="button1">
							<td align="center">
								<button type="submit" class="btn btn-success">submit</button>
								<button type="reset" class="btn btn-info">reset</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<!--
        	注册结束
        -->

	<!-- 脚部 -->
	<c:import url="wei.jsp"></c:import>
	<!-- 脚部结束 -->
</body>
</html>