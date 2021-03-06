<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html lang="en"><head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>REGISTER</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="../../vendors/feather/feather.css">
  <link rel="stylesheet" href="../../vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="../../css/vertical-layout-light/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="../../images/welcome.jpg">

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">

	//회원가입 버튼 클릭시
	//$(document).on("click", "#register", function(){
	$(document).ready(function(){
	   console.log("register >>>> : " );
	   
	   /*var mid = $("#mid").val();
	   console.log("mid" + mid);*/
	   $("#submit").on("click", function(){
			if($("#mid").val()==""){
				alert("아이디를 입력해주세요.");
				$("#mid").focus();
				return false;
			}
			if($("#mpw").val()==""){
				alert("비밀번호를 입력해주세요.");
				$("#mpw").focus();
				return false;
			}
			if($("#mname").val()==""){
				alert("성명을 입력해주세요.");
				$("#mname").focus();
				return false;
			}
			alert("회원가입이 완료 되었습니다!");
	   //controller memInsert로 이동
	   $('#user').attr({
	      'action': 'memberInsert.kmj',
	      'method' : 'POST',
	      'enctype' : 'application/x-www-form-urlencoded'
	   }).submit();  
	});
	})
	
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
       			 <img src="../../images/welcome.jpg" alt="welcome"></div>
              <h6>SIGN UP</h6>
              <h6 class="font-weight-light">환영합니다! 회원가입을 진행해주세요!</h6>
              
              <form name="user" id="user" class="pt-3">
              
                <div class="form-group">
                  <input type="text" id="mid" name="mid" placeholder="ID" class="form-control form-control-lg" >
                </div>
                
                <div class="form-group">
                  <input type="password" id="mpw" name="mpw" placeholder="PassWord" class="form-control form-control-lg" >
                </div>
                
                <div class="form-group">
                  <input type="text" id="mname" name="mname" placeholder="Username" class="form-control form-control-lg" >
                </div>
                
                <div class="mt-3">
                  <button type="submit" id="submit"  class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn">SIGN UP</button>
                </div><!-- onclick="location.href='loginForm.kmj'" -->
                <div class="text-center mt-4 font-weight-light">
                  	계정이 있으신가요? <a href="loginForm.kmj" class="text-primary">Login</a>
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



</body></html>