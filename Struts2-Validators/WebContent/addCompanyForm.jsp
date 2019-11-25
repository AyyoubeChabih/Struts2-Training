<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<style type="text/css">
			.errorMessage {
			  font-weight: bold;
			  color: red;
			}
		</style>
	</head>
	<body>
		<h1>Nouvelle Entreprise</h1>
 
		<s:form action="addCompany">
			<s:textfield name="id" label="Identificateur" />
			<s:textfield name="name" label="Nom"/>
			<s:select name="city" label="Ville" list="{'casablanca','rabat','fès'}" />
			
			<s:submit value="valider" align="center"/>
		</s:form>
 
	</body>
</html>