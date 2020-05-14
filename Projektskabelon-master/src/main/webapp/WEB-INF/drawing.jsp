<%@include file="../includes/header.inc" %>

<div id="container">
    <div id="main">
        <div class="row">

            <div class="col"></div>

            <div class="col">
                <h1 class="text-center mt-5">Tegning over din carport</h1> <br><br><br>
                <div class="mt-3">
                    ${sessionScope.svgdrawingtop}
                </div>
            </div>

            <div class="col"></div>

        </div>

        <div class="row mt-3">

            <div class="col"></div>

            <div class="col mt-5">
                ${sessionScope.svgdrawingside}
            </div>

            <div class="col"></div>

        </div>
    </div>
</div>

<%@include file="../includes/footer.inc" %>