<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>

<h2>Submitted info</h2>
<p>
Name: <c:out value="${name}"></c:out>
</p>
<p>
Dojo Location: <c:out value="${location}"></c:out>
</p>
<p>
Favorite Language: <c:out value="${language}"></c:out>
</p>
<p>
Comment: <c:out value="${comment}"></c:out>
</p>

</body>
</html>