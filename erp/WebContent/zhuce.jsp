<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加员工-阿斯顿马丁</title>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/zhuce.css" />
<script src="js/zhuce.js"></script>


</head>
<body>
	<!-- 头部  -->
	<c:import url="header.jsp"></c:import>
	<!--
        	员工注册
        -->
	<div class="deng2">
		<div class="container allwidth">
			<div class="widthtwo regist">
				<h1 style="color: white; font-family: '楷体'; font-weight: bolder;">添&nbsp;加&nbsp;员&nbsp;工</h1>
				<form id="form1" action="regist.action" method="post">
					<table class="t1">
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">工号：<input
								id="id" onblur="idblur()" type="text" class="form-control"
								name="id" placeholder="please input id" /> <span id="id_exit"
								style="color: red;"></span>
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">用户名：<input
								id="name" onblur="nameBlur()" type="text" class="form-control"
								name="name" placeholder="please input your name" /> <span
								id="name_exit" style="color: red;"></span>
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">密码:<input
								id="pass1" onblur="nameBlur()" type="password"
								class="form-control" name="pass1"
								placeholder="please input your password" /></td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">确认密码:<input
								id="pass2" onblur="nameBlur()" type="password"
								class="form-control" name="pass2"
								placeholder="ensure your password" /></td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">职务:<br />
								<select class="form-control address" id="did" name="did">
									<option value='0'>--请选择职务--</option>
									<option value='1'>总经理</option>
									<option value='2'>销售经理</option>
									<option value='3'>销售顾问</option>
									<option value='4'>会计</option>
									<option value='5'>库管</option>
							</select> <input type="radio" checked="checked" name="sex" value="男" />男&nbsp;&nbsp;
								<input type="radio" name="sex" value="女" />女
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">年龄：<input
								id="age" " type="text" class="form-control" name="age"
								placeholder="please input your age" />
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">住址:<br />
								<select class="form-control address" id="provincedId"
								name="provinceId" onchange="showCity(this.value)"><option
										value='0'>-prov-</option></select> <select class="form-control address"
								id="cityId" name="cityId" onchange="showArea(this.value)"><option
										value='0'>-city-</option></select> <select class="form-control address"
								id="areaId" name="areaId"><option value='0'>-area-</option></select>
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">电话:<input
								id="tel" type="text" class="form-control" name="tel" /></td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">身份证号:<input
								id="card" type="text" class="form-control" name="card" /></td>
						</tr>
						<tr class="button1">
							<td align="center">
								<button type="button" onclick="check()" class="btn btn-success">submit</button>
								<button type="reset" class="btn btn-info">reset</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<!--注册结束 -->
	<!-- 脚部 -->
	<c:import url="wei.jsp"></c:import>
	<!-- 脚部结束 -->
</body>
</html>
