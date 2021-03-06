<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- 
<html lang="en"><head>
  <!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>LOGIN</title>
<!-- plugins:css -->
<link rel="stylesheet" href="../../vendors/feather/feather.css">
<link rel="stylesheet"
	href="../../vendors/ti-icons/css/themify-icons.css">
<link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="../../css/vertical-layout-light/style.css">
<!-- endinject -->
<link rel="shortcut icon" href="../../images/LOGIN.png">

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		$("#mid").attr('placeholder', '아이디');
		$("#mpw").attr('placeholder', '비밀번호');
		
		$("#btn").click(function(){
			console.log("btn >>> : ");
			
			$('#loginForm').attr({
				'action':'login.kmj',
				'method':'POST',
				'enctype':'application/x-www-form=urlencoded'
			}).submit();
		});
	});
</script>
</head>

<body>
	<div class="container-scroller">
		<div class="container-fluid page-body-wrapper full-page-wrapper">
			<div class="content-wrapper d-flex align-items-center auth px-0">
				<div class="row w-100 mx-0">
					<div class="col-lg-4 mx-auto">
						<div class="auth-form-light text-left py-5 px-4 px-sm-5">
							<div class="brand-logo">
								<img src="../../images/LOGIN.png" alt="login">
							</div>
							<h6>환영합니다!</h6>
							<h6 class="font-weight-light"></h6>

							<form name="loginForm" id="loginForm" method="post" class="pt-3">
								<div class="form-group">
									<input type="text" id="mid" name="mid" placeholder="ID"
										class="form-control form-control-lg">
								</div>
								<div class="form-group">
									<input type="password" name="mpw" id="mpw"
										placeholder="Password" class="form-control form-control-lg">
								</div>

								<div class="mt-3">
									<button type="button" id="btn"
										class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn">LOGIN</button>
								</div>

								<div class="text-center mt-4 font-weight-light">
									아직 회원이 아니신가요? <a href="register.kmj" class="text-primary">Create</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- content-wrapper ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="../../vendors/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="../../js/off-canvas.js"></script>
	<script src="../../js/hoverable-collapse.js"></script>
	<script src="../../js/template.js"></script>
	<script src="../../js/settings.js"></script>
	<script src="../../js/todolist.js"></script>
	<!-- endinject -->



</body>
</html>
