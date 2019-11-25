<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Entreprise bien enregistée ! ${company.name} </h1>
		<h2>
			<%= request.getAttribute("company") %>
		</h2>
		<h2>
			<s:property value="company.name" />
		</h2>
	</body>
</html>