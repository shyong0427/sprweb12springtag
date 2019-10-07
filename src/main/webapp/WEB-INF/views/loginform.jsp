<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sform" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<h2>* 로그인 (spring tag test) *</h2>
	<sform:form commandName="command">
		i   d : <sform:input path="userid"/><br>
		p w d : <sform:input path="passwd"/><br>
		<input type="submit" value="전송"> 
	</sform:form>

<!-- 	
	<form id="command" action="/tagtest/login" method="post">
		i   d : <input id="userid" name="userid" type="text" value=""/><br>
		p w d : <input id="passwd" name="passwd" type="text" value=""/><br>
		<input type="submit" value="전송"> 
	</form>
-->
</body>
</html>