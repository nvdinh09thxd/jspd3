<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thông tin người dùng</title>
</head>
<body>
	<%
		if(request.getAttribute("hoten") != null 
			&& request.getAttribute("tuoi") != null){
			String hoten = (String) request.getAttribute("hoten");
			int tuoi = (int) request.getAttribute("tuoi");
	%>
		<h2>Thông tin người dùng</h2>
		<p>Họ tên: <%=hoten %></p>
		<p>Tuổi: <%=tuoi %></p>
	<%
	} else {
	%>
		<p style="color: red">Không có thông tin người dùng!</p>
	<%} %>
</body>
</html>