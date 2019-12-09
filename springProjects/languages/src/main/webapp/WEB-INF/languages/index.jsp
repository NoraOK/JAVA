<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron m-5">
		<h1 class="text-primary">Languages</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${langs}" var="lang">
				<tr>
					<td><a href="/languages/${lang.id}"><c:out value="${lang.name}"/></a></td>
					<td><c:out value="${lang.creator}"/></td>
					<td><c:out value="${lang.currentVersion}"/></td>
					<td>
						<form action="/languages_delete/${lang.id}" method="post" class="d-inline mt-2">
		    				<input type="hidden" name="_method" value="delete">
							<input type="submit" value="Delete" class="btn btn-primary">
						</form>
						<a href="/languages/edit/${lang.id}" class="btn btn-primary mt-2 d-inline">Edit</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="jumbotron m-5">
		<h1 class="text-primary">Add a Language</h1>
		<form:form action="/languages_create" method="post" modelAttribute="lang">
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
			<input type="Submit" value="Add Language" class="btn btn-primary mt-2">
		</form:form>
	</div>
</body>
</html>