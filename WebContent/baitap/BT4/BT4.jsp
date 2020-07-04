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
	</head>
	<body>
		<div class="wrapper">
			<%
				String err = (String) request.getParameter("err");
				String chuoigoc = (String) request.getAttribute("chuoigoc");
				String tugoc = (String) request.getAttribute("tugoc");
				String tuthaythe = (String) request.getAttribute("tuthaythe");
				String chuoithaythe = (String) request.getAttribute("chuoithaythe");
			%>
			<h2>Thay thế chuỗi</h2>
			<form action="<%=request.getContextPath() %>/thay-the" method="post">
				<p>Đoạn văn gốc</p>
				<textarea rows="3" id="chuoigoc" name="chuoigoc"><%if(chuoigoc!=null) out.print(chuoigoc); %></textarea><br /> 
				<label>Từ gốc: </label> <input type="text" id="tugoc" name="tugoc" value="<%if(tugoc!=null) out.print(tugoc); %>" />
				<label>Thay thế bằng: </label> <input type="text" id="tuthaythe" name="tuthaythe" value="<% if(tuthaythe!=null) out.print(tuthaythe); %>" /><br />
				<textarea rows="3" id="doanthaythe"><% if(chuoithaythe!=null) out.print(chuoithaythe); %></textarea><br /><hr />
				<div class="buttonHolder">
					<input type="submit" value="Thực hiện" />
				</div>
			</form>
			<%
				if("0".equals(err)) out.print("<p style='color: red'>Vui lòng nhập đầy đủ thông tin vào!</p>");
			%>
		</div>
	</body>
</html>