<%-- 
    Document   : add
    Created on : May 23, 2024, 6:56:20 AM
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
        <h1>Add new a category</h1>
        <h3 style="color: red "> ${requestScope.error} </h3>
        <form action="add">
            Enter ID: <input type="number" name="id"><br/>
            Enter Name: <input type="text" name="name"><br/>
            Enter Describe: <input type="text" name="describe"><br/>
            <input type="submit" value="SAVE">
        </form>
    </body>
</html>
