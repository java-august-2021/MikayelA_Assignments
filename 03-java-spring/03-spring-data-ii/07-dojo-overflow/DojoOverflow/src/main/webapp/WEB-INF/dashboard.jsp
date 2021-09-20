<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Question</th>
<th>Tags</th>
</tr>
<c:forEach items="${allQ}" var="q">
<tr>
<td><a href="/show/${q.qtext}"></a></td>
<td>
<p>
<c:forEach items="${q.qtags}" var="tagtext">
${tagtext.subject},
</c:forEach>
</p>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>