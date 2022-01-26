<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1 align="center">WELCOME TO EDIT DATA</h1>
</head>
<body>
<form action="update">
<table border="1"> 
<input type="hidden" name="uid" value="${data.uid}">
<tr>
<td>Name:-</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>
<tr>
<td>username:-</td>
<td><input type="text" name="uname" value="${data.uname}"></td>
</tr>
<tr>
<td>password:-</td>
<td><input type="text" name="password" value="${data.password}"></td>
</tr>
<tr>
<td>mobileno:-</td>
<td><input type="text" name="mobileno" value="${data.mobileno}"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>