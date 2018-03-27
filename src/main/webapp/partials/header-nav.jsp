<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: scottsaegert
  Date: 3/27/18
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <%--<style><jsp:include page="/css/style.css" /></style>--%>
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <%--<link rel="stylesheet" href="/css/style.css">--%>
    <%--<link rel="stylesheet" href="<jsp:include page="/css/style.css" />">--%>
</head>
<body>
<div class="main-nav">
    <nav>
    <ul>
        <li><a href="${pageContext.request.contextPath}/index.jsp">HOME</a></li>
        <li><a href="${pageContext.request.contextPath}/login.jsp">LOGIN</a></li>
        <li><a href="${pageContext.request.contextPath}/profile.jsp">PROFILE</a></li>
    </ul>
    </nav>
</div>
