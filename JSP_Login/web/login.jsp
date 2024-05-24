<%-- 
    Document   : login
    Created on : May 20, 2024, 2:50:57 PM
    Author     : FPTSHOP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login form</h1>
        <%
            if(request.getAttribute("error")!= null){
                String error = (String)request.getAttribute("error");
        %>
        <h3 style="color: red "> <%= error %> </h3>
        <%
            }
        %>
        <form action="login" method="post">
            enter username:<input type="text" name="user"><br/>
            enter password:<input type="password" name="pass"><br/>
            <input type="submit" value="LOGIN"><br/>
        </form>
    </body>
</html>
