<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Igor
  Date: 19.10.2016
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <form action="ServletSimpleApp" method="post">
      <br><input type="submit" name="showCars" value="Our cars" />
      <br><input type="submit" name="sortCarsByAge" value="Sort car by age" />
      <br><input type="submit" name="sortCarsByModel" value="Sort cars by model" />
  </form>
  </body>
</html>
