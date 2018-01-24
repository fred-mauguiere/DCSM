<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<spring:url value="/resources/css/bootstrap.min.css" var="BootstrapCss"></spring:url>
<link href="${BootstrapCss}" rel="stylesheet"></link>
<title>DCSM Applications</title>
</head>
<body>
	<section>
	<div class="jumbotron">
		<div class="container">
			<h1>Applications</h1>
			<p>All available applications with your subscription</p>
		</div>
	</div>
	</section>

	<section class="container">
	<div class="row">
		<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
			<div class="thumbnail">
				<div class="caption">
					<h3>${application.label}</h3>
					<p>${application.description}</p>
				</div>
			</div>
		</div>
	</div>
	</section>
</body>
</html>