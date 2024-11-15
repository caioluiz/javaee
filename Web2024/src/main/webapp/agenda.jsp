<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>

<%
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contatos");

%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda</title>
<link rel="icon" href="imagens/iconHat.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Agenda de Alunos</h1>
	<a href="novo.html" class="Botao1">Novo Aluno</a>
	<a href="report" class="Botao2">Relatório</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Email</th>
				<th>Matricula</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%for (int i = 0; i < lista.size(); i++) { %>
				<tr>
					<td><%=lista.get(i).getIdAluno() %></td>
					<td><%=lista.get(i).getNome() %></td>
					<td><%=lista.get(i).getEmail() %></td>
					<td><%=lista.get(i).getMatricula() %></td>
					<td><a href="select?idAluno=<%=lista.get(i).getIdAluno() %>" class="Botao1">Editar</a>
				<!-- 	<a href="javascript: confirmar(<%=lista.get(i).getIdAluno() %>)" class="Botao2">Excluir</a> -->
					</td>
				</tr>
			<% } %>
		</tbody>
	</table>
	<script src="scripts/confirmador.js"></script>
</body>
</html>