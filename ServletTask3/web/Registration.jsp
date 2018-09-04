<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 28.08.2018
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="SetServlet" method="post">
      <table border="1">
        <tr>
          <td>Registration</td>
        </tr>
        <tr>
          <td>Login:</td>
          <td><input type="text" name="txbLogin"/></td>
        </tr>
        <tr>
          <td>Password:</td>
          <td><input type="text" name="txbPassword1"/></td>
        </tr>
        <tr>
          <td>Confirm password:</td>
          <td><input type="text" name="txbPassword2"/></td>
        </tr>
        <tr>
          <td><input type="submit" value="OK"/></td>
        </tr>
      </table>
    </form>
  </body>
</html>
