<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	
	<div class="container col-8 mx-auto m-5" align=center>
		<div class="nav_bar">
			<a href="/songs/new" class="d-inline">Add New</a>
			<a href="/search/topTen" class="d-inline">Top Songs</a>
			<form action="/search" method="post" class="d-inline">
				<input type="text" name="search">
				<input type="submit" value="Search Artists" class="btn btn-outline-secondary">
			</form>
		</div>
		<div class="all_songs">
			<table class="table">
				<thead>
					<tr>
						<th>Title</th>
						<th>Rating</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${songs}" var="song">
						<tr>
							<td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
							<td><c:out value="${song.rating}"/></td>
							<td>
								<form action="/song_delete/${song.id}" method="post">
									<input type="hidden" name="_method" value="delete">
									<input type="submit" value="delete" class="btn btn-sm btn-outline-warning">
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>