<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron col-8 mx-auto m-5" align=center>
		<a class="btn btn-warning mt-2" href="/">HOME</a>
		<h1>New Person</h1>
		<form:form action="/person/process" method="post" modelAttribute="person">
			<p>
				<form:label path="firstName">First Name:</form:label>
				<form:input path="firstName" class="form-control"/>
			</p>
			<p>
				<form:label path="lastName">Last Name:</form:label>
				<form:input path="lastName" class="form-control"/>
			</p>
			<input type="submit" value="Create" class="btn btn-primary">
		</form:form>
		<a class="btn btn-danger" href="/">CANCEL</a>
	</div>
</body>
</html>