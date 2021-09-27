<%--
  Created by IntelliJ IDEA.
  User: Danny
  Date: 3/23/2020
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <link href="welcome.css" rel="stylesheet">
    <meta charset="UTF-8" />
</head>

<body class="mainBody">
<div class="navProfil">
    <a href="login" class="button" type="submit" style="display: inline-block; text-decoration: none"> Вход </a>
    <a href="Signup" class="button" type="submit" style="display: inline-block; text-decoration: none"> Регистрация </a>
    <a href="menu" class="button" type="submit" style="display: inline-block; text-decoration: none" > Потребители </a>
    <a href="profil" class="button" type="submit" style="display: inline-block; text-decoration: none" > Преглед </a>
    <a href="logout" class="button" type="submit" style="display: inline-block; text-decoration: none" > Изход </a>
</div>
<div class="info">
    <div class="section1">
        <div class="picDiv">
            <img class="pic" src="./res/img/woman.svg" />
        </div>
        <div class="basicInfo">
            <form id="profil" action="profil" method="post">
                <h2>Профилна инфромация</h2>
                <div class="basicContent" >Име: <br>
                    <input id="name" type="text" class="css-input" name="name">
                </div>
                <div class="basicContent" >Работа: <br>
                    <input id="job" type="text" class="css-input" name="job">
                </div>
                <div class="basicContent" >Описание:<br>
                    <input id="info" type="text" class="css-input" name="info">
                </div>
                <div>
                    <input class="buttonSave" type="submit" value="Запази">
            </div>
            </form>
        </div>
    </div>
    
    <div class="sectionTitle" >
        <h2>Умения</h2>
    </div>

<%--    <div class="section">--%>
    <form class="section" action="skills" method="post">
        <div class="skills">
            <h3>Професионални</h3>
            <div class="label">Java<br>
                <input name="java" class="bar" type="range" min="0" max="100" step="10" /></div>
            <div class="label">HTML<br>
                <input name="html" class="bar" type="range" min="0" max="100" step="10" /></div>
            <div class="label">CSS<br>
                <input name="css" class="bar" type="range" min="0" max="100" step="10" /></div>
            <div class="label">JS<br>
                <input name="js" class="bar" type="range" min="0" max="100" step="10" /></div>
        </div>

        <div class="skills">
            <h3>Личностни</h3>
            <div class="label">Комуникативност<br>
                <input name="comm" class="bar" type="range" min="0" max="100" step="10" /></div>
            <div class="label">Екипна работа<br>
                <input name="team" class="bar" type="range" min="0" max="100" step="10" /></div>
            <div class="label">Креативност<br>
                <input name="creative" class="bar" type="range" min="0" max="100" step="10" /></div>
            <div>
                <input class="buttonSave" type="submit" value = "Запази" >
            </div>

        </div>
    </form>
<%--    </div>--%>

    <div class="sectionTitle" >
        <h2>Контакти</h2>
    </div>
    <form class="section" action="contact" method="post">
        <div class="skills">
            <div class="label">Имейл:<br>
                <input id="email" type="text" class="css-input" name="email"></div>
            <div class="label">Телефон:<br>
                <input id="phone" type="text" class="css-input" name="phone"></div>
        </div>

        <div class="skills">
            <div class="label">Град:<br>
                <input id="city" type="text" class="css-input" name="city"></div>
            <div class="label">Улица:<br>
                <input id="street" type="text" class="css-input" name="street"></div>
            <div>
                <input class="buttonSave" type="submit" value = "Запази" ></div>
        </div>
    </form>

</div>

<div class="footerProfil">
</div>
</body>

</html>
