<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n=request.getParameter("name");
out.print("welcome to"+n);
session.setAttribute("user",n);  



%>
<%=new java.util.Date() %> 

<%response.sendRedirect("welcome.jsp"); %>

 <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  




</body>
</html>