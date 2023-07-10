<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead</title>
</head>
<body>
	<h1>Update Lead</h1>
	<form action="updateLead" method="post">
		<pre>
		<b></b><input type="hidden" name="id" value="${lead.id}"/>
<b>FirstName:</b><input type="text" name="firstName" value="${lead.firstName}" />
<b>LastName:</b><input type="text" name="lastName" value="${lead.lastName}" />
<b>Email:</b><input type="text" name="email" value="${lead.email}" />
<b>Mobile:</b><input type="text" name="mobile"  value="${lead.mobile}"/>
<input type="submit" value="Update" />
</pre>
	</form>
	${msg}

</body>
</html>