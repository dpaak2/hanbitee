<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<ul class="gnb width_full_size text_center bg_color_darkgray" style="height: 40px">
		<li><a href="${context}/patient.do?action=move&page=registerForm">회원가입</a></li>
		<li><a href="${context}/patient.do?action=move&page=loginForm">고객:로그인</a><li>
		<li><a href="${context}/patient.do?action=move&page=loginForm">스탭:로그인</a><li>
		<li><a href="${context}/patient.do?action=move&page=loginForm">관리자:로그인</a><li>
		<li><a href="${context}/board.do?action=move&page=mainBoard">게시판</a><li>
		<li><a href="${context}/admin.do?action=move&page=loginForm">관리자</a><li>
		<li>
			<div class="tooltip"><a href="#">병원소개</a>
		    <span class="tooltiptext"> 구현되지 않는 작업입니다.</span>
		    </div>
		<li>
	</ul>