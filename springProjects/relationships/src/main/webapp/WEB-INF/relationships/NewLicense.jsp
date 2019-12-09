<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
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
		<h1>New License</h1>
		<form:form action="/license/process" method="post" modelAttribute="license">
			<p>
				<form:label path="person">Person:</form:label>
				<form:select path="person" class="form-control">
					<c:forEach items="${persons}" var="person">
						<form:option value="${person.id}">
							<c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/>
						</form:option>
					</c:forEach>
				</form:select>
			</p>
			<p>
				<form:label path="state">State:</form:label>
				<form:input path="state" class="form-control"/>
			</p>
			<p>
				<form:label path="expirationDate">Expiration Date:</form:label>
				<form:input type="date" path="expirationDate"/>
			</p>
			<input type="submit" value="Create" class="btn btn-primary">
		</form:form>
	</div>
</body>
</html>