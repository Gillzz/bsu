<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 01.11.2016
  Time: 1:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sorted models</title>
</head>
<body>
<table>
    <c:forEach items="${models}" var="car">
        <tr>
            <td><c:out value="${car.model}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
