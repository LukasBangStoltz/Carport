<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Hello, world!</title>

    <link rel="stylesheet" type="text/css" href="css/style.css">


</head>
<body>


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

                        <b> Ønsket carport mål: </b>

                    </div>

                </div>


                <form action="Frontcontroller" method="post">
                    <div class="form-group col-md-7">
                        <label for="carportlængde"><b>Carport længde </b></label>
                        <select class="form-control" id="carportlængde">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>


                    <div class="form-group col-md-7 mt-2">
                        <label for="carportbredde"><b>Carport bredde </b></label>
                        <select class="form-control" id="carportbredde">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="carporttag"><b>Tag </b></label>
                        <select class="form-control" id="carporttag">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="taghældning"><b>Taghældning </b></label>
                        <select class="form-control" id="taghældning">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="col-md-7">

                        <b> Redskabsrum: </b> <br>

                        <small id="redskabshelp" class="form-text text-muted"> NB! Der skal beregnes 15 cm tagudhæng på
                            hver
                            side af redskabsrummet </small>

                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="redskabsrumlængde"><b>Redskabsrums længde </b></label>
                        <select class="form-control" id="redskabsrumlængde">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="redskabsrumBredde"><b>Redskabsrums bredde </b></label>
                        <select class="form-control" id="redskabsrumBredde">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>

                    <div class="form-group col-md-7 mt-2">
                        <label for="bemærkninger"><b> Evt. bemærkninger </b></label>
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

                <img src="img/carportbillede.png" width="400" height="100" alt="Computer Hope" class="img-fluid" alt="Responsive image">
            </div>

        </div>


    </div>
</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</body>
</html>














