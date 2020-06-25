<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BT5</title>
</head>
<body>
	<%
		int soNgauNhien = (int) request.getAttribute("songaunhien");
		int b = soNgauNhien % 2;
	%>
	<p>	
		Số vừa tạo ra là:<%=soNgauNhien%>
	</p>

	<%
		if (b == 0) {
	%>
	<p>Đây là số chẵn</p>
	<%
		} else {
	%>
	<p>Đây là số lẻ</p>
	<%
		}
	%>
</body>
</html>