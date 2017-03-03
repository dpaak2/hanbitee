<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/top.jsp"/>
<jsp:include page="../common/header.jsp"/>
<jsp:include page="../common/gnbCommon.jsp"/>
	<div style="width: 90%; margin-top:10%">
	<table  id="articlelist">
	<tr>
		<th colspan="5" style=""> 총게시글수: ${count} 건</th>
	</tr>
		<tr>
			<td> No </td>
			<td> ID </td>
			<td> 제목</td>
			<td> 등록일</td>
			<td> 조회수 </td>
		</tr>

<c:forEach var="article" items="${requestScope.list}"> <!-- sevelet 에서 list 담아서 준다 -->

	<tr>
			<td>${article.seq}</td>
			<td>${article.id}</td>
			<td><a href="${context}/board.do?action=detail&page=articleDetail&seq='${article.seq}">${article.title}</a></td>
			<td>${article.regdate}</td>
			<td>${article.readCount}</td>
		</tr>
</c:forEach>
</table>
<%-- 		<nav class="margin_center" style="margin: 0 auto 0">
		<ul class="gnb" style="background-color: white ;">


<c:forEach var="pageNO" items="${requestScope.list}">

<li style="text-align: center; width: 20px">
		<a href=""><%=  i+1%></a>
	   
		</li>
</c:forEach>

	</ul>
	</nav> --%>
	</div>
	
<script>
$(function() {
	var $articleList=$('#articlelist');
	$articleList.addClass('table_default').addClass('table_bottom').addClass('margin_center').css('text-align',' right').css('width','500px');
	$articelList.find('th:nth-child(1)').css('text-align','left');
	
});
</script>

