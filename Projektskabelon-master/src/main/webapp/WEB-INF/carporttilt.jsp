<%@ page import="MyUtils.InitializeLists" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc" %>


<div id="container">
    <div id="main">


        <div class="row mt-5">

            <div class="col text-center">

                <c:if test="${requestScope.error!= null}">

                <div class="alert alert-danger" role="alert">
                    <h2 class="text-center">Der er opstået en fejl</h2>

                    <h6 class="text-center text-danger"> ${requestScope.error}</h6>

                    </c:if>
                </div>
            </div>


        </div>


        <div class="row">

            <div class="col-1"></div>


            <div class="col-8">


                <div class="jumbotron">


                    <div class="col-md-10">

                        <h1 class=" mb-5">Carport med rejsning</h1>


                        <div class="mb-2">

                            <b>QUICK-BYG TILBUD - CARPORT MED HÆLDNING </b>

                        </div>

                        <div class="mb-2">
                            <b>
                                Med et specialudviklet computerprogram kan vi lynhurtigt beregne prisen og udskrive en
                                skitsetegning på en carport indenfor vores standardprogram, der tilpasses dine
                                specifikke
                                ønsker.
                            </b>
                        </div>
                        <div class="mb-2">
                            <b>
                                Tilbud og skitsetegning fremsendes med post hurtigst muligt.<br>
                                Ved bestilling medfølger standardbyggevejledning.
                            </b>
                        </div>
                        <div class="mb-2">
                            <b>
                                Udfyld nedenstående omhyggeligt og klik på "Bestil tilbud"
                            </b>
                        </div>

                        <div class="mb-4">
                            <b> Felter markeret * SKAL udfyldes! </b>

                        </div>


                        <div class="mb-4">

                            <p> Ønsket carport mål: </p>

                        </div>

                    </div>


                    <form action="FrontController" method="post">
                        <input type="hidden" name="target" value="makerequest">
                        <input type="hidden" name="raisedroof" value="carportwithtilt">
                        <input type="hidden" name="carporttype" value="raisedroof">

                        <div class="form-group col-md-7">
                            <label for="carportlength"><p>Carport længde </p></label>
                            <select class="form-control" name="carportlength" id="carportlength">
                                <c:forEach var="length" items="${applicationScope.lengthList}">

                                    <option value="${length.length_id}">${length.length_cm}</option>

                                </c:forEach>


                            </select>
                        </div>


                        <div class="form-group col-md-7 mt-2">
                            <label for="carportwidth"><p>Carport bredde</p></label>
                            <select class="form-control" name="carportwidth" id="carportwidth">

                                <c:forEach var="width" items="${applicationScope.widthList}">
                                    <option value="${width.width_id}">${width.width_cm}</option>
                                </c:forEach>


                            </select>
                        </div>

                        <div class="form-group col-md-7 mt-2">
                            <label for="rooftype"><p>Tag </p></label>
                            <select class="form-control" name="rooftype" id="rooftype">

                                <c:forEach var="raisedRoof" items="${applicationScope.raisedrooftypelist}">
                                    <option value="${raisedRoof.roof_id}">${raisedRoof.name} </option>
                                </c:forEach>

                            </select>
                        </div>

                        <div class="form-group col-md-7 mt-2">
                            <label for="roofdegree"><p>Taghældning </p></label>
                            <select class="form-control" name="roofdegree" id="roofdegree">
                                a
                                <c:forEach var="roofdegree" items="${applicationScope.raisedroofdegreelist}">

                                    <option value="${roofdegree.roofTilt_id}">${roofdegree.roofTilt_degree} grader
                                    </option>

                                </c:forEach>


                            </select>
                        </div>

                        <div class="col-md-7">

                            <p> Redskabsrum: </p>

                            <small id="redskabshelp" class="form-text text-muted"> NB! Der skal beregnes 15 cm tagudhæng
                                på
                                hver
                                side af redskabsrummet </small>

                        </div>

                        <div class="form-group col-md-7 mt-2">
                            <label for="toolshedlength"><p>Redskabsrum længde </p></label>
                            <select class="form-control" name="toolshedlength" id="toolshedlength">

                                <option value="0">jeg ønsker ikke redskabsrum</option>

                                <c:forEach var="toolshedlength" items="${applicationScope.toolshedlengthslist}">

                                    <option value="${toolshedlength.toolShed_id}">${toolshedlength.toolShed_cm}</option>

                                </c:forEach>

                            </select>
                        </div>

                        <div class="form-group col-md-7 mt-2">
                            <label for="toolshedwidth"><p>Redskabsrums bredde </p></label>
                            <select class="form-control" name="toolshedwidth" id="toolshedwidth">

                                <option value="0">jeg ønsker ikke redskabsrum</option>

                                <c:forEach var="toolshedwidth" items="${applicationScope.toolshedwidthslist}">

                                    <option value="${toolshedwidth.toolShedWidth_id}">${toolshedwidth.toolShedWidth_cm}</option>

                                </c:forEach>

                            </select>
                        </div>

                        <div class="form-group green-border-focus col-md-7">
                            <label for="comments"><p>Evt. bemærkninger</p></label>
                            <textarea class="form-control" name="comments" id="comments" rows="3"></textarea>
                        </div>

                        <div class="col-md-7 my-4">
                            <button class="btn btn-primary btn-md active" role="button" aria-pressed="true">Send
                                forespørgsel
                            </button>
                        </div>

                    </form>

                    <div class="col-md-7">

                        <b>* Hvis du f.eks. har valgt en carport med målene 240x360 cm kan redskabsrummet maksimalt måle
                            210x330 </b>


                    </div>


                </div>


            </div>


            <div class="col-3">

                <div class="jumbotron">

                    <img src="images/carportbillederejsning.png" width="400" height="100" alt="Computer Hope"
                         class="img-fluid" alt="Responsive image">
                </div>

            </div>


        </div>
    </div>
</div>


<%@include file="/includes/footer.inc" %>














