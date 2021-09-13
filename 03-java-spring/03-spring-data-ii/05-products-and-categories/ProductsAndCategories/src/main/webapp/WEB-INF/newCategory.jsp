<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Category</title>
</head>
<body>
<h1>Create Category</h1>
<form method="POST" action="/newCat">
<label for="name">Name</label>
<input type="text" name="cat">
<button>Create</button>
</form>
</body>
</html>