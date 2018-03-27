<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (userName.equalsIgnoreCase("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>


<jsp:include page="partials/header-nav.jsp" />


<form method="post">
    <label for="user-name">User Name<br>
    <input id="user-name" type="text" name="userName" /><br>
    </label>
    <label for="password">Password<br>
    <input id="password" type="text" name="password" /><br>
    </label>
    <button type="submit">Submit</button>
</form>

<jsp:include page="partials/footer.jsp" />