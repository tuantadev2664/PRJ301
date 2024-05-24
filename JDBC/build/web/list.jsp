<%-- 
    Document   : list
    Created on : May 23, 2024, 5:48:14 AM
    Author     : FPTSHOP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function doDelete(id){
                if(confirm("are u sure to delete category with id =" + id)){
                    window.location = "delete?id="+id;
                }
            }
        </script>
    </head>
    <body>
        <h1>List of categories</h1>
        <h3><a href="add.jsp">add new</a></h3>
        <div >
            <table border="1px" width="50%" >
                <tr>
                    <td>ID</td>
                    <td>Name</td>
                    <td>Description</td>
                    <th>Action</th>
                </tr>
                <c:forEach items = "${requestScope.data}" var="c">
                    <c:set var="id" value="${c.id}"/>
                    <tr>
                        <td>${id}</td>
                        <td>${c.name}</td>
                        <td>${c.describe}</td>
                        <td>
                            <a href="update?id=${id}">Update</a> &nbsp;&nbsp;&nbsp;
                            <a href="#" onclick="doDelete('${id}')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
