<%--
  Created by IntelliJ IDEA.
  User: Igor
  Date: 20.10.2016
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
  <c:forEach items="${cars}" var="car">
    <tr>
      <td><c:out value="${car.model}" /></td>
      <td><c:out value="${car.age}" /></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
