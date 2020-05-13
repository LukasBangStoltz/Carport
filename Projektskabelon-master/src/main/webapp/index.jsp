<%@ page import="MyUtils.InitializeLists" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/includes/header.inc" %>



<div class="container-fluid">


    <div class="jumbotron">
        <h1 class="text-center">Velkommen til Fog byggemarked</h1>
    </div>

    <div class="row">

        <div class="col-3"></div>

        <div class="col-6 my-5">

            <a href="FrontController?target=redirect&destination=carportchoice"> <img
                    src="images/fog_index_billede.jpg" class="img-fluid" style="width: 125%; height: 125%"
                    alt="Fog image"/></a>

        </div>



        <div class="col-3"></div>

    </div>
</div>

<br>

<!--Test af branch-->
<%@include file="/includes/footer.inc" %>

