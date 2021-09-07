<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja</title>
</head>
<body>
<form:form method="POST" action="/ninja/createNinja" modelAttribute="ninja">
<p>
<form:label path="dojo">Name</form:label>
<form:errors path="dojo"/>
<form:select path="dojo"></form:select>
<c:forEach items="${allDojos}" var="dojo">
<option value="${dojo.id}">${dojo.name}</option>
</c:forEach>
</p>

<p>
<form:label path="fName">First Name</form:label>
<form:errors path="fName"/>
<form:input path="fName"/>
</p>

<p>
<form:label path="lName">Last Name</form:label>
<form:errors path="lName"/>
<form:input path="lName"/>
</p>

<p>
<form:label path="age">Age</form:label>
<form:errors path="age"/>
<form:input path="age"/>
</p>

<button>New Ninja</button>

</form:form>
</body>
</html>