<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Dados adicionais </title>	
	</head>
	<body>
		<h1>Dados Cadastrados</h1>
		<table>
			<tr>
				<td><strong>Email :</strong></td>
				<td><%= session.getAttribute("email") %></td>
			</tr>
			<tr>
				<td><strong>Nome de Usuario :</strong></td>
				<td><%= session.getAttribute("nome") %></td>
			</tr>
			<tr>
				<td><strong>Telefone : </strong></td>
				<td><%= session.getAttribute("telefone") %></td>
			</tr>
		</table>
	</body>
</html>