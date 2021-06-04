<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-
1">
<link
rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/boo
tstrap.min.css">
<title>Jugadores</title>
</head>
<body>
<section>
<div class="jumbotron">
<div class="container">
<h1>Jugadores</h1>
<p>Agregar Jugadores</p>
</div>
</div>
</section>
<section class="container">
<form:form modelAttribute="nuevoJugador" class="form-horizontal">
<fieldset>
<legend>Agregar nuevo Jugador</legend>

<div class="form-group">
<label class="control-label col-lg-2 col-lg-2"
for="nombreReal">Nombre Real</label>
<div class="col-lg-10">
<form:input id="nombreReal" path="nombreReal" type="text"
class="form:input-large"/>
</div>
</div>

<div class="form-group">
<label class="control-label col-lg-2 col-lg-2"
for="nick">Nick dentro del juego</label>
<div class="col-lg-10">
<form:input id="nick" path="nick" type="text"
class="form:input-large"/>
</div>
</div>

<div class="form-group">
<label class="control-label col-lg-2 col-lg-2"
for="email">E-mail</label>
<div class="col-lg-10">
<form:input id="email" path="email" type="text"
class="form:input-large"/>
</div>
</div>

<div class="form-group">
<label class="control-label col-lg-2 col-lg-2"
for="elo">Elo</label>
<div class="col-lg-10">
<form:input id="elo" path="elo" type="text"
class="form:input-large"/>
</div>
</div>

<div class="form-group">
<div class="col-lg-offset-2 col-lg-10">
<input type="submit" id="btnAdd" class="btn btn-primary"
value ="Add"/>
</div>
</div>
</fieldset>
</form:form>
</section>
</body>
</html>
