<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Aluno</title>
<link rel="icon" href="imagens/iconHat.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Aluno</h1>
	<form name="frmAluno" action="update">
		<table>
			<tr>
				<td><input type="text" name="idAluno" 
					id="Caixa2" readonly value="<%out.println(request.getAttribute("idAluno")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome" 
					class="Caixa1" value="<%out.println(request.getAttribute("nome")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="email" 
					class="Caixa1" value="<%out.println(request.getAttribute("email")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="matricula" 
					class="Caixa1" value="<%out.println(request.getAttribute("matricula")); %>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" class="Botao1"
			onclick="validar()">

	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>