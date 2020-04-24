<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="../includes/header.inc" %>


<c:if test="${requestScope.error!= null}">

    <div class="alert alert-danger" role="alert">
    <h2>Der er opstået en fejl </h2>

    ${requestScope.error}

</c:if>
</div>

<a href="FrontController?target=redirect&destination=index"> Til forsiden</a>


<%@include file="../includes/footer.inc" %>