<%-- 
    Document   : second
    Created on : May 20, 2024, 3:35:41 AM
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
  
String name=(String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);  
out.print("Hello "+name);  
  
        %>  
    </body>
</html>
