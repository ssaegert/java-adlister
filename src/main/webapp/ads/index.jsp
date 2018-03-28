<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: scottsaegert
  Date: 3/28/18
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ads</h1>
<Ul>

    <c:forEach items="${allAds}" var="ad">
        <td>
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <br>
        </td>
    </c:forEach>


</Ul>
</body>
</html>
