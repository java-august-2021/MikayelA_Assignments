<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Categories</title>
</head>
<body>
<h1>
<c:out value="${catId.name}"/>
</h1>
<hr>
<h2>Products</h2>
<ul>
<c:forEach var="prod" items="${catId.products}"> 
<li> ${prod.name} | ${prod.description} | ${prod.price}
</c:forEach>
</ul>

<form method="POST" action="/addProduct/${catId.id}">
<select name="prod">
<c:forEach items="${allCats}" var="prod">
<option value="${prod.id}">${prod.name}</option>
</c:forEach>
</select>
<button>Add Product</button>
</form>

<h2>Products:</h2>
<p>

</body>
</html>