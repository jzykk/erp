<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>员工信息列表-阿斯顿马丁</title>
<link rel="stylesheet" type="text/css" href="css/user.css" />
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/user.js"></script>
</head>
<body>
	<script type="text/javascript">
function delete_user(uid){
	var del = confirm("确定删除用户"+uid+"吗");
	console.log(uid);
	console.log(del);
	if(del){
		window.location="edituser.action?type=1&uid="+uid;
	}
}
var errorMsg="${requestScope.errorMessage}";
if(errorMsg!=""){
  alert(errorMsg);
}
</script>
	<!-- 头部 -->
	<c:import url="header.jsp"></c:import>

	<!-- user信息 -->
	<div class="userxinxi">
		<div class="d2 allwidth">
			<h1 class="userxinxi1">员工信息列表</h1>
			<table class="table table-hover" id="tb">
				<br>
				<tr>
					<th class="userxinxi2">员工编号</th>
					<th class="userxinxi2">职务名称</th>
					<th class="userxinxi2">姓名</th>
					<th class="userxinxi2">性别</th>
					<th class="userxinxi2">年龄</th>
					<th class="userxinxi2">电话</th>
					<th class="userxinxi2">身份证号</th>
					<th class="userxinxi2">住址</th>
					<th class="userxinxi2">入职时间</th>
					<th class="userxinxi2">操作</th>
				</tr>
				<c:forEach items="${userList}" var="userVo">
					<tr>
						<td class="userxinxi3">${userVo.id }</td>
						<td class="userxinxi3">${userVo.dname }</td>
						<td class="userxinxi3">${userVo.name }</td>
						<td class="userxinxi3"><c:if test="${userVo.sex=='女' }">女</c:if>
							<c:if test="${userVo.sex!='女' }">男</c:if></td>
						<td class="userxinxi3">${userVo.age }</td>
						<td class="userxinxi3">${userVo.tel }</td>
						<td class="userxinxi3">${userVo.card }</td>
						<td class="userxinxi3">${userVo.address }</td>
						<td class="userxinxi3">${userVo.inputdate }</td>
						<td class="userxinxi3"><c:if test="${current_user.did==1}">
								<a onclick="delete_user(${userVo.id })" style="cursor: pointer;">删除</a>&nbsp;&nbsp;
							</c:if> <a href="edituser.action?type=2&id=${userVo.id}">编辑</a></td>
					</tr>
				</c:forEach>



			</table>
			<c:if test="${current_user.did==1 }">
				<div class="pages">
					<p class="pagespp">
						<span>共${pages }页</span>&nbsp;&nbsp; <span id="spa">第${page }页</span>
					</p>
					<p class="pagespp1">
						<a onclick="showtop(1,${pages })" style="cursor: pointer;">首页</a>&nbsp;&nbsp;
						<a onclick="showlast(1,${pages })" style="cursor: pointer;"
							id="lasta"> 上一页</a>&nbsp;&nbsp; <select
							onchange="showuser(this.value)">
							<c:forEach var="i" begin="1" end="${pages }">
								<option>${i }</option>
							</c:forEach>

						</select> &nbsp;&nbsp; <a onclick="shownext(2,${pages })"
							style="cursor: pointer;" id="netxa">下一页</a>&nbsp;&nbsp;<a
							onclick="showdown(${pages },${pages })" style="cursor: pointer;">尾页</a>
					</p>
				</div>
				<c:if test="${err=='1'}">
					<script type="text/javascript">
				console.log("进来了" );
				alert('该员工账号内有客户或订单，无法删除')
				</script>
				</c:if>
		</div>
		</c:if>

	</div>
	</div>

	<!-- 脚部 -->
	<c:import url="wei.jsp"></c:import>

</body>
</html>