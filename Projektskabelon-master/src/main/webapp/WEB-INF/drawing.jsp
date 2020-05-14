<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc" %>

<div id="container">
    <div id="main">
        <div class="row">

            <div class="col"></div>

            <div class="col">
                <h1 class="text-center my-5">Tegning over din carport</h1> <br><br><br>
                <div class="my-3">
                    ${sessionScope.svgdrawingtop}
                </div>
            </div>

            <div class="col"></div>

        </div>

        <div class="row">

            <div class="col"></div>

            <div class="col">
                ${sessionScope.svgdrawingside}
            </div>

            <div class="col"></div>

        </div>
    </div>
</div>

<%@include file="../includes/footer.inc" %>