<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Vinaenter - Information</title>
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
		String name="";
		String pass="";
		String address="";
		
		if(request.getAttribute("name")!=null){
			 name = (String) request.getAttribute("name");
		}
		
		if(request.getAttribute("pass")!=null){
			pass = (String) request.getAttribute("pass");
		}
		
		if(request.getAttribute("address")!=null){
			address = (String) request.getAttribute("address");
		}
	%>
	<div class="bg-contact3" style="background-image: url('images/bg-01.jpg');">
		<div class="container-contact3">
			<div class="wrap-contact3">
				<form class="contact3-form validate-form">
					<span class="contact3-form-title">
						Information User
					</span>
					<div class="wrap-input3 validate-input" data-validate="Name is required">
						<label>Username :</label> 
						<input class="input3" readonly value="<%if(!"".equals(name)) out.print(name);%>" />
						<span class="focus-input3"></span>
					</div>
					
					<div class="wrap-input3 validate-input" data-validate="Name is required">
						<label>Password :</label> 
						<input class="input3" readonly value="<%if(!"".equals(pass)) out.print(pass);%>" />
						<span class="focus-input3"></span>
					</div>
					
					<div class="wrap-input3 validate-input" data-validate="Name is required">
						<label>Fullname :</label> 
						<input class="input3" readonly value="Tran Phu" />
						<span class="focus-input3"></span>
					</div>
					
					<div class="wrap-input3 validate-input" data-validate="Name is required">
						<label>Address :</label> 
						<input class="input3" readonly value="<%if(!"".equals(address)) out.print(address);%>" />
						<span class="focus-input3"></span>
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
	<script src="js/main.js"></script>

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
