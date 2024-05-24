<%-- 
    Document   : second.jsp
    Created on : May 20, 2024, 3:18:18 AM
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
  
String name=(String)session.getAttribute("user");  
out.print("Hello "+name);  
  
        %>  
    </body>
</html>
