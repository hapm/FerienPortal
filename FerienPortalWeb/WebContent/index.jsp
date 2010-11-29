<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>A-Team FerienPortal</title>
  </head>
  <body>
    <form action="search.jsp" method="get">
    <h1>Wad wollen Sie?</h1>
      <p>Zielort: <input type="text" name="destination" /></p>
    <h1>Und wie viel kostet das?</h1>
      <p>Von 
      <select name="fromPrice">
        <option value="0">0,- €</option>
        <option value="300">300,- €</option>
        <option value="500">500,- €</option>
        <option value="800">800,- €</option>
        <option value="1000">1000,- €</option>
        <option value="1500">1500,- €</option>
        <option value="2000">2000,- €</option>
      </select>
      bis 
      <select name="toPrice">
        <option value="300">300,- €</option>
        <option value="500">500,- €</option>
        <option value="800">800,- €</option>
        <option value="1000">1000,- €</option>
        <option value="1500">1500,- €</option>
        <option value="2000">2000,- €</option>
        <option value="-1" >unbegrenzt</option>
      </select>
      </p>
    <h1>Und wann?</h1>
    <p>
    Von <input type="date" name="travelBegin" />
    bis <input type="date" name="travelEnd" />
    </p>
    <input type="submit" value="Suchen" name="search" />
    </form>
  </body>
</html> 
