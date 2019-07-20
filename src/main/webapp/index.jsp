<%--
  Created by IntelliJ IDEA.
  User: Rafal
  Date: 14.07.2019
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="pl.com.carrental.model.Car" %>
<%@ page import="pl.com.carrental.implementation.CarDaoImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Car Rental</h2>

<%

    //List<Car> list =  CarDaoImpl.getInstance().findAllCars();

%>
<p>

            <c:forEach items="${'${'}carList}" var="car">
            <tr>
                <td>${'${'}car.id}</td>
                <td>${'${'}car.brand}</td>
                <td>${'${'}car.model}</td>
                <td>${'${'}car.productionYear}</td>
                <td>${'${'}car.meterStatus}</td>
                <td>${'${'}car.gasoline}</td>

                <%--<td>
                    <form action="<c:url value="/customer/update"/>" method="post">
                        <input type="hidden" name="custId" value="${'${'}customer.id}">
                        <input type="submit" value="Update">
                    </form>
                <td>
                    <form action="<c:url value="/customer/delete"/>" method="post">
                        <input type="hidden" name="custId" value="${'${'}customer.id}">
                        <input style="background: #F00;" type="submit" value="Delete">
                    </form>
                </td>--%>
            </tr>
            </c:forEach>

<%%>
</p>
<form method="post" action="addcar">
    <input type="text" name="brand" value="brand" onclick="value=''">
    <input type="text" name="model" value="model" onclick="value=''">
    <input type="text" name="productionYear" value="productionYear" onclick="value=''">
    <input type="text" name="meterStatus" value="meterStatus" onclick="value=''">
    <input type="text" name="gasoline" value="gasoline" onclick="value=''">
    <input type="submit" value="add" >
</form>
<form method="post" action="delete">
    <input type="text" name="car_id" value="car_id" onclick="this.value=''">
    <input type="submit" name="delete" value="Delete">
</form>

</body>
</html>

