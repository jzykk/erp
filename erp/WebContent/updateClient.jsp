<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改客户信息-阿斯顿马丁</title>
<link rel="stylesheet" type="text/css" href="css/addclient.css" />
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/zhuce.css" />
<script src="js/zhuce.js"></script>
</head>
<body>
	<!-- 头部  -->
	<c:import url="header.jsp"></c:import>
	<!--
        	修改用户
        -->
	<script type="text/javascript">
		
	</script>
	<div class="deng2">
		<div class="container allwidth">
			<div class="widthtwo regist">
				<h1 style="color: white; font-family: '楷体'; font-weight: bolder;">修&nbsp;改&nbsp;客&nbsp;户</h1>
				<form id="form1" action="addclient.action" method="post">
					<input type="hidden" name="clientid" value="${client1.clientid }" />
					<input type="hidden" name="type" value="2" />
					<table class="t1">
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">客户名：
								<input id="clientname" type="text" class="form-control"
								name="clientname" placeholder="${client1.clientname }" />
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">客户类型:<br />
								<select class="form-control address" id="kid" name="kid">
									<option value='0'>--请修改客户类型--</option>
									<option value='1'>意向客户</option>
									<option value='2'>订单客户</option>
									<option value='3'>交车客户</option>
							</select> <input type="radio" checked="checked" name="csex" value="f" />男&nbsp;&nbsp;
								<input type="radio" name="csex" value="m" />女
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
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">电话:
								<input id="phone" type="text" class="form-control" name="tel"
								placeholder="${client1.phone }" />
							</td>
						</tr>
						<tr>
							<td
								style="color: white; font-family: '楷体'; font-weight: bolder; font-size: x-large;">身份证号:<input
								id="ccardid" type="text" class="form-control" name="ccardid"
								placeholder="${client1.ccardid }" /></td>
						</tr>
						<tr class="button1">
							<td align="center">
								<button type="button" onclick="check1()" class="btn btn-success">update</button>
								<button type="reset" class="btn btn-info">reset</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<!-- 脚部 -->
	<c:import url="wei.jsp"></c:import>
	<!-- 脚部结束 -->
</body>
</html>