<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-
1">
<link rel="stylesheet"
href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Jugadores</title>
</head>
<body>
<section>
<div class="jumbotron">
<div class="container">
<h1>Jugadores</h1>
</div>
</div>
</section>
<section class="container">

<div class="row">
<div class="col-md-5">
<div class="panel panel-default">
 <div class="panel-heading"><h3>Perfil de ${jugador.nombreReal}</h3></div>
<div class="panel-body"> 
<p><strong>Email: ${jugador.email}</strong></p>
<p>
<strong>Nick del Jugador: </strong><span class="label label-danger">${jugador.nick}</span>
</p>
<p>
<strong>Elo</strong> : ${jugador.elo}
</p>
<p>
<strong>Visitas</strong> : ${jugador.visitas}
</p>
<p>
<strong>Torneos Ganados: </strong> :
${jugador.torneosGanados}
</p>
<h4>Posición en ranking: ${jugador.posEnRanking}</h4>
<a href="<spring:url value="/jugadores" />" class="btn btn-default">
<span class="glyphicon-hand-left glyphicon"></span> Volver
</a>

</div>
</div>
</div>
</div>
</section>
</body>
</html>
