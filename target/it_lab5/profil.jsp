<%--
  Created by IntelliJ IDEA.
  User: Danny
  Date: 4/27/2020
  Time: 12:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <link href="profil.css" rel="stylesheet">
    <meta charset="UTF-8" />
</head>

<body class="mainBody">
<div class="navProfil">
    <a href="${url}" class="button" style="margin-left: 10px; display: inline-block; text-decoration: none" >Назад</a>
</div>
<div class="info">
    <div class="section1">
        <div class="picDiv">
            <img class="pic" src="./res/img/woman.svg" />
        </div>
        <div class="basicInfo">
            <h2>Профилна инфромация</h2>
            <div class="basicContent" >
                Име: <u>${user.getName()}</u>
            </div>
            <div class="basicContent" >
                Работа: <u>${user.getWork()}</u>
            </div>
            <div class="basicContent" >
                Описание: <u>${user.getDescription()}</u>
            </div>
        </div>
    </div>
</div>

<div class="sectionTitle" >
    <h2>Умения</h2>
</div>

<div class="section">
    <div class="skills">
        <h3>Професионални</h3>
        <div class="label">Java</div>
        <div class="bar"> <div class="progress" style="width: ${user.getSkills().getJavaSkill()}%"></div> </div>
        <div class="label">HTML</div>
        <div class="bar"> <div class="progress" style="width: ${user.getSkills().getHtmlSkill()}%" ></div> </div>
        <div class="label">CSS</div>
        <div class="bar"> <div class="progress" style="width: ${user.getSkills().getCssSkill()}%" ></div> </div>
        <div class="label">JS</div>
        <div class="bar"> <div class="progress" style="width: ${user.getSkills().getJsSkill()}%"></div> </div>
    </div>

    <div class="skills">
        <h3>Личностни</h3>
        <div class="label">Комуникативност</div>
        <div class="bar"> <div class="progress" style="width: ${user.getSkills().getCommSkill()}%">  </div> </div>
        <div class="label">Екипна работа</div>
        <div class="bar"> <div class="progress" style="width: ${user.getSkills().getTwSkill()}%">  </div> </div>
        <div class="label">Креативност</div>
        <div class="bar"> <div class="progress" style="width: ${user.getSkills().getCrSkill()}%">  </div> </div>
    </div>
</div>

<div class="sectionTitle" >
    <h2>Контакти</h2>
</div>
<div class="section">
    <div class="skills">
        <div class="label">Имейл</div>
        <div class="content"> <u>${user.getEmail()}</u></div>
        <div class="label">Телефон</div>
        <div class="content"> <u>${user.getPhone()}</u></div>
    </div>
    <div class="skills">
        <div class="label">Град</div>
        <div class="content"> <u>${user.getCity()}</u></div>
        <div class="label">Улица</div>
        <div class="content"> <u>${user.getStreet()}</u></div>
    </div>


</div>

</div>

<div class="footerProfil">
</div>
</body>

</html>
