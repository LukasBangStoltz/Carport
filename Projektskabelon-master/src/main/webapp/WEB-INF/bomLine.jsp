<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h3 class="text-center my-5"> Styklisten til din carport </h3>


<div class="row">
    <div class="col-2"></div>

    <div class="col-8">
    <table class="table table-bordered my-5">
        <thead>
        <tr>
            <th scope="col">Navn</th>
            <th scope="col">Dimension</th>
            <th scope="col">Længde</th>
            <th scope="col">Antal</th>
            <th scope="col">Enhed</th>
            <th scope="col">Beskrivelse</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="bomitems" items="${sessionScope.bomlist}">

            <tr>

                <td>${bomitems.name}</td>
                <td>${bomitems.dimension}</td>
                <td>${bomitems.length}</td>
                <td>${bomitems.quantity}</td>
                <td>${bomitems.unit}</td>
                <td>${bomitems.description}</td>
            </tr>


        </c:forEach>


        </tbody>
    </table>
    </div>
    <div class="col-2"></div>
</div>


<%@include file="../includes/footer.inc" %>