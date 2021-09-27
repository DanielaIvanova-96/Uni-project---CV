<%--
  Created by IntelliJ IDEA.
  User: Danny
  Date: 4/13/2020
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="signup.css">
    <title> Автобиография </title>
</head>
<body>

<header>

    <form action="Signup" method="post">

        <h2>
            Създаване на профил </h2>

        <div class ="container1"  style="background-color:rgb(252, 197, 17)"> </div>


        <div class="container">
            <label for="email"><b> Потребителско име: </b></label>
            <input id="email" type="text" placeholder="Въведете имейл адрес" name="email" required>

            <label for="pass"><b> Парола: </b></label>
            <input id="pass" type="password" placeholder="Въведете парола поне с 8 символа" name="pass" required>

            <label for="pass_r"><b> Повторете паролата: </b></label>
            <input id="pass_r" type="password" placeholder="Въведете парола поне с 8 символа" name="pass_r" required>

            <button type="submit">Регистрация</button>

        </div>

        <div class="container" style="background-color:#f1f1f1"></div>

        </div>
    </form>



    </div>
</header>
</body>
</html>
