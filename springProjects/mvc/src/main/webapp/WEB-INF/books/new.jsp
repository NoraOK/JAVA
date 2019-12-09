<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Book</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron m-5">
	<h1 class="text-primary">Create New Book Here:</h1>
		<form:form action="/books" method="POST" modelAttribute="book">
			<p>
				<form:label path="title">Title:</form:label>
				<form:errors path = "title"/>
				<form:input path = "title" class="form-control"/>
			</p>
			<p>
				<form:label path="description">Description:</form:label>
				<form:errors path = "description"/>
				<form:input path = "description" class="form-control"/>
			</p>
			<p>
				<form:label path="language">Language:</form:label>
				<form:errors path = "language"/>
				<form:input path = "language" class="form-control"/>
			</p>
			<p>
				<form:label path="numberOfPages">Number of Pages:</form:label>
				<form:errors path = "numberOfPages"/>
				<form:input path = "numberOfPages" class="form-control"/>
			</p>
			<input type="submit" value="New Book"class="btn btn-lg btn-primary"/>
		</form:form>
	</div>
</body>
</html>