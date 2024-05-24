<%-- 
    Document   : error
    Created on : May 16, 2024, 7:41:21 AM
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
        <%@ page isErrorPage="true" %>  

        <h3>Sorry an exception occured!</h3>  

        Exception is: <%= exception %>
    </body>
</html>
