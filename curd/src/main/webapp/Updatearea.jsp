<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="aaaa1.org.*"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="e" items="${list}"> 
<form action=Updated method=post>

Name:<input type= text name=name required placeholder="${e.name}">
Email<input type=email name=mail required placeholder="${e.mail}">

<button name=id value=${e.id} >update</button>
</form>
</c:forEach>
</body>
</html>