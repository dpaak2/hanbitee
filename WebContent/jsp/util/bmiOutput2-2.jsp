<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="util.BMI"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>BMI 측정</title>
</head>
<body>
<div>
<%

int age= Integer.parseInt(request.getParameter("age"));
double kg= Double.parseDouble(request.getParameter("kg"));
double cm=Double.parseDouble(request.getParameter("cm"));
%>
나이= <%="age" %>
몸무게= <%= "kg" %>
키= <%= "cm" %>
</div>
BMI 결과는 <%= new BMI().getBmi(kg, cm) %>

</body>
</html>