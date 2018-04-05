<%--
  Created by IntelliJ IDEA.
  User: scottsaegert
  Date: 4/4/18
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new Ad" />
    </jsp:include>
</head>
<body>
    <container>
        <h1>Register</h1>
        <form action="/ads/register" method="post">
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="email">eMail</label>
                <textarea id="email" name="email" class="form-control" type="text"></textarea>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <textarea id="password" name="password" class="form-control" type="text"></textarea>
            </div>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </container>
</body>
</html>
