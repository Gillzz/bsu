<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 03.11.2016
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Taxi park</title>
</head>
<body>
<form:form method="get" action="/getTaxiCars" modelAttribute="TaxiCar">
    <br><input type="submit" name="taxiCarsList" value="Our cars" />
</form:form>
<form:form method="get" action="/sortByModel" modelAttribute="TaxiCar">
    <br><input type="submit" name="sortCarsByModel" value="Sort cars by model" />
</form:form>
<form:form method="get" action="/sortByAge" modelAttribute="TaxiCar">
    <br><input type="submit" name="sortCarsByAge" value="Sort cars by age" />
</form:form>
</body>
</html>
