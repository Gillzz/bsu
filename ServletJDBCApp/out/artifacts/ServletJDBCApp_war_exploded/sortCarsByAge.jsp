<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 01.11.2016
  Time: 1:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sorted cars by age</title>
</head>
<body>
<table>
    <c:forEach items="${ages}" var="age">
        <tr>
            <td><c:out value="${age.model}" /></td>
            <td><c:out value="${age.age}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
