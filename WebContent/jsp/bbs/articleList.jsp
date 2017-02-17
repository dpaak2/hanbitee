<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="service.BoardService" %>
<%@ page import="domain.ArticleBean" %>
<%@ page import="serviceImpl.BoardServiceImpl" %>
<%@ page import="java.util.*" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link rel="stylesheet" href="../../css/hanbit.css" />
</head>
<body>
<%
BoardService service= BoardServiceImpl.getIsntance();
List <ArticleBean> list= service.list();
int card=service.count();
int rowCount=5;
%>
	<div style="width: 90%; margin-top:10%">
	<table class="table_default margin_center" style="width: 500px">
	<tr>
		<th colspan="5" style="text-align: right"> 총게시글 수 :<%= card %>건 </th>
	</tr>
		<tr>
			<td> No </td>
			<td> ID </td>
			<td> 제목</td>
			<td> 등록일</td>
			<td> 조회수 </td>
		</tr>
<%
	for(int i=0;i<rowCount;i++){
%>
		<tr>
			<td><%= list.get(i).getSeq()%></td>
			<td><%= list.get(i).getUid() %></td>
			<td><%= list.get(i).getTitle() %></td>
			<td><%= list.get(i).getRegdate() %></td>
			<td><%= list.get(i).getReadCount() %></td>
		</tr>
<%
	}
%>
</table>
		<nav class="margin_center" style="margin: 0 auto 0">
		<ul class="gnb" style="background-color: white ;">
<%
		int pageCount=card /rowCount;
    	pageCount=(card%rowCount==0)?card /rowCount:(card /rowCount)+1;
		for(int i=0;i<pageCount;i++ ){
%>
		<li style="text-align: center; width: 20px">
		<a href=""><%=  i+1%></a>
	   
		</li>
		<% 	}%>
	</ul>
	</nav>
	</div>
	
</body>
</html>