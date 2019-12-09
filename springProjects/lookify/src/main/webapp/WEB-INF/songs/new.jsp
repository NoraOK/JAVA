<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Song</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container col-8 mx-auto m-5" align=center>
		<a href="/dashboard">Dashboard</a>
		<form:form action="/song_create" method="post" modelAttribute="song">
			<p>
				<form:label path="title">Title:</form:label>
				<form:errors path="title"/>
				<form:input path="title" class="form-control"/>
			</p>
			<p>
				<form:label path="artist">Artist:</form:label>
				<form:errors path="artist"/>
				<form:input path="artist" class="form-control"/>
			</p>
			<p>
				<form:label path="rating">Rating (1-10):</form:label>
				<form:errors path="rating"/>
				<form:select path="rating" class="form-control">
					<form:option value="1">1</form:option>
					<form:option value="2">2</form:option>
					<form:option value="3">3</form:option>
					<form:option value="4">4</form:option>
					<form:option value="5">5</form:option>
					<form:option value="6">6</form:option>
					<form:option value="7">7</form:option>
					<form:option value="8">8</form:option>
					<form:option value="9">9</form:option>
					<form:option value="10">10</form:option>
				</form:select>
			</p>
			<input type="submit" class="btn btn-lg btn-primary" value="Add Song">
		</form:form>
	</div>
</body>
</html>