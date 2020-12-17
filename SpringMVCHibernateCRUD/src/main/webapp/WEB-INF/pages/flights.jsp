<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flight Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Flights List</h1>
		
		<table border="1">

			<th>FlightName</th>
			<th>Source</th>
			<th>Destination</th>
			<th>startDateTime</th>
			<th>endDateTime</th>
			<th>Price</th>

			<c:forEach var="flight" items="${listFlights}">
				<tr>

					<td>${flight.FlightName}</td>
					<td>${flight.Source}</td>
					<td>${flight.Destination}</td>
					<td>${flight.startDateTime}</td>
					<td>${flight.endDateTime}</td>
					<td>${flight.Price}</td>
					
					<td><a href="editFlight?id=${flight.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteFlight?id=${flight.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="newFlight">here</a>
		</h4>
	</div>
</body>
</html>