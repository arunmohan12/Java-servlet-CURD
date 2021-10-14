<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name= form1 action=Register method=post>
Id:<input type=text name=id required><br><br>
Name:<input type=text name=name required><br><br>
Mail:<input type="text" name=mail value=""required><br><br>
<span id="message"></span>
<button name=submit onClick="validation()">Submit</button>
<p>

</form>

</body>
</html>