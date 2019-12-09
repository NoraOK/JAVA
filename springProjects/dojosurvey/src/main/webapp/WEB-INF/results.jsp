<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron m-5">
		<h1 class="text-primary">Submitted Information:</h1>
		<p>Name: <c:out value="${ name }"/></p>
		<p>Dojo Location: <c:out value="${ location }"/></p>
		<p>Favorite Language: <c:out value="${ lang }"/></p>
		<p>Comment: <c:out value="${ comment }"/></p>
		<a href="/" class="mt-3 btn btn-large btn-primary">Go Back!</a>
	</div>
</body>
</html>