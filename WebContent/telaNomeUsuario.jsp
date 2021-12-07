<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cadastro</title>
	</head>
	<body>
		<form action="Cadastrar" method="post">
			<input type="hidden" name="pagina" value="2">
			<table>
				<tr>
					<td>Nome do usuário : </td>
					<td><input type="text" name="nome"></td>
				</tr>	
				<tr>
					<td colspan="2"><input type="submit" value="Proximo"></td>
				</tr>
			</table>
		</form>
	</body>
</html>