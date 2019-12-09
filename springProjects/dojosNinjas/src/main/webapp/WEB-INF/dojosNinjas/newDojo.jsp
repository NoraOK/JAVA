<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron m-5" align="center">
		<h1>New Dojo</h1>
		<form:form action="/process_dojo" method="post" modelAttribute="dojo">
			<form:label path="name">Name:</form:label>
			<form:input path="name"/>
			<input type="submit" value="CREATE">
		</form:form>
	</div>
</body>
</html>