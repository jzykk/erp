$(function() {
	/**
	 * 页面加载就将所有的订单状态加载出来
	 */
	$.post("indentstate.action", {

	}, function(result) {
		console.log(result);
		var html = "";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.stateId + "'>" + data.statename
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(html);
		$("#indentstate").html(html);
	}, "json");
	/**
	 * 页面加载就将所有的商品类型加载出来
	 */
	$.post("type.action", {
		type : 1
	}, function(result) {
		console.log(result);
		var html = "<option value='0'>商品类型</option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.typeid + "'>" + data.typename
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(html);
		$("#typename").html(html);
	}, "json");
	/**
	 * 页面加载就将所有客户名加载出来
	 */
	$.post("clientname.action", {

	}, function(result) {
		console.log(result);
		var html = "";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.clientid + "'>" + data.clientid
					+ "-" + data.clientname + "</option>";
		});
		// 将html放入到页面里面
		console.log(html);
		$("#clientid").html(html);
	}, "json");
});

function showspname(typeid) {
	$.post("type.action", {
		type : 2,
		typeid : typeid
	}, function(result) {
		if (typeid == 1) {
			console.log(result);
			var html = "";
			// 将集合遍历到一个html字符串中
			$.each(result.list, function(i, data) {
				html += "<option value='" + data.spid + "'>" + data.modelname
						+ "-" + data.colorname + "-" + data.levelname
						+ "</option>";
			});
			// 将html放入到页面里面
			console.log("商品车列表");
			console.log(html);
			$("#spname").html(html);
		} else {
			console.log(result);
			var html = "";
			// 将集合遍历到一个html字符串中
			$.each(result.list, function(i, data) {
				html += "<option value='" + data.spid + "'>"
						+ data.decoratename + "</option>";
			});
			// 将html放入到页面里面
			console.log("装潢件列表");
			console.log(html);
			$("#spname").html(html);
		}

	}, "json");

}