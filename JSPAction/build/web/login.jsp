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
            String userNameInit = getServletContext().getInitParameter("user");
            String passwordInit = getServletContext().getInitParameter("pass");
            if(request.getParameter("user")!= null && request.getParameter("pass")!= null){
                String userName = request.getParameter("user");
                String password = request.getParameter("pass");
                if(userName.equalsIgnoreCase(userNameInit) && password.equals(passwordInit)){
                    //nhap dung

        %>
                    <jsp:forward page="welcome.jsp">
                        <jsp:param name="name" value="<%= userName %>"/>
                    </jsp:forward>
        <%
                } else {
                   //nguoi dung nhap sai
                   String error = "Ban nhap sai, nhap lai!";
        %>
                   <h3 style="color: red "> <%= error %> </h3>
        <%
                }
            }
        %>
        <form>
            enter username:<input type="text" name="user"><br/>
            enter password:<input type="password" name="pass"><br/>
            <input type="submit" value="LOGIN"><br/>
        </form>
    </body>
</html>
