<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/headerEmployee.inc" %>

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


        <div class="row my-3">


            <div class="col-9"></div>

        </div>


        <div class="row">

            <div class="col-4"></div>

            <div class="col-4 my-3">
                <table class="table">
                    <tbody>
                    <tr>
                        <th scope="row">Carport længde</th>
                        <td>${sessionScope.carportlength}</td>
                    </tr>
                    <tr>
                        <th scope="row">Carport bredde</th>
                        <td>${sessionScope.carportwidth}</td>
                    </tr>
                    <tr>
                        <th scope="row">Carport tag</th>
                        <td>${sessionScope.carportrooftype}</td>
                    </tr>
                    <tr>
                        <th scope="row">Taghældning</th>
                        <td>${sessionScope.carporttilt}</td>
                    </tr>
                    <tr>
                        <th scope="row">Redskabsrums længde</th>
                        <td>${sessionScope.toolshedlength}</td>
                    </tr>
                    <tr>
                        <th scope="row">Redskabsrums bredde</th>
                        <td>${sessionScope.toolshedwidth}</td>
                    </tr>
                    <tr>
                        <th scope="row">Kommentarer</th>
                        <td>${sessionScope.comments}</td>
                    </tr>
                    </tbody>
                </table>
            </div>

        </div>

        <div class="row mb-2">


            <div class="col-5"></div>
            <div class="text-center">
            <form action="FrontController" method="post">
                <input type="hidden" name="target" value="managerequestcustomer">



                    <button type="submit" name="seedrawing" value="${sessionScope.ordernumber}"
                            class="btn btn-outline-primary"> Se tegning
                    </button>



                    <button type="submit" name="seebomline" value="${sessionScope.ordernumber}"
                            class="btn btn-outline-primary"> Se stykliste
                    </button>



            </form>
            </div>
            <div class="col-4"></div>


        </div>
    </div>
</div>

<%@include file="/includes/footer.inc" %>
