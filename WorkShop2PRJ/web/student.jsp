<%-- 
    Document   : student
    Created on : May 21, 2024, 9:13:13 AM
    Author     : FPTSHOP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="model.Student" %>
<%@page import="java.util.Date, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="student" method="post">
            <table boder="1px">
                <tr>
                    <th>Number of Students</th>
                    <th><input type="text" name="num" ></th>
                    <th><input type="submit" value="generate"></th>
                </tr>
                <tr>
                </tr>
            </table>
        </form>
<!--        <form action="student.jsp">
            <tr>
                    <th><input type="submit" Value="RESET"></th>
            </tr>
        </form>-->
        <% if((List<Student>)request.getAttribute("data") != null){
        %>
         <table border="1px">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>GENDER</th>
                <th>DOB</th>
                <th>   </th>
            </tr>
            <%
                List<Student> list = (List<Student>)request.getAttribute("data");
                for(Student student : list){
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String date = dateFormat.format(student.getDob());
            %>
            <tr>
                <td><%= student.getId() %></td>
                <td><%= student.getName() %></td>
                <td>
                    <% if(student.getGender()){
                    %>
                    <input type="checkbox" checked>
                    <%
                        }else{
                    %>
                    <input type="checkbox">
                    <%
                        }  
                    %>
                </td>
                <td><%= date %></td>
                <td><a href=<%= "student?id=" + student.getId() %> >UPDATE</a></td>
            </tr> 
            <%
                }
            %>
        </table>
        <%
            }
        %>
        
    </body>
</html>
