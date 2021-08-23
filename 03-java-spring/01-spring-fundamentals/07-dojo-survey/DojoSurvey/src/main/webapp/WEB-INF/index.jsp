<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

<form action="/result">
  <label for="name">Your name:</label>
  <input type="text" name="name"><br><br>
<p>Dojo location:
<select name="location">
  <option value="LA">LA</option>
  <option value="NY">NY</option>
  <option value="Moon">Moon</option>
  <option value="Armenia">Armenia</option>
</select>
</p>
<p>Favorite language:
<select name="language">
  <option value="Java">Java</option>
  <option value="Python">Python</option>
  <option value="JS">JS</option>
  <option value="Mern">Mern</option>
</select>
</p>
<p>Comment (optional)</p>
<textarea  name="comment" rows="4" cols="50">
</textarea><br><br>
<button>Submit</button>

</form>

</body>
</html>