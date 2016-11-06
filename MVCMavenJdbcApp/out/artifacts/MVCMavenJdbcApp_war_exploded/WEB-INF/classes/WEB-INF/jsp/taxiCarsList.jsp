<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 03.11.2016
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Our cars</title>
</head>
<body>
<table border="1">
    <tr>
        <td class="heading">Make</td>
        <td class="heading">Model</td>
        <td class="heading">Mileage</td>
        <td class="heading">Age</td>
    </tr>
    <c:forEach var="car" items="${taxiCarsList}">
        <tr>
            <td>${car.make}</td>
            <td>${car.model}</td>
            <td>${car.mileage}</td>
            <td>${car.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
