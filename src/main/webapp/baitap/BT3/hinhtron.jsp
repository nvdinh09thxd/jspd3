<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Hình tròn</title>
		<link href="<%=request.getContextPath()%>/baitap/BT3/css/reset.css" rel="stylesheet" type="text/css">
		<link href="<%=request.getContextPath()%>/baitap/BT3/css/style.css" rel="stylesheet" type="text/css">
		<style>
			.error {
				color: red;
			}
		</style>
	</head>
	<body>
		<%
			String err = request.getParameter("err");
			String banKinh = (String) request.getAttribute("bankinh");
			String dienTich = (String) request.getAttribute("dientich");
		%>
		<div class="wrapper">
			<h2>Hình tròn</h2>
			<form action="<%=request.getContextPath()%>/hinh-tron" method="post">
				<label>Bán kính:</label>
				<input type="text" id="bankinh" name="bankinh" value="<%if(banKinh!=null) out.print(banKinh);%>" /><br /> <br />
				<label>Diện tích:</label>
				<input type="text" id="dientich" name="dientich" value="<%if(dienTich!=null) out.print(dienTich);%>" /><br /> <br />
				<input type="submit" value="Tính" />
			</form>
			<%
				if("1".equals(err)) out.print("<p style='color: red'>Nhập sai định dạng số!</p>");
				else if("2".equals(err)) out.print("<p style='color: red'>Vui lòng nhập một trong hai giá trị!</p>");
			%>
		</div>
	</body>
</html>