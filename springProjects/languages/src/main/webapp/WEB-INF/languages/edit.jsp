<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class="jumbotron m-5">
		<h1 class="text-primary">Edit a Language</h1>
		<form:form action="/languages_edit/${lang.id}" method="post" modelAttribute="lang">
			<input type="hidden" name="_method" value="put">
			<p>
				<form:label path="name">Name:</form:label>
				<form:errors path="name"/>
				<form:input path="name" class="form-control"/>
			</p>
			<p>
				<form:label path="creator">Create:</form:label>
				<form:errors path="creator"/>
				<form:input path="creator" class="form-control"/>
			</p>
			<p>
				<form:label path="currentVersion">Current Version:</form:label>
				<form:errors path="currentVersion"/>
				<form:input path="currentVersion" class="form-control"/>
			</p>
			<input type="Submit" value="Edit Language" class="btn btn-primary mt-2">
		</form:form>
	</div>
</body>
</html>