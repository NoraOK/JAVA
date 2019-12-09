<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date</title>
<script type="text/javascript" src="js/date.js"></script>
<link rel="stylesheet" type="text/css" href="css/date.css">
</head>
<body>
	 <h1><fmt:formatDate pattern = "MM-dd-yyyy" value = "${date}"/></h1>
</body>
</html>