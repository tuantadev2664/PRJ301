<%-- 
    Document   : welcome
    Created on : May 20, 2024, 5:49:19 PM
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
        <%
        if(request.getParameter("name")!=null){
            String name = request.getParameter("name");
        %>
        <h1> Hello <%= name %> </h2>
        <%
        }
        %>
    </body>
</html>
