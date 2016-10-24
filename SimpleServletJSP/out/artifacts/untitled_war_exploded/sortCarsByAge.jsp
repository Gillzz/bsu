<%--
  Created by IntelliJ IDEA.
  User: Igor
  Date: 22.10.2016
  Time: 13:11
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
  <c:forEach items="${ages}" var="age">
    <tr>
      <td><c:out value="${age.model}" /></td>
      <td><c:out value="${age.age}" /></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
