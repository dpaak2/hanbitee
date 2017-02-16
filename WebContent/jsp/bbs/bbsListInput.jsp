<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>bbs_list</title>
<link rel="stylesheet" href="../../css/hanbit.css" />

</head> 


<body >
<div id="wrapper" class="width_full_size">
<div id="header"  class="width_full_size" style="height:50px">
<div class="logo_box width_full_size text_center" style="height:80%" >
<a href="../../index.html"><img src="../../images/common/index_logo.png" alt="" /></a>

</div>
<div  class="width_full_size" >
	<ul class="gnb width_full_size text_center bg_color_darkgray" style="height: 40px">
		<li><a href="../common/join.html">회원가입</a></li>
		<li><a href="../common/login.html">로그인</a><li>
			<li><a href="bbs_list.html">게시판</a><li>
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

<!-- content here-->
<table class="table_default margin_center" style="width: 500px; height: 300px;">
	<tr class="bg_color_darkgrey color_white " style="height: 20px;">
		<th class="text_center text_bold">NO</th>
		<th class="text_center">제목</th>
		<th class="text_center">작성자</th>
		<th class="text_center">작성일</th>
		<th class="text_center">조회수</th>
	</tr>
	<tr>
		<td>100</td>
		<td>안녕하세요</td>
		<td>김철수</td>
		<td>2017.01.13</td>
		<td>11</td>
	</tr>
	<tr>
		<td>99</td>
		<td>훌라훌라</td>
		<td>김영희</td>
		<td>2017.01.13</td>
		<td>10</td>
	</tr>
	<tr>
		<td>98</td>
		<td>금요일이다</td>
		<td>나경신</td>
		<td>2017.01.13</td>
		<td>23</td>
	</tr>
	<tr>
		<td>97</td>
		<td>후후후후후</td>
		<td>김제동</td>
		<td>2017.01.13</td>
		<td>54</td>
	</tr>
	<tr>
		<td>96</td>
		<td>눈와요</td>
		<td>김연아</td>
		<td>2017.01.13</td>
		<td>100</td>
	</tr>
	<tr>
			<td colspan="5" class="text_center" style="height: 10px;">
			1  2  3  4  5   ▶
			</td>
			</tr>
</table>

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