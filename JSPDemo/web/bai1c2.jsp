<%-- 
    Document   : bai1c2
    Created on : May 20, 2024, 4:32:41 AM
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
        <h1>Bai 1 C2: form jsp back end servlet(CalcServlet.java)</h1>
        <form action="calc">
            enter radius:<input type="text" name="radius"><br/>
            <input type = "submit" value="SUBMIT">
        </form>
        
        <%
            if(request.getAttribute("dt") != null){
                String s = (String)request.getAttribute("dt");
            
        %>
        <h2>Dien tich la:<%= s%> </h2>
        <%
            }
        %>
    </body>
</html>
