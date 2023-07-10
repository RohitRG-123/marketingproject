<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Lead List</title>
</head>
<body>
	<form action="saveLead" method="post">
		<table
			style="background-color: rgba(255, 99, 71, 0.2); border Text-align: center; text-decoration: none"
			border="1">
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Action</th>
			</tr>


			<c:forEach items="${leads}" var="lead">
				<tr>
					<td>${lead.firstName}</td>
					<td>${lead.lastName}</td>
					<td>${lead.email}</td>
					<td>${lead.mobile}</td>
					<td style="padding: 1px">
						<table>
							<tr>
								<td><a style="padding: 20px; text-decoration: none"
									href="delete?id=${lead.id}">Delete</a></td>
								<td><a style="padding: 20px; text-decoration: none"
									href="update?id=${lead.id}">Update</a></td>
							</tr>
						</table>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>