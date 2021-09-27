<%--
  Created by IntelliJ IDEA.
  User: Danny
  Date: 4/5/2020
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="edit.css" rel="stylesheet">
    <meta charset="UTF-8" />
</head>
<body>
<header>
    <form action="user" method="post">

        <h2>
            Информация за потребител </h2>

        <div class ="container1"  style="background-color: #fcc511"> </div>
        <div class="container">

            <input id="email" type="hidden" name="email" value="${user.getEmail()}">

            <label for="name" ><b> Име: </b></label>
            <input id="name" type="text" placeholder="Въведете име за контакт" name="name" required>

            <label for="work"><b> Работа: </b></label>
            <input id="work" type="text" placeholder="Въведете работа" name="work" required>

            <label for="description"><b> Описание: </b></label>
            <input id="description" type="text" placeholder="Въведете описание" name="description" required>

            <label for="phone"><b> Телефон: </b></label>
            <input id="phone" type="text" placeholder="Въведете телефонен номер" name="phone" required>

            <label for="city"><b> Град: </b></label>
            <input id="city" type="text" placeholder="Въведете град" name="city" required>

            <label for="street"><b> Улица: </b></label>
            <input id="street" type="text" placeholder="Въведете улица" name="street" required>

            <button type="submit">Запази</button>

        </div>
    </form>



    </div>
</header>
</body>
</html>
