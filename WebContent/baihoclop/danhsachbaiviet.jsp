<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Danh sách bài học</h1>
	<ul>
	  <li><a href="<%=request.getContextPath()%>/search?id=1">Học Java</a></li>
	  <li><a href="<%=request.getContextPath()%>/search?id=2">Học PHP</a></li>
	  <li><a href="<%=request.getContextPath()%>/search?id=3">Học Android</a></li>
	  <li><a href="<%=request.getContextPath()%>/search?id=4">Học Rubi</a></li>
	  <li><a href="<%=request.getContextPath()%>/search?id=5">Học IOS</a></li>
	</ul>

</body>
</html>