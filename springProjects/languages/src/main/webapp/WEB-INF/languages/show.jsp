<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Language Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron m-5">
		<a href="/languages">Dashboard</a>
		<p>Name: <c:out value="${ lang.name }"/></p>
		<p>Creator: <c:out value="${ lang.creator }"/></p>
		<p>Version: <c:out value="${ lang.currentVersion }"/></p>
		<a href="/languages/edit/${lang.id}" class="btn btn-primary mt-2">Edit</a>
		<form action="/languages_delete/${lang.id}" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input type="submit" value="Delete" class="btn btn-primary mt-2">
		</form>
	</div>
</body>
</html>