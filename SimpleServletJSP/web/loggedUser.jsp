<%@ page import="by.bsu.UserBean" %>
<%--
  Created by IntelliJ IDEA.
  User: Igor
  Date: 15.10.2016
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <% UserBean currentUser = (UserBean (session.getAttribute("currentSessionUser"));%>
  Welcome <%= currentUser.getFirstName() + " " + currentUser.getLastName() %>
</body>
</html>
