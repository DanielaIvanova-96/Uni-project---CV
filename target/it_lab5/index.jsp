<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Danny
  Date: 3/25/2020
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="index.css" rel="stylesheet">
</head>
<body class="mainBody">
    <div class="navProfil">
        <a href="login" class="button" type="submit" style="display: inline-block; text-decoration: none"> Вход </a>
        <a href="Signup" class="button" type="submit" style="display: inline-block; text-decoration: none"> Регистрация </a>
        <a href="user" class="button" type="submit" style="display: inline-block; text-decoration: none" > Профил </a>
        <a href="menu" class="button" type="submit" style="display: inline-block; text-decoration: none" > Потребители </a>
    </div>
    <div class="section1">
        <table style="margin: 50px;  width:90%;">
            <tr>
                <td style="width: 10%; background-color: #ffb606;" > Потребител </td>
                <td style="width: 10%; background-color: #ffb606;"  > Работа </td>
                <td style="width: 80%; background-color: #ffb606;"  > Информация </td>
            </tr>

            <c:forEach var="user" items="${users}">
            <tr>
                <td style="width: 10%;"><a href="print?name=${user.getName()}" >${user.getName()}</a></td>
                <td style="width: 10%; ">${user.getWork()}</td>
                <td style="width: 80%;">${user.getDescription()}</td>
            </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
