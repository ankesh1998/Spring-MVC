
<%@page import="com.spring.test.springmvc.employee.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h3 style="text-align: center;color: green">User Registered Successfully</h3>
<% Employee emp = (Employee)request.getAttribute("emp"); 
out.print("<center>Id : "+emp.getId());
out.print("<br>Name : "+emp.getName());
out.print("<br>Contact : "+emp.getContact()+"</center>");
%>
</body>
</html>