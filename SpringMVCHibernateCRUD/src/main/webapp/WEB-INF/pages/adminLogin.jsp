<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
<style>
body
{
background-image:url('data:image/jpeg;base64,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');
background-repeat: no-repeat;
background-size: cover;
}
</style>
</head>
<body>
<form:form action="./login" modelAttribute="admin">
Enter username: <form:input path="username" type="text"/><br>
Enter password:<form:input path="password" type="password"/><br>
<input type="submit" value="login">

</form:form>

</body>
</html>