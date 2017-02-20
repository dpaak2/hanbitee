<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>환자 로그인</title>
	<link rel="stylesheet" href= "<%=application.getContextPath() %>/css/hanbit.css" />
	
</head>
<body >
<div id="wrapper" class="width_full_size">
<div id="header"  class="width_full_size" style="height:50px">
<div class="logo_box width_full_size text_center" style="height:80%" >
<a href="../../index.html"><img src="<%=application.getContextPath() %>/images/common/index_logo.png" alt="" /></a>

</div>
<div  class="width_full_size" >
	<ul class="gnb width_full_size text_center bg_color_darkgray" style="height: 40px">
		<li><a href="join.html">회원가입</a></li>
		<li><a href="login.html">로그인</a><li>
		<li><a href="../bbs/bbs_list.html">게시판</a><li>
			<li>
			<div class="dropdown">
				<a href="../admin/admin.html">관리자</a>
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
		</li>
	</ul>
</div>
</div>
<div style="height: 100px;"></div>
<div id="container"  class="width_full_size" style="height:600px">

<form action="login.jsp" style="width:20%;" class="margin_center">
	<table class="table_default ">
		<tr style="border: 1px solid black;">
			<td style="border: 1px solid black;boder-collapse:collapse;"><input type="text" placeholder="아이디" name="id"/></td>
			<td style="border: 1px solid black;boder-collapse:collapse;" rowspan="2">
			<input type="submit" value="로그인" 
			 class="height_full_size width_full_size" style="height:50px; width:50px"/></td>
			
		</tr>
		<tr>
		<td><input type="PASSWORD" name="pw" placeholder="비밀번호" /></td>
		</tr>
	</table>
	
</form>
</div>
		<div id="footer" class="width_full_size" style="height: 80px; border-top:2px solid #5a5a5a;">
		<dl class="notice">
		<dt><a href="/NOTICE" class="h_notice">공지사항</a></dt>
		
		<dd><a href="http://www.naver.com/NOTICE/read/1100001014/10000000000030649309" onclick="clickcr(this, 'ntc.notice','78011B01_0000000EA10F', '', event)" >네이버 단체 회원 서비스 및 ‘단체회원 이용약관’ 변경에 대한 안내</a></dd>
		</dl>
		
		<dl class="policy">
			<dt >네이버 정책 및 약관</dt> <!-- class="blind" -->
			<dd class="f"><a href="http://www.navercorp.com/" target="_blank" id="plc.intronhn">회사소개</a></dd>
			<dd><a href="http://mktg.naver.com/" id="plc.adinfo">광고</a></dd>
			<dd><a href="https://submit.naver.com/" id="plc.search">마이비즈니스</a></dd>
			<dd><a href="https://www.navercorp.com/ko/company/proposalGuide.nhn" target="_blank" id="plc.contact">제휴제안</a></dd>
			<dd><a href="rules/service.html" id="plc.service">이용약관</a></dd>
			<dd><a href="rules/privacy.html" id="plc.privacy"><strong>개인정보처리방침</strong></a></dd>
			<dd><a href="rules/youthpolicy.html" id="plc.youth">청소년보호정책</a></dd>
			<dd><a href="rules/spamcheck.html" id="plc.policy">네이버 정책</a></dd>
			<dd><a href="https://help.naver.com/" id="plc.helpcenter">네이버 고객센터</a></dd>
		</dl>
		<address>&copy; <strong><a href="http://www.navercorp.com/" target="_blank">NAVER Corp.</a></strong></address>
		</div>
		</div>
</body>
</html>