<%-- 
    Document   : index
    Created on : Aug 22, 2017, 2:01:06 PM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.inc"%>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
      integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/style.css">

<head>
<body>

<div class="container-fluid">

    <div class="jumbotron text-center">
        <h1 style="color: dimgray; font-family: sans-serif; font-weight: bold">Velkommen til Fog byggemarked</h1>
    </div>

    <div class="upcon">
        <a href="FrontController?target=redirect&destination=carportvalgpage"> <img src="images/fog_index_billede.jpg" class="img-fluid" style="width: 100%; height: auto"
                                                     alt="Fog image"/></a>
    </div>

</div>
</body>
</head>
        <h1>Welcome to Sem 2</h1>
        
        <table>
            <tr><td>Login</td>
                <td>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="target" value="login">
                        Email:<br>
                        <input type="text" name="email" value="someone@nowhere.com">
                        <br>
                        Password:<br>
                        <input type="password" name="password" value="sesam">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
                <td>Or Register</td>
                <td>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="target" value="register">
                        Email:<br>
                        <input type="text" name="email" value="someone@nowhere.com">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="sesam">
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" value="sesam">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
            </tr>
        </table>

        <c:if test = "${requestScope.error!= null}" >
           <h2>Error ! </h2>
            ${requestScope.error}
        </c:if>

<%@include file="includes/footer.inc"%>
