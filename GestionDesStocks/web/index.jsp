<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 02-06-20
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
        <h1>Identifiez-vous afin d'accéder à la page 1</h1>

 <form action="src/login" method="post">
    <p>Nom: <input name="nom" type="text"> </p>
    <p>Password: <input name="passw" type="password"></p>
    <input type="submit" value="valider">
 </form>
  </body>
</html>
