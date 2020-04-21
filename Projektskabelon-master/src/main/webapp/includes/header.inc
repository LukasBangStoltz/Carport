<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" type="text/css" href="css/style.css">

</head>

<body>

<div class="container-fluid">

    <div class="navbar navbar-expand-lg navbar-dark" style="background: linear-gradient(to right, #004687 30%, #0066ff 100%);">
        <a href="FrontController?target=redirect&destination=index">
            <img src="images/logo.png" height="80" alt="Logo fog "/>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarMainMenu">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarMainMenu">

            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="FrontController?target=redirect&destination=index">Home</a>
                </li>
                <li class="nav-item">
                <link rel="stylesheet" type="text/css" href="css/style.css">
 <a class="nav-link" href="#" onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Ny kunde</a>
                    <div id="id01" class="modal">

                        <form class="modal-content animate" action="FrontController" method="post">
                            <input type="hidden" name="target" value="loginuser"/>
                            <div class="imgcontainer">
                                <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
                                <img src="img_avatar2.png" alt="Opret en profil" class="avatar">
                            </div>

                            <div class="container">
                                <label for="email"><b>Email</b></label>
                                <input type="text" placeholder="Enter Username" id="email" name="email" required>

                                <label for="password"><b>Password</b></label>
                                <input type="password" placeholder="Enter Password" id="password" name="password" required>

                                <button type="submit">Login</button>
                                <label>
                                    <input type="checkbox" checked="checked" name="remember"> Remember me
                                </label>
                            </div>

                            <div class="container" style="background-color:#f1f1f1">
                                <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
                                <span class="psw">Forgot <a href="#">password?</a></span>
                            </div>
                        </form>
                    </div>

                    <script>
                        // Get the modal
                        var modal = document.getElementById('id01');

                        // When the user clicks anywhere outside of the modal, close it
                        window.onclick = function(event) {
                            if (event.target == modal) {
                                modal.style.display = "none";
                            }
                        }
                    </script>



                </li>
                <link rel="stylesheet" type="text/css" href="css/style.css">
                <li class="nav-item">
                    <a class="nav-link" href="#" onclick="document.getElementById('id02').style.display='block'" style="width:auto;">Login</a>
                    <div id="id02" class="modal">

                        <form class="modal-content animate" action="FrontController" method="post">
                            <input type="hidden" name="target" value="loginuser"/>
                            <div class="imgcontainer">
                                <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
                                <img src="img_avatar2.png" alt="Login" class="avatar">
                            </div>

                            <div class="container">
                                <label for="email"><b>Email</b></label>
                                <input type="text" placeholder="Enter Username" id="email" name="email" required>

                                <label for="password"><b>Password</b></label>
                                <input type="password" placeholder="Enter Password" id="password" name="password" required>

                                <button type="submit">Login</button>
                                <label>
                                    <input type="checkbox" checked="checked" name="remember"> Remember me
                                </label>
                            </div>

                            <div class="container" style="background-color:#f1f1f1">
                                <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>
                                <span class="psw">Forgot <a href="#">password?</a></span>
                            </div>
                        </form>
                    </div>

                    <script>
                        // Get the modal
                        var modal = document.getElementById('id02');

                        // When the user clicks anywhere outside of the modal, close it
                        window.onclick = function(event) {
                            if (event.target == modal) {
                                modal.style.display = "none";
                            }
                        }
                    </script>

                </li>
                <li class="nav-item">
                    <a href="FrontController?target=redirect&destination=kurvpage">
                        <img src="images\shoppingCart.png" height="35">
                    </a>
                </li>

            </ul>
        </div>
    </div>

