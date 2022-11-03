<%-- 
    Document   : Logout
    Created on : 8 Aug, 2022, 5:29:20 PM
    Author     : Bipin
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
            
           // session.removeAttribute("values");
           
            response.sendRedirect("login_page.jsp");
        
        %>
    </body>
</html>
