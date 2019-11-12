<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>404-阿斯顿马丁</title>
		<!-- 引入 Bootstrap -->
		<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
		<script src="js/jquery.js"></script>
		<!-- 包括所有已编译的插件 -->
		<script src="js/bootstrap.min.js"></script>
		<link href="css/style.css" rel="stylesheet" />
		<script type="text/javascript">
			var num = 3;
			$(function(){
				console.log(1);
				myFun();
			});
			
			function myFun(){
				if(num>0){
					$("#num").html(num);
					setTimeout("myFun()", 1000);
					num--;
				}else{
					//3秒后跳转到首页
					window.location.href = "login.jsp";
				}
			} 
		</script>
	</head>

	<body>
		<!-- 头部  -->
		<c:import url="header.jsp"></c:import>
		
		<!--中间内容部分开始-->
		<div class="404">
			<p style="background-color:black;color:white;" class="404a">倒数<span id="num"></span>秒后：跳转到<a href="login.jsp">首页</a></p>
			<img style="width: 100%;position: absolute; " src="img/404.jpeg" />
		</div>
		<!--内容部分结束-->
	</body>

</html>