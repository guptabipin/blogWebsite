

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>

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


        <main class="primary-bg banner-background" style="padding-bottom:75px;">

            <div class="container">

                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-header text-center primary-bg text-white">
                            <span class="fa fa-3x fa-user-circle-o"></span>
                            <br>
                            Register here
                        </div>
                        <div class="card-body">

                            <form id="RegForm" action="RegisterDB" method="post">


                                <div class="form-group">
                                    <label for="user_name">User name</label>
                                    <input type="text" name="UserName" class="form-control" id="user_name" aria-describedby="emailHelp" placeholder="Enter User name">
                                </div>

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" name="Email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                </div>


                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" name="Password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                </div>

                                <div class="form-group">
                                    <label for="gender">Select gender</label>
                                    <br>
                                    <input type="radio" id="gender" name="gen" value="Male"> Male&nbsp;&nbsp;
                                    <input type="radio" id="gender" name="gen" value="Female"> Female
                                </div>

                                <div class="form-check">
                                    <input type="checkbox" name="Check" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">agree terms and conditions</label>
                                </div>
                                <br>

                                <div class="container text-center" id="loader" style="display:none;">
                                    <span class="fa fa-refresh fa-spin fa-2x"></span>
                                    <h5>Please wait..</h5>
                                </div>
                                <button id="submit_btn" type="submit" class="btn btn-colour">Submit</button>
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
        <script src="javascript/myjs.js" type="text/javascript"></script>

        <!--for succefull regester -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>


        <!-- Ajax -->
        <script>
                    $(document).ready(function () {
            console.log("loaded...")

                    $('#RegForm').on('submit', function (event) {
            event.preventDefault();
                    let form = new FormData(this);
                    $("#submit_btn").hide();
                    $("#loader").show();
                    
                    //send register servelt
                    //ajax function
                    $.ajax({
                    url: "RegisterDB",
                            type: 'POST',
                            data: form,
                            success: function (data, textStatus, jqXHR) {
                            console.log(data)

                                    $("#submit_btn").show();
                                    $("#loader").hide();
                                    
                                    if(data.trim()==='done'){
                                    swal({
                                    title: "Register successfully",
                                            text: "You clicked the button!",
                                            icon: "success",
                                            button: "OK",
                                            
                                            });
                                        }
                                        else{
                                            swal(data);
                                        }
                                    },
                                            error: function (jqXHR, textStatus, errorThrown) {
                                            console.log(jqXHR)

                                                    $("#submit_btn").show();
                                                    $("#loader").hide();
                                                    swal("something went wrong ..try again");
                                            },
                                            processData: false,
                                            contentType: false
                                    })


                            })


                    })



        </script>



    </body>
</html>
