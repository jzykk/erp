

function showuser(p) {
	console.log(p);
	$("#spa").text("第"+p+"页");
	$.post("useajax.action", {
		page : p
	}, function(result) {
		console.log(result);
		var html = "<tr><th class='userxinxi2'>员工编号</th><th class='userxinxi2'>职务名称</th><th class='userxinxi2'>姓名</th><th class='userxinxi2'>性别</th><th class='userxinxi2'>年龄</th><th class='userxinxi2'>电话</th><th class='userxinxi2'>身份证号</th><th class='userxinxi2'>住址</th><th class='userxinxi2'>入职时间</th><th class='userxinxi2'>操作</th></tr>";
		$.each(result.lists, function(i, data) {
			if (data.sex=="女") {
				html += "<tr><td class='userxinxi3'>"+data.id+"</td><td class='userxinxi3'>"+data.dname+"</td><td class='userxinxi3'>"+data.name+"</td><td class='userxinxi3'>女</td><td class='userxinxi3'>"+data.age+"</td><td class='userxinxi3'>"+data.tel+"</td><td class='userxinxi3'>"+data.card+"</td><td class='userxinxi3'>"+data.address+"</td><td class='userxinxi3'>"+data.inputdate+"</td><td class='userxinxi3'><c:if test='${current_user.did==1}'><a onclick='delete_user("+data.id+")' style='cursor: pointer;'>删除</a>&nbsp;&nbsp;</c:if> <a href='edituser.action?type=2&id=${userVo.id}'>编辑</a></td></tr>";
			}else{
				html += "<tr><td class='userxinxi3'>"+data.id+"</td><td class='userxinxi3'>"+data.dname+"</td><td class='userxinxi3'>"+data.name+"</td><td class='userxinxi3'>男</td><td class='userxinxi3'>"+data.age+"</td><td class='userxinxi3'>"+data.tel+"</td><td class='userxinxi3'>"+data.card+"</td><td class='userxinxi3'>"+data.address+"</td><td class='userxinxi3'>"+data.inputdate+"</td><td class='userxinxi3'><c:if test='${current_user.did==1}'><a onclick='delete_user("+data.id+")' style='cursor: pointer;'>删除</a>&nbsp;&nbsp;</c:if> <a href='edituser.action?type=2&id=${userVo.id}'>编辑</a></td></tr>";
				
			}
			
		});
		// 将html放入到select中
		console.log(88);
		console.log(html);
		$("#tb").html(html);
	}, "json");
}
function shownext(p,ps){
	if (p<ps) {
		 $("#netxa").attr("onclick","shownext("+(p+1)+","+ps+")");
	
		
	} $("#lasta").attr("onclick","showlast("+(p-1)+","+ps+")");
	 
	
	showuser(p)
}
function showlast(p,ps){
	if (p>1) {
		 $("#lasta").attr("onclick","showlast("+(p-1)+","+ps+")");
	}
	 $("#netxa").attr("onclick","shownext("+(p+1)+","+ps+")");
	showuser(p)
}
function showtop(p,ps){
	 $("#lasta").attr("onclick","shownext(1,"+ps+")");
	 $("#netxa").attr("onclick","showlast(2,"+ps+")");
	showuser(p)
}
function showdown(p,ps){
	 $("#lasta").attr("onclick","showlast("+(ps-1)+","+ps+")");
	 $("#netxa").attr("onclick","shownext("+ps+","+ps+")");
	showuser(p)
}