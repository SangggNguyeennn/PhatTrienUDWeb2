<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="F" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<F:form action="update.html" modelAttribute="student" method="post">
		<F:input path="name"/>
		<F:input path="mark"/>
		<F:input path="major"/>
		<input type="submit" name="Cap Nhat"/>
	</F:form>
</body>
</html>