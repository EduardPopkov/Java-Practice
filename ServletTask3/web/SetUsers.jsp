<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 25.08.2018
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- на основе сервлетов разработать механизм аутентификации и авторизации пользователя.
Сервлет должен сгенерировать приветствие с указанием имени, роли пользователя, а также указать текущую дату и IP-адрес компьютера пользователя. -->
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="SetServlet" method="post">

      <table border="2">
        <tr>
          <td>Регистрация</td>
        </tr>
        <tr>
          <td>Логин:</td>
          <td><input type="text" name="login"/></td>
        </tr>
        <tr>
          <td>Пароль:</td>
          <td><input type="text" name="password"/></td>
        </tr>
      </table>

    </form>
  </body>
</html>
