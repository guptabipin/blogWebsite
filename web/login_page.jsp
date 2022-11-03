<%-- 
    Document   : login_page
    Created on : 3 Aug, 2022, 9:55:39 AM
    Author     : Bipin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>

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
        
        <!--navbar link -->
        <%@include file="normal_navbar.jsp" %>

        <main class="d-flex align-items-center primary-bg banner-background" style="height : 70vh">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 offset-md-4">

                        <div class="card">
                            <div class="card-header primary-bg text-white text-center">                              
                                <span class="fa fa-user-plus fa-2x"></span>
                                <p>Login here</p>
                            </div>
                            
                            <div class="card-body">
                                
                                <form action="UserDB.jsp" method="post"> 
                                    <div class="form-group">
                                        <label  for="exampleInputEmail1">Email address</label>
                                        <input type="email" name="t1" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label   for="exampleInputPassword1">Password</label>
                                        <input type="password" name="t2" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                    </div>
                                    
                                    <div class="container text-center">
                                    <button type="submit" class="btn btn-colour">Submit</button>
                                    </div>
                                    
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
        </main>


        <!--javascript -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="javascript/myjs.js" type="text/javascript">

        </script>
    </body>
</html>
