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
    <link href="profil.css" rel="stylesheet">
    <meta charset="UTF-8" />
</head>

<body class="mainBody">
<div class="navProfil">
</div>

<div class="info">
    <div class="section1">
        <div class="picDiv">
            <img class="pic" src="./res/img/woman.svg" />
        </div>
        <div class="basicInfo">
            <h2>Профилна инфромация</h2>
            <div class="basicContent" >
                Име: ${user.getName()}
            </div>
            <div class="basicContent" >
                Работа: Студент
            </div>
            <div class="basicContent" >
                Описание:
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
            <div class="bar"> <div class="progress" style="width: 73%;"></div> </div>
            <div class="label">HTML</div>
            <div class="bar"> <div class="progress" style="width: 80%;">  </div> </div>
            <div class="label">CSS</div>
            <div class="bar"> <div class="progress" style="width: 67%;">  </div> </div>
            <div class="label">JS</div>
            <div class="bar"> <div class="progress">  </div> </div>
        </div>

        <div class="skills">
            <h3>Личностни</h3>
            <div class="label">Комуникативност</div>
            <div class="bar"> <div class="progress" style="width: 23%;">  </div> </div>
            <div class="label">Екипна работа</div>
            <div class="bar"> <div class="progress" style="width: 58%;">  </div> </div>
            <div class="label">Креативност</div>
            <div class="bar"> <div class="progress" style="width: 93%;">  </div> </div>
        </div>
    </div>

    <div class="sectionTitle" >
        <h2>Контакти</h2>
    </div>
    <div class="section">
        <div class="skills">
            <div class="label">Имейл</div>
            <div class="content"><u> ${user.getEmail()}</u></div>
            <div class="label">Телефон</div>
            <div class="content"> <u> 0123456789 </u></div>
        </div>
        <div class="skills">
            <div class="label">Град</div>
            <div class="content"> Варна </div>
            <div class="label">Улица</div>
            <div class="content">Вяра</div>
        </div>


    </div>

</div>

<div class="footerProfil">
</div>
</body>

</html>
