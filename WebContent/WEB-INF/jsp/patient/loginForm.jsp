<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/header.jsp"/>
<jsp:include page="../common/top.jsp"/>
<div id="login">

<form action="${context}/patient.do"method="post" style="width:20%;" class="margin_center">
	<table class="table_default ">
		<tr style="border: 1px solid black;">
			<td style="border: 1px solid black;boder-collapse:collapse;"><input type="text" placeholder="아이디" name="id"/></td>
			<td style="border: 1px solid black;boder-collapse:collapse;" rowspan="2">
			<input type="hidden" name="action" value="login" />
			<input type="hidden" name="page" value="mainPat" />
			<input type="submit" value="로그인" 
			 class="height_full_size width_full_size" style="height:50px; width:50px"/></td>
			
		</tr>
		<tr>
		<td><input type="PASSWORD" name="pw" placeholder="비밀번호" /></td>
		</tr>
	</table>
	
</form>
</div>
<script>
$(function(){
	var $login=$('#login');
	$login.addClass('login').addClass('width_full_size').css('height','600px')
	.css('position', 'relative').css('top','100px');
	});
</script>
<jsp:include page="../common/footer.jsp"/>