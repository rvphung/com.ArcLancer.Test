<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>

<%@ page import="java.sql.*"%>

<%@ page import="com.ArcLancer.Test.Spring.SayHello"%>
<%@ page import="com.ArcLancer.Test.DAO.MySQL"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>

<%
	SayHello sayHello = new SayHello();
	String stringHello = sayHello.SayHello2();
	
	//SQLite sqlite = new SQLite();
	//Connection connection = sqlite.getConnection();
	//sqlite.createTable(connection);
	//sqlite.insert(connection, 1, "TEST");
	
	//String stringResult = null;
	//stringResult += "<br />" + sqlite.selectAll(connection);
	//connection.close();
	
	MySQL mySQL = new MySQL();
	Connection connection = mySQL.getConnection();
	mySQL.insert(connection, 1, "TEST");
	
	String stringResult = null;
	stringResult += "<br />" + mySQL.selectAll(connection);
	connection.close();
%>

<body>
	<h2>Say ArcLancer (JSP)</h2>
	<h3><%=stringHello%></h3>	
	<h3><%=stringResult%></h3>
</body>
</html>