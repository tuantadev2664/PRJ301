<%-- 
    Document   : welcome
    Created on : May 20, 2024, 3:16:31 AM
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
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
session.setAttribute("user",name);  
  
<a href="second.jsp">second jsp page</a>  
  
        %>  
    </body>
</html>
