<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-Br">
<head>
<meta charset="UTF-8">
<title>Editar Contato</title>
<link rel="icon" href="assets/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar contato</h1>
	<form name="frmContato" action="updateContato">
		<table>
			<tr>
				<td><input type="text" name="id_contato" id="input3" readonly
					value="<%out.print(request.getAttribute("id_contato"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome" class="input1"
					value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="fone" class="input2"
					value="<%out.print(request.getAttribute("fone"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="email" class="input1"
					value="<%out.print(request.getAttribute("email"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" class="btn-first"
			onclick="validar()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>