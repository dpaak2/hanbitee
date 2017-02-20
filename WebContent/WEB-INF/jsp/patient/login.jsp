<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="serviceImpl.PatientServiceImpl" %>
<%@ page import="service.PatientService" %>
<%@ page import="domain.PatientBean" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>환자 login </title>
</head>
<body>
<div>
<% 
	PatientBean member =new PatientBean();
	PatientService service= PatientServiceImpl.getInstance();
    member.setPatID(request.getParameter("id"));
    member.setPatPass(request.getParameter("pw"));
	if(service.login(member)){
%>
 반갑습니다.<%= member.getPatID() %> 님 
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