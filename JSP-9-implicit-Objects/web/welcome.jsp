<%-- 
    Document   : welcome
    Created on : May 16, 2024, 7:54:06 AM
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
 out.print("Welcome "+request.getParameter("uname"));  
  
 String driver=config.getInitParameter("dname");  
 out.print("driver name is="+driver);  
        %>  
    </body>
</html>
