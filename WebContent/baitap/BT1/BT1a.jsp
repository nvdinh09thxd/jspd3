<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>HCN</title>
		<script src="<%=request.getContextPath()%>/baitap/BT1/js/jquery-3.3.1.min.js"></script>
		<script src="<%=request.getContextPath()%>/baitap/BT1/js/jquery.validate.min.js"></script>
		<style>
			.error {
				color: red;
			}
		</style>
	</head>
	<body>
		<form action="<%=request.getContextPath()%>/hinh-chu-nhat" method="get">
			<label>Chiều dài</label> 
			<input type="text" name="chieudai" id="chieudai" /><br /> <br /> 
			<label>Chiều rộng</label> 
			<input type="text" name="chieurong" id="chieurong" /><br /> <br /> 
			<input type="submit" value="Tinh" />
		</form>
		<script type="text/javascript">
			$(() => {
				$('form').validate({
					rules : {
						"chieudai" : {
							required : true,
							digits : true,
						},
						"chieurong" : {
							required : true,
							digits : true,
						},
					},
					messages : {
						"chieudai" : {
							required : "Yêu cầu nhập!",
							digits : "Phải nhập số dương!"
						},
						"chieurong" : {
							required : "Yêu cầu nhập!",
							digits : "Phải nhập số dương!"
						},
					},
				}),
				$('form').submit(() => {
					var chieudai = parseInt($("#chieudai").val());
					var chieurong = parseInt($("#chieurong").val());
					
					if (chieurong>=chieudai) {
						alert("Vui lòng nhập chiều dài lớn hơn chiều rộng!");
						return false;
					}
				})
			})
		</script>
	</body>
</html>