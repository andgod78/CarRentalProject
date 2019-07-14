<%--
  Created by IntelliJ IDEA.
  User: Rafal
  Date: 14.07.2019
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="pl.com.carrental.model.Car" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Car Rental</h2>

<%
    List<Car> list = (List<Car>) application.getAttribute("car");
%>
<p>
        <%for(Car b: list){%>
<li><%=b%>
</li>
<%}%>
</p>
<form method="post" action="updated">
    <input type="text" name="brand" value="brand" onclick="value=''">
    <input type="text" name="model" value="model" onclick="value=''">
    <input type="text" name="productionYear" value="productionYear" onclick="value=''">
    <input type="text" name="meterStatus" value="meterStatus" onclick="value=''">
    <input type="text" name="gasoline" value="gasoline" onclick="value=''">
    <input type="submit" value="add" >
</form>
</body>
</html>

