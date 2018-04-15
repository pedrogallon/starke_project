<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="author" content="PedroGallonAlves-816124368,JhonnanthnBalsas-#,MilenaCaroline-#,FilipeRoque-#,VictorHiga-#">
		<title>FilaStarke</title>
		<link href="assets/css/geral-style.css" rel="stylesheet">
		<link href="assets/css/listar-style.css" rel="stylesheet">
	</head>
	
	<body>
		<c:import url="nav.jsp" />
		<div class="container">
			<div class="s-container-lista">
				<section class="table">
					<div class="thead">
						<div class="table-line">
							<p>Senha</p>
							<p>Tipo</p>
							<p>Status</p>
							<p>Tempo Médio</p>
							<p>Horário Chegada</p>
							<p>Aguardando a</p>
						</div>
					</div>
					<div class="tbody">
						<c:forEach var="senha" items="${senhas}">
                            <div class="table-line">
								<p>${senha.nome}</p>
								<p>${senha.tipo}</p>
								<p>${senha.status}</p>
								<p>Tempo Médio</p>
								<p><fmt:formatDate pattern = "HH:mm:ss" value = "${senha.dataEntrada}" /></p>
								<p>Aguardando a</p>
							</div>
                        </c:forEach>
					</div>
				</section>
			</div>
		</div> 
		<script src="assets/js/jquery-3.3.1.min.js"></script>
		<script src="assets/js/popper.min.js"></script>	
	</body>
</html>