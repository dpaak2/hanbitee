<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<ul id="commonGnb" style="height: 40px">
	<li><a>회원가입</a></li>
	<li><a>고객:로그인</a></li>
	<li><a>스탭:로그인</a></li>
	<li><a>관리자:로그인</a></li>
	<li><a>게시판</a></li>
	<li>
		<div class="tooltip">
			<a href="#">병원소개</a> <span class="tooltiptext"> 구현되지 않는 작업입니다.</span>
		</div>
	</li>
</ul>
<script>
	$(function() {
		var  commonGnb=$('#commonGnb');
		$('#commonGnb').addClass('gnb').addClass('width_full_size').addClass(
				'text_center').addClass('bg_color_darkgray');
		commonGnb.find('li:nth-child(1)').click(function() {
							alert('jQueryTest');
							goPage('${context}/patient.do','move','registerForm');
						});
		commonGnb.find('li:nth-child(2)').click (function() {
			alert('jQueryTest');
			goPage('${context}/patient.do','move','loginForm');
		});
		commonGnb.find('li:nth-child(3)').click(function() {
	    	alert('jQueryTest');
			goPage('${context}/patient.do','move','loginForm');
		}); 
		commonGnb.find('li:nth-child(4)').click(function() {
	    	alert('jQueryTest');
			goPage('${context}/patient.do','move','loginForm');
		}); 
		commonGnb.find('li:nth-child(5)').click(function() {
			alert('board');
			goPage('${context}/board.do','move','articleList'); /*board의 list는 메인이다*/
		});

	});

</script>