<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron m-5" align="center">
		<h1>New Ninja</h1>
		<form:form action="/process_ninja" method="post" modelAttribute="ninja">
			<p>
				<form:label path="dojo">Dojo:</form:label>
				<form:select path="dojo">
						<c:forEach items="${dojos}" var="dojo">
							<form:option value="${dojo.id}">
								<c:out value="${dojo.name}"/> 
							</form:option>
						</c:forEach>
				</form:select>
			</p>
			<p>
				<form:label path="firstName">First Name:</form:label>
				<form:input path="firstName"/>

			</p>
			<p>
				<form:label path="lastName">Last Name:</form:label>
				<form:input path="lastName"/>

			</p>
			<p>
				<form:label path="age">Age:</form:label>
				<form:input path="age"/>

			</p>
			<input type="submit" value="CREATE">
		</form:form>
	</div>
</body>
</html>