<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: juansfolder
  Date: 7/14/22
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>login</title>
</head>
<body>
<!--login.java is invoked when login button is pressed-->
<form action = "Login" method="post">
    Enter username: <input type="text" name="username"><br>
    Enter password: <input type="password" name="password"><br>
    <input type="submit" value="login">
</form>
<c:choose>

</c:choose>
    <c:when test="${(param.username.equals(\"admin\)) && (param.password.equals(\"password\"))}">
        response.sendRedirect("profile.jsp")
    </c:when>
<c:otherwise>
        <% response.sendRedirect("/login.jsp");%>
</c:otherwise>
</body>
</html>