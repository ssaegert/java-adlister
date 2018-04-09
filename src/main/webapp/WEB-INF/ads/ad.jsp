<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: scottsaegert
  Date: 4/5/18
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="ad" items="${ads}">
    <div class="col-md-6">
        <h2><c:out value = "${ad.title}" /></h2>
        <p><c:out value = "${ad.description}" /></p>
        <form action="/ads/ad" method="post">
            <input type="hidden" name="id" value="${ad.id}" >
            <button type="submit">View Full Ad</button>
        </form>
    </div>
</c:forEach>
</body>
</html>
