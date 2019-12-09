<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container col-8 mx-auto m-5" align=center>
		<a href="/dashboard">Dashboard</a>
		<form action="/search" method="post">
			<input type="text" name="search">
    		<input type="submit" value="Search Artists" class="btn btn-outline-primary">
		</form>
		<table class="table">
			<thead>
			  <tr>
			  	<th>Artist</th>
			    <th>Title</th>
			    <th>Rating</th>
			    <th>Actions</th>
			  </tr>
			 </thead>
		  	 <tbody>
		 		<c:forEach  items="${songs}" var="song">
		 		<tr>
				  	<td><c:out value="${song.artist}"/></td>
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
</body>
</html>