<%-- 
    Document   : UserDB
    Created on : 6 Aug, 2022, 6:49:52 PM
    Author     : Bipin
--%>

<%@page import="com.tech.blog.entites.userdata"%>
<%@page import="com.techno.dairy.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

         <%
             //fect username and password from database
        try{           	 
        	String UserEmail=request.getParameter("t1");
        	String Userpassword=request.getParameter("t2");
                
                UserDao dao = new UserDao(ConnectionProvider.getConnection());
                
                userdata ud=dao.getUserByEmailAndPassword(UserEmail, Userpassword);
                
                if(ud==null)
                {
                  //error message  
                    out.println("Invalid Details..try Again!!");
                }
                else{
                    //Login successfull
                    
                    //use session 
                    
                    session.setAttribute("CurrentUser", ud);
                    response.sendRedirect("Profile.jsp");
                }
               
        	
    	}
    	catch(Exception e)
    	{
        	out.println(e);
    	}
        	%>
    </body>
</html>
