<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
</head>
<body>

<h1>Create Product</h1>
<form method="POST" action="/newProduct">
<p>
<label for="name">Name</label>
<input type="text" name="name">
</p>
<p>
<label for="description">Description</label>
<textarea name="desc"></textarea>
</p>
<p>
<label for="price">Price</label>
<input type="text" name="price">
</p>
<button>Create</button>
</form>
</body>
</html>