<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Tienda Virtual SP</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="css/card.css">
</head>
<body>
	<jsp:useBean class="dao.TiendaDao" id="tiendaDAO"></jsp:useBean>
	<!-- Team -->
	<section id="team" class="pb-5">
		<div class="container">
			<h5 class="section-title h1">ServicioS</h5>
			<div class="row  justify-content-center pb-5">

				<div class="col-xs-12 col-sm-6 col-md-3">
					<a href="${pageContext.request.contextPath}/index.jsp"
						class="btn btn-lg btn-primary btn-block text-uppercase font-weight-bold mb-2 text-light"
						type="submit">index</a>
				</div>

				<div class="col-xs-12 col-sm-6 col-md-3 align-self-center">
					<a href="${pageContext.request.contextPath}/Registro.jsp"
						class="btn btn-lg btn-primary btn-block text-uppercase font-weight-bold mb-2 text-light"
						type="submit">Registrate</a>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-3 align-self-center">
					<a href="${pageContext.request.contextPath}/Servicios.jsp"
						class="btn btn-lg btn-primary btn-block text-uppercase font-weight-bold mb-2 text-light"
						type="submit">Lista Servicios</a>
				</div>
			</div>

			<div class="row">
				<!-- Team member -->
				<c:forEach items="${tiendaDAO.list()}" var="tienda">
					<div class="col-xs-12 col-sm-6 col-md-4">
						<div class="image-flip">
							<div class="mainflip flip-0">
								<div class="frontside">
									<div class="card">
										<div class="card-body text-center">
											<p>
												<img class=" img-fluid"
													src="<c:out value="${tienda.imagen}" />" alt="card image">
											</p>
											<h4 class="card-title">
												<c:out value="${tienda.nombre}" />
											</h4>
											<p class="card-text">
												<c:out value="${tienda.lema}" />
											</p>
											<a href="https://www.fiverr.com/share/qb8D02"
												class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
										</div>
									</div>
								</div>
								<div class="backside">
									<div class="card">
										<div class="card-body text-center mt-4">
											<h4 class="card-title">
												<c:out value="${tienda.propietario}" />
											</h4>
											<p class="card-text">
												<c:out value="${tienda.descripcion}" />
											</p>
											<ul class="list-inline">
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank"
													href="<c:out value="${tienda.facebook}" />" /> <i
													class="fa fa-facebook"></i> </a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank"
													href="https://www.fiverr.com/share/qb8D02"> <i
														class="fa fa-share"></i>
												</a></li>
												<li class="list-inline-item"><a
													class="social-icon text-xs-center" target="_blank"
													href="<c:out value="${tienda.web}" />" /> <i
													class="fa fa-info-circle"></i> </a></li>

											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
	</section>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
</body>
</html>