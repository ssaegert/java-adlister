<%--
  Created by IntelliJ IDEA.
  User: scottsaegert
  Date: 3/28/18
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/guess" method="post">
    <label for="number">Enter a number between 1 and 100:<br></label>
    <input id="number" type="text" name="number" /><br>
    <input type="submit">

</form>
</body>
</html>
