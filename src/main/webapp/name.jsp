<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%--%>
    <%--String UserName = "World";--%>

    <%--if (request.getMethod().equalsIgnoreCase("post")) {--%>
        <%--UserName = request.getParameter("UserName");--%>
<%--//            response.sendRedirect("/surprise.jsp");--%>
        <%--response.getWriter().println("Hello, " + UserName);--%>
    <%--}--%>

    <%--session.setAttribute("UserName", UserName);--%>
<%--%>--%>


<html>
<head>
    <title>Welcome</title>
    <%--<style><jsp:include page="/css/style.css" /></style>--%>
    <%--<link rel="stylesheet" href="/css/style.css">--%>
    <%--<link rel="stylesheet" href="<jsp:include page="/css/style.css" />">--%>
</head>
<body>
<%--<jsp:include page="partials/navbar.jsp" />--%>

<form action="/name" method="post">
    <label for="name">Enter Your Name:<br></label>
        <input id="name" type="text" name="UserName" /><br>
        <input type="submit">

</form>

<div class="footer-bg">
    <footer>

    </footer>
</div>
</body>
</html>