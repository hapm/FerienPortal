<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>A-Team FerienPortal - Suchergebnisse</title>
	</head>
	<body>
		<jsp:useBean id="travel" class="fhbrs.ateam.ferienportal.TravelRequest" />
		<jsp:setProperty property="*" name="travel" />
		<h1>Ihre Suchparameter</h1>
		<p>Zielort: <jsp:getProperty name="travel" property="destination" /></p>
		<p>Preis: <jsp:getProperty name="travel" property="fromPrice" /> bis <jsp:getProperty name="travel" property="toPrice" /></p>
		<p>Zeitraum: <jsp:getProperty name="travel" property="travelBegin" /> bis <jsp:getProperty name="travel" property="travelEnd" /></p>
	</body>
</html>