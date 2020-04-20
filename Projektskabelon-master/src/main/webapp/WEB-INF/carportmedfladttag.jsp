<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.inc"%>


<div class="container-fluid">

    <div class="row">

        <div class="col-1"></div>


        <div class="col-8">


            <div class="jumbotron">


                <div class="col-md-10">

                    <h1 class=" mb-5">Carport med fladt tag</h1>


                    <div class="mb-2">

                        <b>QUICK-BYG TILBUD - CARPORT MED FLADT TAG</b>

                    </div>

                    <div class="mb-2">
                        <b>
                            Med et specialudviklet computerprogram kan vi lynhurtigt beregne prisen og udskrive en
                            skitsetegning på en carport indenfor vores standardprogram, der tilpasses dine specifikke
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


                <form action="Frontcontroller" method="post">
                    <div class="form-group col-md-7">
                        <label for="carportlængde"><p>Carport længde </p></label>
                        <select class="form-control" id="carportlængde">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>


                    <div class="form-group col-md-7 mt-2">
                        <label for="carportbredde"><p>Carport bredde </p></label>
                        <select class="form-control" id="carportbredde">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="carporttag"><p>Tag </p></label>
                        <select class="form-control" id="carporttag">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="col-md-7">

                        <p> Redskabsrum: </p>
                        <small id="redskabshelp" class="form-text text-muted">  NB! Der skal beregnes 15 cm tagudhæng på
                            hver side af redskabsrummet </small>

                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="redskabsrumlængde"><p>Redskabsrums længde </p></label>
                        <select class="form-control" id="redskabsrumlængde">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="redskabsrumBredde"><p>Redskabsrums bredde </p></label>
                        <select class="form-control" id="redskabsrumBredde">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="bemærkninger"><p> Evt. bemærkninger </p></label>
                        <input type="email" class="form-control" id="bemærkninger" aria-describedby="emailHelp"
                               placeholder="Bemærkninger">

                    </div>

                    <div class="col-md-7 my-4">
                        <button class="btn btn-primary btn-md active" role="button"  aria-pressed="true">Læg i kurv</button>
                    </div>

                </form>

                <div class="col-md-7">

                    <b>* Hvis du f.eks. har valgt en carport med målene 240x360 cm kan redskabsrummet maksimalt måle 210x330 </b>


                </div>



            </div>


        </div>


        <div class="col-3">

            <div class="jumbotron">

                <img src="images/carportbillede.png" width="400" height="100" alt="Computer Hope" class="img-fluid" alt="Responsive image">
            </div>

        </div>


    </div>
</div>

<%@include file="/includes/footer.inc"%>










