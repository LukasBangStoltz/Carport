<%@ page import="MyUtils.Initializer" %><%--
  Created by IntelliJ IDEA.
  User: Bruger
  Date: 20-04-2020
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../includes/header.inc"%>

    <div class="container-fluid">

        <%
            if (request.getServletContext().getAttribute("widthList") == null) {
                request.getServletContext().setAttribute("widthList", Initializer.getCarportWidthList());
            }
            if (request.getServletContext().getAttribute("lengthList") == null) {
                request.getServletContext().setAttribute("lengthList", Initializer.getCarportLengthList());
            }
            if (request.getServletContext().getAttribute("flatrooftypelist") == null) {
                request.getServletContext().setAttribute("flatrooftypelist", Initializer.getFlatRoofTypes());
            }

        %>

        <div class="jumbotron text-center my-3">
            <h1 style="color: dimgray; font-family: sans-serif; font-weight: bold">Vælg hvilken carport du gerne vil
                designe</h1>
        </div>

        <div class="row text-center mb-2">
            <div class="col"></div>
            <div class="col mb-5">
                <h3 class="mb-3" style="color: dimgray; font-family: sans-serif; font-weight: bold">Carport med rejsning</h3>
                <a href="FrontController?target=redirect&destination=carportmedrejsning">
                    <img src="images/fog_carport_med_rejsning.jpg">
                </a>
            </div>
            <div class="col mb-5">
                <h3 class="mb-3" style="color: dimgray; font-family: sans-serif; font-weight: bold">Carport med fladt tag</h3>
                <a href="FrontController?target=redirect&destination=carportmedfladttag">
                    <img src="images/fog_carport_fladt_tag.jpg">
                </a>
            </div>
            <div class="col"></div>
        </div>

        <div class="row mb-5">
            <div class="card mx-auto" style="width: 40rem;">
                <div class="card-body">
                    <h5 color: dimgray; font-family: sans-serif; font-weight: bold>
                        QUICK-BYG TILBUD - CARPORT MED FLADT TAG
                        Med et specialudviklet computerprogram kan vi lynhurtigt beregne prisen og udskrive en
                        skitsetegning
                        på en carport indenfor vores standardprogram, der tilpasses dine specifikke ønsker.

                        Tilbud og skitsetegning fremsendes med post hurtigst muligt.
                        Ved bestilling medfølger standardbyggevejledning.

                        Udfyld nedenstående omhyggeligt og klik på "Bestil tilbud"
                        Felter markeret * SKAL udfyldes!
                    </h5>
                </div>
                </div>
            </div>
        </div>




<%@include file="../includes/footer.inc"%>
