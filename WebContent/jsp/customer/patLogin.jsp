<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="serviceImpl.MemberServiceImpl" %>
<%@ page import="service.MemberService" %>
<%@ page import="domain.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>환자 login </title>
</head>
<body>
<div>
<% 
	MemberBean member =new MemberBean();
	MemberService service= MemberServiceImpl.getInstance();
    member.setId(request.getParameter("id"));
    member.setPassword(request.getParameter("pw"));
	if(service.login(member)){
%>
 반갑습니다.<%= member.getId() %> 님 
 <a href="">내정보</a>
 <input type="button" value="로그아웃"/>
<%
	}else{
%>
회원정보가 잘못됬습니다.
<%	
	}
%>
</div>
</body>
</html>