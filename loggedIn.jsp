
<%--
  Created by IntelliJ IDEA.
  User: New user
  Date: 2022-12-09
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Logged in</title>
</head>
<body>

<%
    if (session.getAttribute("isLoggedIn") != null) {
        out.print("<h1>Well done, you managed to log in!!!</h1>");
        out.print("<form action=\"/LogoutServlet\" method=\"POST\">");
        out.print("<input type=\"submit\" value=\"Log out\" />");
        out.print("</form>");

    } else {
        out.print("<h1>Not logged in!!</h1>");
        response.sendRedirect("index.jsp");
    }
%>

</body>
</html>
