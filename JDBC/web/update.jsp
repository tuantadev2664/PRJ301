<%-- 
    Document   : update
    Created on : May 23, 2024, 1:00:05 PM
    Author     : FPTSHOP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update a category</h1>
        <c:set var="category" value="${requestScope.category}"/>
            <form action="update" method="post">
            Enter ID: <input type="number" name="id" readonly value="${category.id}"><br/>
            Enter Name: <input type="text" name="name"><br/>
            Enter Describe: <input type="text" name="describe"><br/>
            <input type="submit" value="SAVE">
        </form>
    </body>
</html>
