<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
		<h1 class="display-4"><c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/></h1>
		<p>License Number: <c:out value="${person.license.number}"/></p>
		<p>State: <c:out value="${person.license.state}"/></p>
		<p>Expiration Date: <c:out value="${person.license.expirationDate}"/></p>
	</div>
</body>
</html>