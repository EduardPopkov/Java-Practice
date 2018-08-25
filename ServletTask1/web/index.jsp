<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 25.08.2018
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- генерация таблиц по переданным параметрам: заголовок, количество строк и столбцов, цвет фона -->
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="TestServlet" method="get">

      <table border="2">
        <tr>
          <td>Enter a title</td>
          <td><input type="text" name="title"/></td>
        </tr>
        <tr>
          <td>Enter the number of rows</td>
          <td><input type="text" name="row"/></td>
        </tr>
        <tr>
          <td>Enter the number of colums</td>
          <td><input type="text" name="column"/></td>
        </tr>
        <tr>
          <td>Enter the background</td>
          <td><input type="text" name="bgcolor"/></td>
        </tr>
      </table>

      <input type="submit" value="Generate"/>
    </form>
  </body>
</html>
