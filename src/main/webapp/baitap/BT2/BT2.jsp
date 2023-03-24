<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>BT2</title>
	<link href="<%=request.getContextPath()%>/baitap/BT2/css/reset.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/baitap/BT2/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="wrapper">
		<%
			String hoTen = (String) request.getAttribute("hoten");
		%>

		<h3>In câu chào</h3>
		<form action="<%=request.getContextPath()%>/in-cau-chao" method="POST">
			<label>Nhập tên: </label> 
			<input type="text" name="hoten"	value="<%if(hoTen!=null) out.print(hoTen);%>" /><br /> <br /> 
			<input type="submit" value="In Câu Chào" />
		</form>
		<%
			if (hoTen != null && hoTen!="") {
		%>
		<p>
			Câu chào: <strong>Chào bạn <%=hoTen%></strong>
		</p>
		<%
			}
		%>
	</div>
</body>
</html>