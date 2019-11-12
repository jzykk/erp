<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/header.css" rel="stylesheet">
</head>
<body>
	<div class="tou2"></div>
	<div class="tou1">
		<ul>
			<li class="d121"><img class="zhong" src="img/12.png" alt="阿斯顿马丁"
				width="80px" height="75px" /> <a href="#" style="color: white;">阿斯顿马丁专卖</a></li>


			<!-- 登录后才能看到的按钮 -->
			<c:if test="${current_user!=null }">
				<li>
					<div class="d0">
						<span><span><a>用户</a></span>
							<div class="d1">
								<p>
									<a href="userlist.action?page=1">查看用户</a>
								</p>
								<c:if test="${current_user.did==1 }">
									<p>
										<a href="zhuce.jsp">添加用户</a>
									</p>
								</c:if>

							</div>
					</div>
				</li>

				<li>
					<div class="d0">
						<span><a>库存</a></span>
						<div class="d1">
							<p>
								<a href="repertorycar.action">商品车库存</a>
							</p>

							<c:if test="${current_user.did==5 }">
								<p>
									<a href="#">添加商品车库存</a>
								</p>
							</c:if>
							<p>
								<a href="repertorydec.action">装潢件库存</a>
							</p>

							<c:if test="${current_user.did==5 }">
								<p>
									<a href="#">添加装潢件库存</a>
								</p>
							</c:if>
						</div>
					</div>
				</li>

				<c:if
					test="${current_user.did==3||current_user.did==1||current_user.did==2 }">
					<li>
						<div class="d0">
							<span><a>客户</a></span>
							<div class="d1">
								<p>
									<a href="showclient.action">客户信息</a>
								</p>
								<c:if test="${current_user.did==3||current_user.did==2}">
									<p>
										<a href="addclient.jsp">添加客户</a>
									</p>
								</c:if>

							</div>
						</div>
					</li>
				</c:if>

				<li>
					<div class="d0">
						<span><a>订单</a></span>
						<div class="d1">
							<p>
								<a href="indent.action">查看订单</a>
							</p>

							<c:if test="${current_user.did==3||current_user.did==2}">
								<p>
									<a href="addindent.jsp">添加订单</a>
								</p>
							</c:if>

						</div>
					</div>
				</li>
				<li>
					<div class="d0">
						<span><a>商品</a></span>
						<div class="d1">
							<p>
								<a href="car.action">商品车</a>
							</p>

							<c:if test="${current_user.did==1 }">
								<p>
									<a href="#">添加商品车</a>
								</p>
							</c:if>
							<p>
								<a href="showclient.action">装潢件</a>
							</p>

							<c:if test="${current_user.did==1 }">
								<p>
									<a href="#">添加装潢件</a>
								</p>
							</c:if>
						</div>
					</div>
				</li>
				<li>
					<div class="d0">
						<span><a href="exit.action">退出</a></span>
					</div>
				</li>
			</c:if>
		</ul>
		<div class="new">
			<span style="font-size: 20px;"> ${current_user.name} </span><br>
			<span> <c:if test="${current_user.did==1 }">
			管理员
			</c:if> <c:if test="${current_user.did==2 }">
			销售经理
			</c:if> <c:if test="${current_user.did==3 }">
			销售顾问
			</c:if> <c:if test="${current_user.did==4 }">
			会计
			</c:if> <c:if test="${current_user.did==5}">
			库管
			</c:if>
			</span>
		</div>
	</div>



</body>
</html>