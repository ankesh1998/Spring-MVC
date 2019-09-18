<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Hello User</h1>
<%
int id = (int)request.getAttribute("id");
String name = (String)request.getAttribute("name");
String contact = (String)request.getAttribute("contact");

out.print("Id : "+id+"<br>Name : "+name+"<br>Contact : "+contact);
%>
</body>
</html>