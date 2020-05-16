<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="MyUtils.InitializeLists" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/includes/header.inc" %>


<div id="container">
    <div id="main">


        <div class="row mt-5">

            <div class="col text-center">


                <c:if test="${requestScope.error!= null}">

                <div class="alert alert-danger" role="alert">
                    <h2 class="text-center">Der er opstået en fejl</h2>

                    <h6 class="text-center text-danger"> ${requestScope.error}</h6>

                    <row>
                        <a class="btn btn-primary btn-sm active" href="#" onclick="document.getElementById('id01').style.display='block'"
                           style="width:auto;">Opret bruger</a>
                        <a class="btn btn-primary btn-sm active" href="#" onclick="document.getElementById('id02').style.display='block'"
                           style="width:auto;">Login</a>
                    </row>

                    </c:if>
                </div>
            </div>


        </div>

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
</div>

<!--Test af branch-->
<%@include file="/includes/footer.inc" %>

