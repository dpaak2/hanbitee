<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="${js}/hospital.js"></script>
<img class="margin_center" src="${img}/common/loading.gif" alt="" />
<script>
$(function(){
	goPage('${context}/home.do','move','mainCommon');
});

</script>