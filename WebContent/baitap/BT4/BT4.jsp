<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Thay thế chuỗi</title>
		<link href="<%=request.getContextPath()%>/baitap/BT4/css/reset.css"
			rel="stylesheet" type="text/css">
		<link href="<%=request.getContextPath()%>/baitap/BT4/css/style.css"
			rel="stylesheet" type="text/css">
		<script src="<%=request.getContextPath()%>/baitap/BT4/js/jquery-3.3.1.min.js"></script>
	</head>
	<body>
		<div class="wrapper">
			<h2>Thay thế chuỗi</h2>
			<form action="<%=request.getContextPath() %>/thay-the" method="get">
				<p>Đoạn văn gốc</p>
				<textarea rows="3" id="chuoigoc" name="chuoigoc"><%if(request.getAttribute("chuoigoc")!=null) out.print(request.getAttribute("chuoigoc")); %></textarea><br /> 
				<label>Từ gốc: </label> <input type="text" id="tugoc" name="tugoc" value="<%if(request.getAttribute("tugoc")!=null) out.print(request.getAttribute("tugoc")); %>" />
				<label>Thay thế bằng: </label> <input type="text" id="tuthaythe" name="tuthaythe" value="<% if(request.getAttribute("tuthaythe")!=null) out.print(request.getAttribute("tuthaythe")); %>" /><br />
				<textarea rows="3" id="doanthaythe"><% if(request.getAttribute("chuoithaythe")!=null) out.print(request.getAttribute("chuoithaythe")); %></textarea><br /><hr />
				<div class="buttonHolder">
					<input type="submit" value="Thực hiện" />
				</div>
			</form>
		</div>
		<script type="text/javascript">
			$("form").submit(function(){
				var chuoigoc = $("#chuoigoc").val();
				var tugoc = $("#tugoc").val();
				var tuthaythe = $("#tuthaythe").val();
				if (chuoigoc == "" || tugoc == "" || tuthaythe == ""){
					alert("Nhập đầy đủ thông tin vào!");
					return false;
				}
				
			})
		</script>
	</body>
</html>