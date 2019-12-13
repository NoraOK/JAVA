<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
</head>
<body>
	<div class="jumbotron m-5" align="center">
		<h1>New Product</h1>
		<form:form action="/create_product" method="POST" modelAttribute="product">
			<p>
				<form:label path="name">Name:</form:label>
				<form:input path="name"/>
			</p>
			<p>
				<form:label path="desc">Description:</form:label>
				<form:textarea path="name"></form:textarea>
			</p>
			<p>
				<form:label path="price">Price:</form:label>
				<form:input path="price"/>
			</p>
			<input type="submit" value="Create">
		</form:form>
	</div>
</body>
</html>