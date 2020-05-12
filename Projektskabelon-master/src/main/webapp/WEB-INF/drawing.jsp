
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc" %>

<div class="row">

    <div class="col"></div>

    <div class="col">
        <h1 class="text-center my-5">Tegning over din carport</h1> <br><br><br>
        <div class="my-3">
        ${requestScope.svgdrawingtop}
        </div>
    </div>

    <div class="col"></div>

</div>

<div class="row">

    <div class="col"></div>

    <div class="col">
        ${requestScope.svgdrawingside}
    </div>

    <div class="col"></div>

</div>

<br><br><br><br><br><br><br><br>

<%@include file="../includes/footer.inc"%>