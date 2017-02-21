<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link rel="stylesheet" type="text/css" href="css/hanbit.css" />
<style type="text/css">

</style>
</head>

<body >
<div id="wrapper" class="width_full_size">
<div id="header"  class="width_full_size" style="height:50px">
<div class="logo_box width_full_size text_center" style="height:80%" >
<a href="index.html"><img src="images/common/index_logo.png" alt="" /></a>

</div>
<div  class="width_full_size" >
	<ul class="gnb width_full_size text_center bg_color_darkgray" style="height: 40px">
		<li><a href="<%= application.getContextPath()%>/patient.do?action=move&page=registerForm">회원가입</a></li>
		<li><a href="<%= application.getContextPath()%>/patient.do?action=move&page=loginForm">로그인</a><li>
		<li><a href="<%= application.getContextPath()%>/board.do?action=move&page=mainBoard">게시판</a><li>
		<li><a href="<%= application.getContextPath()%>/admin.do?action=move&page=loginForm">관리자</a><li>
		<li>
			<div class="dropdown">
				<a href="html/admin/admin.html">관리자</a>
		  		<div class="dropdown_content">
				  	<p><a href="" style="color: black;">의사</a></p>
				  	<p><a href="" style="color: black;">간호사</a></p>
				  	<p><a href="" style="color: black;">진료</a></p>
				  	<p><a href="" style="color: black;">차트</a></p>
		  		</div>
			</div>
		</li>
		<li>
			<div class="tooltip"><a href="#">병원소개</a>
		    <span class="tooltiptext"> 구현되지 않는 작업입니다.</span>
		    </div>
		<li>
	</ul>
</div>
</div>
<div style="height: 100px;"></div>
