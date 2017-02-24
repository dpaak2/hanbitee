<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<ul id="ulGnb" style="height: 40px">
	<li><a id="aJoin">회원가입</a></li>
	<li><a id="aPatLogin">고객:로그인</a>
	<li>
	<li><a id="aStaffLogin">스탭:로그인</a>
	<li>
	<li><a id="aAdminLogin">관리자:로그인</a>
	<li>
	<li><a id="aBoard">게시판</a>
	<li>
	<li>
		<div class="tooltip">
			<a href="#">병원소개</a> <span class="tooltiptext"> 구현되지 않는 작업입니다.</span>
		</div>
	<li>
</ul>
<script>
	$(function() {
		$('#ulGnb').addClass('gnb').addClass('width_full_size').addClass(
				'text_center').addClass('bg_color_darkgray');
		$('#aJoin')
				.click(
						function() {
							alert('jQueryTest');
							location.href = "${context}/patient.do?action=move&page=registerForm";
						});
		document.getElementById('aPatLogin').onclick = function() {
			location.href = "${context}/patient.do?action=move&page=loginForm";
		}
		document.getElementById('aStaffLogin').onclick = function() {
			location.href = "${context}/patient.do?action=move&page=loginForm";
		}
		document.getElementById('aAdminLogin').onclick = function() {
			location.href = "${context}/patient.do?action=move&page=loginForm";
		}
		document.getElementById('aBoard').addEventHandler('click', function() {
			alert('board');
			location.href = "${context}/board.do?action=move&page=mainBoard";
		});

	});
</script>