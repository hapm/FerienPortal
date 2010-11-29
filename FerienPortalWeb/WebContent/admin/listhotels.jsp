<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, fhbrs.ateam.ferienportal.data.*, fhbrs.ateam.ferienportal.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<jsp:useBean id="management" class="fhbrs.ateam.ferienportal.HotelManagement" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>FerienPortal - Administration - Hotelliste</title>
</head>
<body>
	<h1>Hotel-Administration</h1>
	<p>Hier können Sie die vorhandenen Hotels administrieren.</p>
	<%
    	List<Hotel> hotels = management.getHotelList();    
		for (Hotel h : hotels) {
	%>
	<p><jsp:getProperty name="h" property="name" /></p>
	<%
		} 
	%>
</body>
</html>