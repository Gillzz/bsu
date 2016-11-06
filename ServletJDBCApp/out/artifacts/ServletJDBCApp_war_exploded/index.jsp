<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 27.10.2016
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Taxi park</title>
  </head>
  <body>
  <form action="ServletController", method="get">
      <br><input type="submit" name="showCars" value="Our cars" />
      <br><input type="submit" name="sortCarsByAge" value="Sort car by age" />
      <br><input type="submit" name="sortCarsByModel" value="Sort cars by model" />
    </form>
  </body>
</html>
