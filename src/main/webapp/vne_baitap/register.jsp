<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Vinaenter - Register</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="<%=request.getContextPath() %>/vne_baitap/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/vne_baitap/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/vne_baitap/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/vne_baitap/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/vne_baitap/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/vne_baitap/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/vne_baitap/css/util.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/vne_baitap/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	<%
		String err="";
		String name="";
		String address="";
		
		if(request.getParameter("err")!=null){
			err = request.getParameter("err");
		}
		
		if(request.getAttribute("name")!=null){
			name = (String) request.getAttribute("name");
		}
		
		if(request.getAttribute("address")!=null){
	 		address = (String) request.getAttribute("address");
		}
	%>

	<div class="bg-contact3" style="background-image: url('<%=request.getContextPath() %>/vne_baitap/images/bg-01.jpg');">
		<div class="container-contact3">
			<div class="wrap-contact3">
				<form class="contact3-form validate-form" action="<%=request.getContextPath()%>/RegUserController" method="POST">
					<span class="contact3-form-title">
						Register User
					</span>
					<%
						if("1".equals(err)) out.print("<p style='color: red;'> Tên đăng nhập không được để trống!</p>");
						else if("2".equals(err)) out.print("<p style='color: red;'> Mật khẩu không được để trống!</p>");
						else if("3".equals(err)) out.print("<p style='color: red;'> Địa chỉ không được để trống!</p>");
						else if("4".equals(err)) out.print("<p style='color: red;'> Mật khẩu không trùng nhau!</p>");
						else if("5".equals(err)) out.print("<p style='color: red;'> Mật khẩu phải bắt đầu bằng chuỗi VNE!</p>");
					%>
					<div class="wrap-input3 validate-input">
						<input class="input3" type="text" name="name" placeholder="Your Username" value="<%if(!"".equals(name)) out.print(name);%>">
						<span class="focus-input3"></span>
					</div>

					<div class="wrap-input3 validate-input" >
						<input class="input3" type="password" name="pass" placeholder="Your Password">
						<span class="focus-input3"></span>
					</div>
					
					<div class="wrap-input3 validate-input" >
						<input class="input3" type="password" name="repass" placeholder="Your RePassword">
						<span class="focus-input3"></span>
					</div>
					
					<div class="wrap-input3 validate-input">
						<input class="input3" type="text" name="address" placeholder="Your address" value="<%if(!"".equals(address)) out.print(address);%>">
						<span class="focus-input3"></span>
					</div>
					<div class="container-contact3-form-btn">
						<button class="contact3-form-btn">
							Submit
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
	<script src="<%=request.getContextPath() %>/vne_baitap/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="<%=request.getContextPath() %>/vne_baitap/vendor/bootstrap/js/popper.js"></script>
	<script src="<%=request.getContextPath() %>/vne_baitap/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="<%=request.getContextPath() %>/vne_baitap/vendor/select2/select2.min.js"></script>
	<script>
		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script src="<%=request.getContextPath() %>/vne_baitap/js/main.js"></script>

	<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

</body>
</html>
