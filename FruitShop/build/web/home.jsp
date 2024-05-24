<%-- 
    Document   : home.jsp
    Created on : May 20, 2024, 2:02:46 PM
    Author     : FPTSHOP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fruit Shop</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div id="menu_tab">
            <%--@include file="menu.jsp" --%>
            <jsp:include page="menu.jsp"/>
        </div>
        <div class="clr"></div>
        
        <div class="banner">
            <%--@include file="banner.jsp" --%>
            <jsp:include page="banner.jsp"/>
        </div>
        <div class="clr"></div>
        
        <div class="content">
            <%--@include file="content.jsp" --%>
            <jsp:include page="content.jsp"/>
        </div>
        <div class="clr"></div>
        
        <div class="footer">
            <%--@include file="footer.jsp" --%>
            <jsp:include page="footer.jsp"/>
        </div>
        
        <!-- Bootstrap JS, Popper.js, and jQuery -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
