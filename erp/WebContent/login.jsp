<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>登录-欢迎来到阿斯顿马丁</title>
<!-- Meta-Tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords"
	content="Key Login Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
	function flash() {
		/*	document.getElementById("captcha")*/
		$("#captcha").attr("src", "captcha.action");
		$("#mes").html("");
		/* window.location.href="login.jsp"; */
	}
</script>
<script type="text/javascript" src="js/jquery.js"></script>
<!-- //Meta-Tags -->
<!-- Index-Page-CSS -->
<link rel="stylesheet" href="css/style1.css" type="text/css" media="all">
<!-- //Custom-Stylesheet-Links -->
<!--fonts -->
<!-- //fonts -->
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css"
	media="all">
<!-- //Font-Awesome-File-Links -->


</head>
<body>
	<section class="main">
		<div class="layer">

			<div class="content-w3ls">
				<div class="content-bottom">
					<form method="post" role="form" action="login.action">
						<div class="field-group">
							<div class="wthree-field">
								<input name="name" id="text1" type="text" value=""
									placeholder="Username" required>
							</div>
						</div>
						<div class="field-group">
							<div class="wthree-field">
								<input name="pass" id="myInput" type="Password"
									placeholder="Password">
							</div>
						</div>
						<div class="field-group">
							<div class="wthree-field">
								<input name="captcha" id="myInput" type="captcha"
									placeholder="Input your captcha">
							</div>
						</div>
						<div style="float: left; margin-top: 7px;">
							<img id="captcha" style="height: 34px;" onclick="flash()"
								src="captcha.action"> <span id="mes"
								style="color: red; margin-left: 10px;">${requestScope.mes }</span>
						</div>
						<div class="wthree-field">
							<button type="submit" class="btn">Get Started</button>
						</div>
						<ul class="list-login">
							<li class="switch-agileits"><label class="switch"> <input
									type="checkbox"> <span class="slider round"></span>
									keep Logged in
							</label></li>
						</ul>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- 脚部 -->
	<c:import url="wei.jsp"></c:import>
	<!-- 脚部结束 -->
</body>
</html>