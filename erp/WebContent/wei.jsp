<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/wei.css" rel="stylesheet">
</head>
<body onload="play()">
<div class="lun1">
				<div><img id="hd" class="imgg1" src="/img/hd1.jpg" /></div>
		</div>
		<script>
			var i = 1;
			var hd = document.getElementById("hd"); //获取图片对象
			var timer = setInterval("play()", 4000); //创建定时器
			function play() {
				//修改图片的内容
				i++;
				i = i > 5 ? 1 : i;
				hd.src = "img/hd" + i + ".jpg";
			}
		</script>
		<div class="wei1">
			<div class="wei2">
				<div class="wei3"><img class="img1" src="img/12.png" /></div>
				<div class="wei4">
					<p class="wei5">
						<a rel="nofollow" href="#">阿斯顿马丁</a><span class="sep">|</span>
						<a rel="nofollow" href="#">服务条款</a><span class="sep">|</span>
						<a rel="nofollow" href="#">阿斯顿马丁隐私保护指引</a><span class="sep">|</span>
						<a rel="nofollow" href="#">阿斯顿马丁招聘</a><span class="sep">|</span>
						<a rel="nofollow" href="#">阿斯顿马丁客服</a><span class="sep">|</span>
						<a rel="nofollow" href="#">|跑车系列</a><span class="sep">|</span>
						<a rel="nofollow" href="#">商务合作</a><span class="sep">|</span>
						<a rel="nofollow" href="#">官方网<a><span class="sep">|</span>
						<a rel="nofollow" href="#">网站导航<br>阿斯顿马丁版权所有</a>
						COPYRIGHT&copy;1998 - 2019 ASTONMARTIN. ALL RIGHTS RESERVED.
						<br> 违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试
						<br> 阿斯顿马丁邂逅珍藏易手车。
						<br>粤网文[2017]6138-1456号<span class="sep">|</span>（总）网出证（粤）字第057号
						<br>批准文号：新出审字[2011]310号<span class="sep">|</span>文网进字[2011] 004号 <span class="sep">|</span> 出版物号：ISBN 978-7-89989-145-2<span class="sep">|</span>全国文化市场统一举报电话：12318
					</p>
				</div>
			</div>
		</div>
</body>
</html>