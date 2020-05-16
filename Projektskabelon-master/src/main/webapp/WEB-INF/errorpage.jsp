<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc" %>


<div id="container">
    <div id="main">

        <div class="row mt-5">

            <div class="col"></div>

            <div class="col text-center">
                <div class="error">

                    <c:if test="${requestScope.error!= null}">

                    <div class="alert alert-danger" role="alert">
                        <h2 class="text-center">Der er opstået en fejl </h2>

                        <h6 class="text-center text-danger"> ${requestScope.error}</h6>


                        </c:if>
                        <a href="FrontController?target=redirect&destination=index" class="btn btn-primary btn-sm active" role="button" aria-pressed="true">Til forsiden</a>


                    </div>
                </div>
            </div>
            <div class="col"></div>
        </div>
    </div>
</div>



<%@include file="../includes/footer.inc" %>