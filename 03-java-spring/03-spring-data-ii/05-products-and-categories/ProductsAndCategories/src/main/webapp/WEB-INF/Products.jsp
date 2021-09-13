<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>
<h1>
<c:out value="${prodId.name}"/>
</h1>

<h2>
<c:out value="${prodId.description}"/>
<c:out value="${prodId.price}"/>
</h2>
<hr>

<h3>Categories:</h3>
<ul>
<c:forEach var="cat" items="${prodId.categories}"> 
<li>${cat.name}</li>
</c:forEach>
</ul>

<form method="POST" action="/addCategory/${prodId.id}">
<select name="cat">
<c:forEach items="${allProds}" var="cat">
<option value="${cat.id}">${prod.name}</option>
</c:forEach>
</select>
<button>Add Category</button>

</form>
</body>
</html>