<%-- 
    Document   : home
    Created on : May 16, 2024, 7:09:42 AM
    Author     : FPTSHOP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Example for JSP</h1>
        <h2 style="color:chocolate">
        <% 
            String name =  "Trong anh tuan";
            out.println("Hello: " + name + '!');
            out.println("<br/>PI: " + Math.PI);
            double r = 2;
            DecimalFormat f = new DecimalFormat("##.##");
            //đay la chu thich cua java tren 1 dong
        %>
        <!--day la chu thich cua htlm-->
        </h2>
        <h2 style="color: blue"> 
            so PI ver 2: <%= Math.PI%> <br/>
            square : <%= f.format(Math.PI * r * r) %>
        </h2>
        
        <h1>Bai 1 C1: form + backend use jsp</h1>
        <form>
            enter radius:<input type="text" name="radius"><br/>
            <input type = "submit" value="SUBMIT">
        </form>
        <%
            if(request.getParameter("radius") != null){
            String radius_raw = request.getParameter("radius");
            double radius;
            try{
                radius = Double.parseDouble(radius_raw);
                double s = radius * radius * Math.PI;
        %>
        <h2>Dien tich la:<%= f.format(s)%> </h2>
        <%
            }catch(Exception e){
                System.out.println(e);
            }
            }
        %>
    </body>
</html>
