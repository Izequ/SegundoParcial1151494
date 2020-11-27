<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Tienda</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/registro.css">
<link rel="stylesheet" type="text/css" href="css/login.css">

</head>
<body>
	<form action="TiendaServlet?action=insert" method="post">
		<div class="form-label-group">
			<input type="text" id="inputNombre" class="form-control"
				placeholder="Nombre" name="nombre" required autofocus> <label
				for="inputNombre">Nombre</label>
		</div>
		<div class="form-label-group">
			<input type="text" id="inputLema" class="form-control"
				placeholder="Lema" name="lema" required autofocus> <label
				for="inputLema">Lema</label>
		</div>
		<div class="form-label-group">
			<textarea id="inputDescripcion" class="form-control"
				placeholder="Descripcion" name="descripcion" required autofocus></textarea>
			<label for="inputDescripcion">Descripción</label>
		</div>
		<div class="form-label-group">
			<input type="email" id="inputEmail" class="form-control"
				placeholder="Email address" name="email" required autofocus>
			<label for="inputEmail">Email</label>
		</div>

		<div class="form-label-group">
			<input type="password" id="inputPassword" class="form-control"
				name="clave" placeholder="Password" required> <label
				for="inputPassword">Password</label>
		</div>

		<div class="form-label-group">
			<input type="input" id="inputPropietario" class="form-control"
				name="propietario" placeholder="Propietario" required> <label
				for="inputPropietario">Propietario</label>
		</div>
		<div class="form-label-group">
			<input type="input" id="inputFacebook" class="form-control"
				name="facebook" placeholder="Facebook" required> <label
				for="inputFacebook">Facebook</label>
		</div>
		<div class="form-label-group">
			<input type="input" id="inputWeb" class="form-control"
				placeholder="Web" name="web" required> <label for="inputWeb">Web</label>
		</div>
		<div class="form-label-group">
			<input type="input" id="inputImagen" class="form-control"
				placeholder="Imagen" name="imagen" required> <label
				for="inputImagen">Imagen</label>
		</div>


		<a href="${pageContext.request.contextPath}/index.jsp" class="btn btn-primary">Registrar Tienda</a>
		
		<a href="${pageContext.request.contextPath}/TablaTienda.jsp"  class="btn btn-success">ver lista de tiendas</a>

	</form>



</body>
</html>