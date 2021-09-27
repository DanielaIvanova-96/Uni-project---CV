
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="login.css" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Login</title>
</head>

<body>
<div class="root">
    <h2 class="title">Влизане в системата</h2>
    <form class="form" action="LoginServlet" method="post" >
        <div class="innerTitle">Потребителско име:</div>
        <input id="username" type= "text" name= "email" class="input" placeholder="Въведете имейл адрес" >
        <div class="innerTitle">Парола:</div>
        <input id="password" type= "password" name= "pass" class="input" placeholder="Въведете парола поне с 8 символа" >
        <input type= "submit" value= "Вход" class="btn_login"/>
    </form>
</div>
</body>
</html>