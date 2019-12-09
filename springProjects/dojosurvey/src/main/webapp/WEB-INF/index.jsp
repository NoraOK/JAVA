<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron m-5">
		<form method="POST" action="/processform">
			<h1 class="text-primary">Dojo Survey</h1>
			<p>Your Name:<input class="form-control" type="text" name="name"></p>
			<p>Dojo Location:
				<select name="location" class="form-control">
					<option>San Jose</option>
					<option>Burbank</option>
					<option>Seattle</option>
				</select>
			</p>
			<p>Favorite Language:
				<select name="lang" class="form-control">
					<option>Python</option>
					<option>JavaScript</option>
					<option>Java</option>
				</select>
			</p>
			<p>Comment (optional):</p>	
			<textarea name="comment" class="form-control"></textarea>
			<p><input type="submit" class="mt-3 btn btn-large btn-primary"></p>
		</form>
	</div>
</body>
</html>