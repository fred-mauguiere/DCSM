<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<spring:url value="/resources/css/bootstrap.min.css" var="BootstrapCss"></spring:url>
	<link href="${BootstrapCss}" rel="stylesheet"></link>
	<title>Insert title here</title>
</head>
<body>
	<section>
	<div class="jumbotron">
		<div class="container">
			<h1>${greeting}</h1>
			<p>${tagline}</p>
		</div>
	</div>
	</section>
</body>
</html>