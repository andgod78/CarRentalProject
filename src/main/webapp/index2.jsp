<%@ page import="java.util.List" %>
<%@ page import="pl.com.carrental.model.Car" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <%
    List<Car> cars = (List<Car>) application.getAttribute("car");
%>
<p>
    <%--<%= greet %>--%>
        <%
        for (Car c: cars) {%>
<li><%=c%>
</li>
    <%}%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="updated">
    <input type="text" name="car_id" value="car_id" onclick="this.value=''">
    <input type="submit" name="delete" value="Delete">
</form>

</body>
</html>
