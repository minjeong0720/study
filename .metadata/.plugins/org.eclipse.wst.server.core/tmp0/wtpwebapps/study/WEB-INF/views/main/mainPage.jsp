<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="a.b.c.com.member.vo.MemberVO" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAIN</title>
<style type="text/css">
	.m{
		text-align: center;
	}
</style>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<%
	Object obj = request.getAttribute("listLogin");
	if(obj == null) return;
	List<MemberVO> list=(List<MemberVO>)obj;
	int nCnt = list.size();
	String mid = "";
	if(nCnt == 1){
		mid = list.get(0).getMid();
	}
%>

<%= mid %> 님 로그인 중
<a href="logout.kmj">로그아웃 하기</a>
<h3 class="m">MAIN PAGE</h3>

</body>
</html>