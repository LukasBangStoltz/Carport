<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
         <!DOCTYPE html>
         <html lang="en">
         <head>


             <link rel="stylesheet" type="text/css" href="css/style.css">
             <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
                   integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
             <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

             <script>
                 // Get the modal
                 var modal = document.getElementById('id02');

                 // When the user clicks anywhere outside of the modal, close it
                 window.onclick = function (event) {
                     if (event.target == modal) {
                         modal.style.display = "none";
                     }
                 }
             </script>
             <script>
                 // Get the modal
                 var modal = document.getElementById('id01');

                 // When the user clicks anywhere outside of the modal, close it
                 window.onclick = function (event) {
                     if (event.target == modal) {
                         modal.style.display = "none";
                     }
                 }
             </script>
         </head>

         <body>


         <div class="navbar navbar-expand-lg navbar-dark"
              style="background: linear-gradient(to right, #004687 30%, #0066ff 100%);">
             <a href="FrontController?target=redirect&destination=index">
                 <img src="images/logo.png" height="80" alt="Logo fog "/>
             </a>
             <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarMainMenu">
                 <span class="navbar-toggler-icon"></span>
             </button>

             <div class="collapse navbar-collapse" id="navbarMainMenu">

                 <ul class="navbar-nav ml-auto">
                     <li class="nav-item">
                         <a class="nav-link" href="FrontController?target=redirect&destination=index">Forside</a>
                     </li>
                     <li class="nav-item">
                         <link rel="stylesheet" type="text/css" href="css/style.css">

                         <c:if test="${sessionScope.email != null}">


                             <a class="nav-link" href="FrontController?target=logout">Log ud</a>
                         </c:if>


                         <c:if test="${sessionScope.email == null}">

                             <a class="nav-link" href="#" onclick="document.getElementById('id01').style.display='block'"
                                style="width:auto;">Ny kunde</a>
                             <div id="id01" class="modal">

                                 <form class="modal-content animate" action="FrontController" method="post">
                                     <input type="hidden" name="target" value="register"/>
                                     <div class="imgcontainer">
                                                       <span onclick="document.getElementById('id01').style.display='none'"
                                                             class="close"
                                                             title="Close Modal">&times;</span>
                                     </div>

                                     <div class="container">
                                         <label for="email"><b>Email</b></label>
                                         <input type="text" placeholder="Indtast email" id="email" name="email" required>

                                         <label for="passwordregister1"><b>Password</b></label>
                                         <input type="password" placeholder="Indtast password" id="passwordregister1"
                                                name="password1"
                                                required>

                                         <label for="passwordregister2"><b>Gentag Password</b></label>
                                         <input type="password" placeholder="Gentag Password" id="passwordregister2"
                                                name="password2"
                                                required>

                                         <label for="name"><b>Navn</b></label>
                                         <input type="text" placeholder="Indtast navn" id="name" name="name"
                                                required>

                                         <label for="adress"><b>Adresse</b></label>
                                         <input type="text" placeholder="Indtast adresse" id="adress" name="adress"
                                                required>

                                         <label for="city"><b>By</b></label>
                                         <input type="text" placeholder="Indtast by" id="city" name="city"
                                                required>

                                         <label for="phoneNumber"><b>Telefonnummer</b></label>
                                         <input type="text" placeholder="Indtast telefonnummer" id="phoneNumber"
                                                name="phoneNumber"
                                                required>


                                         <button type="submit">Opret</button>
                                         <label>
                                             <input type="checkbox" checked="checked" name="remember"> Remember me
                                         </label>
                                     </div>

                                     <div class="container" style="background-color:#f1f1f1">
                                         <button type="button" onclick="document.getElementById('id01').style.display='none'"
                                                 class="cancelbtn">Cancel
                                         </button>
                                         <span class="psw">Forgot <a href="#">password?</a></span>
                                     </div>
                                 </form>


                             </div>

                         </c:if>


                     </li>
                     <link rel="stylesheet" type="text/css" href="css/style.css">
                     <li class="nav-item">


                         <c:if test="${sessionScope.email == null}">
                             <a class="nav-link" href="#" onclick="document.getElementById('id02').style.display='block'"
                                style="width:auto;">Login</a>
                             <div id="id02" class="modal">

                                 <form class="modal-content animate" action="FrontController" method="post">
                                     <input type="hidden" name="target" value="login"/>
                                     <div class="imgcontainer">
                                                       <span onclick="document.getElementById('id02').style.display='none'"
                                                             class="close"
                                                             title="Close Modal">&times;</span>
                                     </div>

                                     <div class="container">
                                         <label for="email1"><b>Email</b></label>
                                         <input type="text" placeholder="Enter Username" id="email1" name="email" required>

                                         <label for="passwordlogin"><b>Password</b></label>
                                         <input type="password" placeholder="Enter Password" id="passwordlogin"
                                                name="password"
                                                required>

                                         <button type="submit">Login</button>
                                         <label>
                                             <input type="checkbox" checked="checked" name="remember"> Remember me
                                         </label>
                                     </div>

                                     <div class="container" style="background-color:#f1f1f1">
                                         <button type="button" onclick="document.getElementById('id02').style.display='none'"
                                                 class="cancelbtn">Cancel
                                         </button>
                                         <span class="psw">Forgot <a href="#">password?</a></span>
                                     </div>
                                 </form>


                             </div>
                         </c:if>

                     </li>

                     <li class="nav-item">

                     <c:if test="${sessionScope.email != null}">


                       <a class="nav-link" href="#" style="width:auto">Mine forespørgsler</a>

                        </c:if>

                     </li>

                     <li class="nav-item">


                          <c:if test="${sessionScope.email != null}">

                          <a class="nav-link" href="#" style="width:auto"> ${sessionScope.email}</a>

                          </c:if>
                     </li>

                 </ul>
             </div>
         </div>