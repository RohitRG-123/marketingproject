<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Lead</title>
</head>
<body>
	<h1>Create new Lead</h1>
	<form action="saveLead" method="post">
		<pre>
<b>FirstName:</b><input type="text" name="firstName" />
<b>LastName:</b><input type="text" name="lastName" />
<b>Email:</b><input type="text" name="email" />
<b>Mobile:</b><input type="text" name="mobile" />
<input type="submit" value="Save" />
</pre>
	</form>
	${msg}

</body>
</html>