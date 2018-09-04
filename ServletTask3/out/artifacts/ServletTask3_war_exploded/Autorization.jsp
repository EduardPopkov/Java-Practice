<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 28.08.2018
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>

<!-- на основе сервлетов разработать механизм аутентификации и авторизации пользователя.
Сервлет должен сгенерировать приветствие с указанием имени, роли пользователя, а также указать текущую дату и IP-адрес компьютера пользователя. -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="GetServlet" method="get">
        <table border="1">
            <tr>
                <td>Autorization</td>
            </tr>
            <tr>
                <td>Login:</td>
                <td><input type="text" name="txbLogin"/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="text" name="txbPassword"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Get"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
