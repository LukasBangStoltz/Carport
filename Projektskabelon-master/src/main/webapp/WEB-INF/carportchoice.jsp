<%@ page import="MyUtils.InitializeLists" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc" %>
<%@include file="../includes/initializearraylister.inc" %>

<div id="container">
    <div id="main">


        <div class="jumbotron text-center my-3">
            <h1 style="color: dimgray; font-family: sans-serif; font-weight: bold">Vælg hvilken carport du gerne vil
                designe</h1>
        </div>


        <div class="row text-center mb-2">
            <div class="col"></div>
            <div class="col mb-5">
                <h3 class="mb-3" style="color: dimgray; font-family: sans-serif; font-weight: bold">Carport med
                    rejsning</h3>
                <a href="FrontController?target=redirect&destination=carporttilt">
                    <img src="images/fog_carport_med_rejsning.jpg">
                </a>
            </div>
            <div class="col mb-5">
                <h3 class="mb-3" style="color: dimgray; font-family: sans-serif; font-weight: bold">Carport med fladt
                    tag</h3>
                <a href="FrontController?target=redirect&destination=carportflat">
                    <img src="images/fog_carport_fladt_tag.jpg">
                </a>
            </div>
            <div class="col"></div>
        </div>

        <div class="row mb-5">
            <div class="card mx-auto" style="width: 40rem;">
                <div class="card-body">
                    <h5 color: dimgray; font-family: sans-serif; font-weight: bold>
                        QUICK-BYG TILBUD - CARPORT MED FLADT TAG ELLER MED HÆLDNING
                        Med et specialudviklet computerprogram kan vi lynhurtigt beregne prisen og udskrive en
                        skitsetegning
                        på en carport indenfor vores standardprogram, der tilpasses dine specifikke ønsker.

                        Tilbud og skitsetegning fremsendes med post hurtigst muligt.
                        Ved bestilling medfølger standardbyggevejledning.


                    </h5>
                </div>


            </div>

        </div>


        <div class="row">

            <div class="col text-center">

                <c:if test="${requestScope.error!= null}">

                <div class="alert alert-danger" role="alert">
                    <h2 class="text-center">Der er opstået en fejl</h2>

                    <h6 class="text-center text-danger"> ${requestScope.error}</h6>

                    </c:if>
                </div>
            </div>


        </div>
    </div>


    <%@include file="../includes/footer.inc" %>
