
<%@page import="com.spring.test.springmvc.employee.pojo.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> emp= (List<Employee>)request.getAttribute("employees"); 
	for(Employee e: emp){
		out.print(e+"<br>");
	}
%>
</body>
</html>