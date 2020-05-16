
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="MyUtils.InitializeLists" %>
<%@include file="../includes/header.inc" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="container">
    <div id="main">
        <h2 class="text-center my-5"> Styklisten til carporten </h2>

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
                        <th scope="col">Pris</th>


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
                            <td>${bomitems.price}</td>
                        </tr>


                    </c:forEach>


                    </tbody>
                </table>
            </div>
            <div class="col-2"></div>
        </div>
    </div>


<%@include file="../includes/footer.inc" %>