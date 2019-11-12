//注册的js

/**
 * 使用AJAX检查用户名称
 */
function nameBlur() {
	var n = $("#name").val();

	console.log(n);
	console.log(i);

	$.ajax({
		type : 'post',
		url : 'check.action',
		data : {
			type : 1,
			name : n
		},
		success : function(result) {
			console.log(result);
			if (result == "true") {
				$("#name_exit").html("");
			} else {
				$("#name_exit").html("名字已经存在！");
			}
		},
		dataType : 'text'
	});
}
function idblur() {
	var id1 = $("#id").val();
	$.ajax({
		type : 'post',
		url : 'check.action',
		data : {
			type : 2,
			id : id1
		},
		success : function(result) {
			console.log(result);
			if (result == "true") {
				$("#id_exit").html("");
			} else {
				$("#id_exit").html("ID已经存在！");
			}
		},
		dataType : 'text'
	});
}

/**
 * 页面加载就将所有的省份加载出来
 */
$(function() {
	$.post("pca.action", {
		type : 1
	}, function(result) {
		console.log(result);
		var html = "<option value='0'>-prov-</option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.provinceID + "'>" + data.province
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(12);
		console.log(html);
		$("#provincedId").html(html);
	}, "json");
});

/**
 * 显示出所有的市
 * 
 * @param pid
 *            省份的id
 */
function showCity(provincedId) {
	$.post("pca.action", {
		type : 2,
		provinceId : provincedId
	}, function(result) {
		console.log(result);
		var html = "<option value='0'>-city-</option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.cityID + "'>" + data.city
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log("市id");
		console.log(html);
		$("#cityId").html(html);
	}, "json");
	showArea(0);
}

/**
 * 显示出所有的区县
 * 
 * @param cid
 *            市的id
 */
function showArea(cityId) {
	console.log("aaaaaaaaaaaaaaaaaaaa");
	console.log(cityId);
	$.post("pca.action", {
		type : 3,
		cityId : cityId
	}, function(result) {
		console.log(result);
		var html = "<option value='0'>-area-</option>";
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.areaID + "'>" + data.areas
					+ "</option>";
		});
		// 将html放入到select中
		console.log(4);
		console.log(html);
		$("#areaId").html(html);
	}, "json");
}

/**
 * 校验是否成功，如果成功则提交表单
 * 
 * @return {Boolean}
 */
function check() {
	var pass1 = $("#pass1").val();
	var pass2 = $("#pass2").val();
	var name = $("#name").val();
	var name_exit = $("#name_exit").html();
	var did = $("#did").val();
	var tel = $("#tel").val();
	var card = $("#card").val();
	var age = $("#age").val();
	if (name == "") {
		alert("用户名不能为空");
		return false;
	}
	if (name_exit != "") {
		alert("用户名已经存在");
		return false;
	}
	if (pass1 == "") {
		alert("密码不能为空");
		return false;
	}
	if (age == "") {
		alert("年龄不能为空");
		return false;
	}

	if (did == "0") {
		alert("请选择客户类型")
		return false;
	}
	if (tel == "") {
		alert("请务必填写联系方式")
		return false;
	}
	if (card == "") {
		alert("本系统要求实名，请输入正确的身份证号码！")
		return false;
	}
	if (pass1 == pass2) {
		document.getElementsByTagName("form").item(0).submit();
	} else {
		alert("密码不相同");
		return false;
	}

}
function check1() {

	document.getElementsByTagName("form").item(0).submit();

}
function check2() {
	var pass1 = $("#pass1").val();
	var pass2 = $("#pass2").val();
	var did = $("#did").val();
	var tel = $("#tel").val();
	var card = $("#card").val();
	var age = $("#age").val();
	if (pass1 == "") {
		alert("密码不能为空");
		return false;
	}
	if (age == "") {
		alert("年龄不能为空");
		return false;
	}

	if (did == "0") {
		alert("请选择客户类型")
		return false;
	}
	if (tel == "") {
		alert("请务必填写联系方式")
		return false;
	}
	if (card == "") {
		alert("本系统要求实名，请输入正确的身份证号码！")
		return false;
	}
	if (pass1 == pass2) {
		document.getElementsByTagName("form").item(0).submit();
	} else {
		alert("密码不相同");
		return false;
	}

}
