<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>商品车信息列表-阿斯顿马丁</title>
<link rel="stylesheet" type="text/css" href="css/user.css" />
</head>
<body>
	<script type="text/javascript">
		var errorMsg = "${requestScope.errorMessage}";
		if (errorMsg != "") {
			alert(errorMsg);
		}
	</script>
	<!-- 头部 -->
	<c:import url="header.jsp"></c:import>

	<!-- user信息 -->
	<div class="userxinxi">
		<div class="d2 allwidth">
			<h1 class="userxinxi1">商品车信息列表</h1>
			<c:if test="${type==1 }">
				<table class="table table-hover">
					<tr>
						<th class="userxinxi2">商品编号</th>
						<th class="userxinxi2">型号</th>
						<th class="userxinxi2">颜色</th>
						<th class="userxinxi2">配置</th>
						<th class="userxinxi2">操作</th>
					</tr>

					<c:forEach items="${list}" var="carVo">
						<tr>
							<td class="userxinxi3">${carVo.spid}</td>
							<td class="userxinxi3">${carVo.modelname}</td>
							<td class="userxinxi3">${carVo.colorname}</td>
							<td class="userxinxi3">${carVo.levelname}</td>
							<td class="userxinxi3"><a href="#">删除</a>&nbsp;&nbsp;<a
								href="#">编辑</a></td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
			<c:if test="${type==2 }">
				<table class="table table-hover">
					<tr>
						<th class="userxinxi2">商品编号</th>
						<th class="userxinxi2">装潢件</th>
						<th class="userxinxi2">操作</th>
					</tr>

					<c:forEach items="${list}" var="carVo">
						<tr>
							<td class="userxinxi3">${carVo.spid}</td>
							<td class="userxinxi3">${carVo.levelname}</td>
							<td class="userxinxi3"><a href="#">删除</a>&nbsp;&nbsp;<a
								href="#">编辑</a></td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
		</div>
	</div>
	</div>

	<!-- 脚部 -->
	<c:import url="wei.jsp"></c:import>

</body>
</html>