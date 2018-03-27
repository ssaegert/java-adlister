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
    <style>
        .main-nav {
            clear: both;
            width: 100%;
            height: 3em;
        }
        .main-nav ul{
            list-style: none;
            float: left;
            padding: 0;
            margin: 0;
        }
        .main-nav li{
            float: left;
            padding-left: 1em;
            padding-right: 1em;
            align-content: center;
            text-align: center;
            vertical-align: middle;
            border-right: #666 solid .05em;
            font-size: 2em;
            font-family: Avenir;
        }
        .main-nav li:last-child {
            border-right: 0;
        }
        .main-nav li a {
            text-decoration: none;
        }

    </style>
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
