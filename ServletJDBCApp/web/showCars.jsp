<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 01.11.2016
  Time: 0:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Our cars</title>
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
