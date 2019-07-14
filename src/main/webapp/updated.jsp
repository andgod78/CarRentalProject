<%@ page import="pl.com.carrental.model.Car" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Rafal
  Date: 14.07.2019
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Updated List</title>

    <%
        List<Car> list = (List<Car>) application.getAttribute("car");
    %>
    <p>
            <%for(Car b: list){%>
    <li><%=b%>
    </li>
    <%}%>
</head>
<body>

</body>
</html>
