<%-- 
    Document   : list
    Created on : May 20, 2024, 5:39:43 AM
    Author     : FPTSHOP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="model.Student" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Students</h1>
        <table border = "1px">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>DOB</th>
                <th>GENDER</th>
            </tr>
            <%
                List<Student> list = (List<Student>)request.getAttribute("data");
                for(Student student : list){
            %>
            <tr>
                <td><%= student.getId() %></td>
                <td><%= student.getName() %></td>
                <td><%= student.getDbo() %></td>
                <td>
                    <img <%= (student.isGender()?"src='images/male.jpg'":"src='images/female.webp'")%> style="width: 30px; height: 30px">
                   
                </td>
            </tr> 
            <%
                }
            %>
        </table>
    </body>
</html>
