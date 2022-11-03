
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entites.category"%>
<%@page import="com.tech.blog.entites.posts"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.techno.dairy.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.entites.userdata"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jsp pages</title>
        <!-- CSS only bootstrap -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <!--CSS page link-->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

        <!--fonts icons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <!-- icon for blog -->
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>


        <style>
            .banner-background{
                clip-path: polygon(50% 0%, 100% 0, 100% 88%, 65% 100%, 24% 90%, 0 100%, 0 0);

            }
            .post-title{
                font-weight: 100;
                font-size: 28px;
            }
            .post-content{
                font-weight: 100;
                font-size: 25px;
            }
            .post-date{
                font-style: italic;
                font-weight: bold;
            }
            .post-userinfo{
                font-size: 20px;
               
            }
            .img-pro{
                width: 23vw;
                position: relative;
                left: 150px;
               
            }
        </style>
    </head>
    <body>

        <%
            userdata userdata = (userdata) session.getAttribute("CurrentUser");
            if (userdata == null) {
                response.sendRedirect("login_page.jsp");
            }

        %>

        <%            int postId = Integer.parseInt(request.getParameter("post_id"));
            PostDao dp = new PostDao(ConnectionProvider.getConnection());

            posts p = dp.getPostByPostId(postId);

        %>

        <!--nav bar -->

        <nav class="navbar navbar-expand-lg navbar-dark primary-bg">
            <a class="navbar-brand" href="index.jsp">  <span class='fab fa-blogger-b'></span>Techno Diary</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="Profile.jsp">  <span class="fa fa-bell"></span> LearnCode with  <span class="sr-only">(current)</span></a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="fa fa-check-square-o"></span> Categories
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Programming Language</a>
                            <a class="dropdown-item" href="#">Project Implementation</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Data Structure</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><span class="fa fa-address-book-o"></span> Contact Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" data-toggle="modal" data-target="#add-post-modal"><span class="fa fa-asterisk"></span> Do Post</a>
                    </li>
                </ul>

                <ul class="navbar-nav ar-right">
                    <li class="nav-item">
                        <a class="nav-link" href="#!" data-toggle="modal" data-target="#ProfileModal"><span class="fa fa-user-circle"></span> <%=userdata.getName()%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Logout.jsp"><span class="fa fa-user-plus"></span> Logout</a>
                    </li>
                </ul>

            </div>
        </nav>
        <!--end navbar -->


        <!--Profile modol -->

        <!-- Modal -->
        <div class="modal fade" id="ProfileModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header primary-bg text-white">
                        <h5 class="modal-title" id="exampleModalLabel">TechBlog</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">
                        <div class="container text-center">
                            <img src="pics/" class="img-fluid" style="border-radius:50%;max-width: 200px;">
                            <h5 class="modal-title" id="exampleModalLabel"><%=userdata.getName()%></h5>

                            <!--details-->
                            <table class="table">
                                <tbody>
                                    <tr>

                                        <th scope="row">Email : </th>
                                        <td><%=userdata.getEmail()%></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Gender : </th>
                                        <td><%=userdata.getGender()%></td>

                                    </tr>
                                    <tr>
                                        <th scope="row">password : </th>
                                        <td><%=userdata.getPassword()%></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Registered Date : </th>
                                        <td><%=userdata.getDate()%></td>
                                    </tr>


                                </tbody>
                            </table>

                        </div>
                    </div>

                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div> 
        </div>

        <!-- end of profile model -->


        <!--main contain of body -->

        <div class="container">
            <div class="row my-4">

                <div class="col-md-8 offset-md-2">

                    <div class="card">

                        <div class="card-header primary-bg text-white">
                            <h4 class="post-title"><%=p.getpTitle()%></h4>
                        </div>

                        <div class="card-body">
                            <img class="card-img-top my-2 img-pro" src="blog_pics/<%=p.getpPic()%>" alt="Card image cap"> 
                            
                            <div class="row my-3">
                                <div class="col-md-8">
                                    <p class="post-userinfo"><a href="#" >Bipin Gupta</a> has posted :</p>
                                </div>
                                
                                <div class="col-md-4">
                                    <p class="post-date"><%=p.getpDate()%></p>
                                </div>
                            </div>

                            <p class="post-content"><%=p.getpContent()%></p>
                            <br>
                            <br>

                            <div class="post-code">
                                <pre><%= p.getpCode()%></pre>
                            </div>

                        </div>

                        <div class="card-footer primary-bg">

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!--end of body -->


    </body>
</html>
