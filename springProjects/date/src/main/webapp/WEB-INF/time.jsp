<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time</title>
<script type="text/javascript" src="js/time.js"></script>
<link rel="stylesheet" type="text/css" href="css/time.css">
</head>
<body>
	 <h1><fmt:formatDate pattern = "HH:mm:ss a" value = "${time}"/></h1>
</body>
</html>