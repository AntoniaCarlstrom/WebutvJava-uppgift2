<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Inloggning</title>
</head>
<body>
<h1>Login</h1>
<br>

<form action="loginServlet" method="post">
    <p>
        Username:
        <input type="text" name="un" />
    </p>
    <p>
        Password:
        <input type="text" name="pw" />
    </p>
    <p>
        <input type="submit" value="login">
    </p>



</form>

</body>
</html>