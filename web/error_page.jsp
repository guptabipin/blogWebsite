<%-- 
    Document   : error_page
    Created on : 6 Aug, 2022, 5:45:14 PM
    Author     : Bipin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry ! something went wrong</title>
        
        <!-- CSS only bootstrap -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <!--CSS page link-->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

        <!--fonts icons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


        <style>
            .banner-background{
                clip-path: polygon(50% 0%, 100% 0, 100% 88%, 65% 100%, 24% 90%, 0 100%, 0 0);

            }
        </style>
    </head>
    <body>

        <div class="container text-center ">
            <img src="images/computer.png" class="img-fluid img">
            <h3 class="display-4">Sorry ! Something went wrong...</h3>
            <h4> <%= exception %></h4><br>
             <a href="index.jsp" class="btn primary-bg btn-lg text-white mt-4">
                Home
               </a>
        </div>
    </body>
</html>
