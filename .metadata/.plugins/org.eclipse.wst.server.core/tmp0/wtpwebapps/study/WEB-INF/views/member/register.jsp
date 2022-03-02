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
  <link rel="shortcut icon" href="../../images/favicon.png">

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">

	//회원가입 버튼 클릭시
	$(document).on("click", "#register", function(){
	   console.log("sbbtn >>>> : " );
	   alert("회원가입 버튼 클릭");
	   var mid = $("#mid").val();
	   console.log("mid" + mid);
	   
	   //controller memInsert로 이동
	   $('#memInsert').attr({
	      'action': 'memInsert.kmj',
	      'method' : 'GET',
	      'enctype' : 'application/x-www-form-urlencoded'
	   }).submit();   
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
                <img src="../../images/logo.svg" alt="logo">
              </div>
              <h4>New here?</h4>
              <h6 class="font-weight-light">Signing up is easy. It only takes a few steps</h6>
              <form class="pt-3">
              
                <div class="form-group">
                  <input type="text" id="mid" placeholder="ID" class="form-control form-control-lg" >
                </div>
                
                <div class="form-group">
                  <input type="password" id="mpw" placeholder="PassWord" class="form-control form-control-lg" >
                </div>
                
                <div class="form-group">
                  <input type="text" id="mname" placeholder="Username" class="form-control form-control-lg" >
                </div>
                
                <div class="mb-4">
                  <div class="form-check">
                    <label class="form-check-label text-muted">
                      <input type="checkbox" class="form-check-input">
                      I agree to all Terms &amp; Conditions
                    <i class="input-helper"></i></label>
                  </div>
                </div>
                <div class="mt-3">
                  <a class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" href="../../">SIGN UP</a>
                  <button id="register" value="REGISTER" class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn"></button>
                </div>
                <div class="text-center mt-4 font-weight-light">
                  Already have an account? <a href="loginForm.kmj" class="text-primary">Login</a>
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