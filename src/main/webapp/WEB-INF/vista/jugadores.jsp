<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-
1">
<link rel="stylesheet"
href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Jugadores de Bahia Blanca</title>
</head>
<body>
<section>
<div class="jumbotron">
<div class="container">
<h1>Jugadores de Bahia Blanca</h1>
<p>Todos los jugadores registrados en la pagina</p>
</div>
</div>
</section>
<section class="container">
<div class="row">
<%-- Por cada jugador de jugadores (este jugadores hace referencia al model attribute 'jugadores'
del ControladorJugador--%>
<c:forEach var="jugador" items="${jugadores}" >
<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
<div class="thumbnail">
<div class="caption">
<div class="img">
  <img src="https://cdn.iconscout.com/icon/free/png-512/league-of-legends-2288559-1933804.png" alt="">
  </div>
<h3>Nombre Real: ${jugador.nombreReal}</h3>
<p>Nick: ${jugador.nick}</p>
<p>E-mail: ${jugador.email}</p>
<p>Elo: ${jugador.elo}</p>
<p>Posición en Ranking: ${jugador.posEnRanking}</p>
<p>Visitas al perfil: ${jugador.visitas}</p>
<p>Torneos ganados: ${jugador.torneosGanados}</p>
<p>
<a href=" <spring:url value= "/jugadores/jugador?
nick=${jugador.nick}" /> " class="btn btn-primary">
<span class="glyphicon-info-sign glyphicon"/></span> Ver Perfil
</a>
</p>

</div>
</div>
</div>
</c:forEach>
</div>
</section>

<style>
img{width:80%;
height:30%;}
h3{color:red;}
h3:hover{color:green;}
</style>

</body>
</html>