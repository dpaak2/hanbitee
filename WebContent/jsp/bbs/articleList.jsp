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
	<div style="width: 90%">
	<table class="table_default margin_center" style="width: 500px">
		<tr>
			<td> No </td>
			<td> ID </td>
			<td> 제목</td>
			<td> 등록일</td>
			<td> 조회수 </td>
		</tr>
<%
	BoardService service= BoardServiceImpl.getIsntance();
	List <ArticleBean> list= service.list();
	int cardinality =5;
	int articleCount =service.count();
	int pageCount=0, blockSize= 0,blockCount=0;
	if(articleCount%cardinality==0){
		pageCount=pageCount/cardinality;
	}else{
		blockCount=articleCount/cardinality+1;
	}
	int blockNo=0;
	int blockStart=0;
	int blockEnd=0;
	for(int i=0;i<cardinality;i++){
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
		<tr>
		<td>
		<div>
		<%= "◀ "
		%>
			  <%= blockStart %>
			  <%= blockEnd %>
			  1  2  3  4  5 
			  <%= "▶"
		%>
		</div>
		</td>
		</tr>
		
	</table>
	
	</div>
	
</body>
</html>