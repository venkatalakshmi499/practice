<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Flight</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Flight</h1>
        <form:form action="saveFlight" method="post" modelAttribute="flight">
        <table>
            
            <tr>
                <td>FlightName:</td>
                <td><form:input path="flightName" /></td>
            </tr>
            <tr>
                <td>Source:</td>
                <td><form:input path="source" /></td>
            </tr>
            <tr>
                <td>Destination:</td>
                <td><form:input path="destination" /></td>
            </tr>
            <tr>
                <td>startDateTime:</td>
                <td><form:input path="startDateTime" /></td>
            </tr>
            <tr>
                <td>endDateTime:</td>
                <td><form:input path="endDateTime" /></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><form:input path="price" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>