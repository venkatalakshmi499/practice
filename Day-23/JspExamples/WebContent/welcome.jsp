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
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
<%   
response.sendRedirect("http://www.google.com");  
%>  
<%   
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>

</body>
</html>