<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ page import="com.ArcLancer.Spring.SayHello"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>

<%
	SayHello sayHello = new SayHello();
	String stringHello = sayHello.SayHello2();
%>

<body>
	<h2>Say ArcLancer (JSP)</h2>
	<h3><%=stringHello%></h3>
</body>
</html>