<%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 15/05/2020
  Time: 11.42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="MyUtils.InitializeLists" %>
<%@include file="../includes/header.inc" %>
<%@include file="../includes/initializearraylister.inc" %>


<div id="container">
    <div id="main">
        <div class="row">


            <div class="col-3">
            </div>
            <div class="col-6">

                <h2 class="text-center my-5 font-weight-bold">Oversigt over dine forespørgsler</h2>

                <form action="FrontController" method="post">
                    <input type="hidden" name="target" value="managerequestcustomer">
                    <table class="table table-striped my-3">

                        <c:forEach var="requestItem" items="${sessionScope.requestListCustomer}">

                        <tr>
                            <td><p style="color: black">Ordre ID: ${requestItem.orderId}</p></td>
                            <td>

                                <button type="submit" name="seeorder" value="${requestItem.orderId}"
                                        class="btn btn-outline-primary"> Se ordre
                                </button>

                                <c:if test="${requestItem.status}">

                                    <button type="submit" name="buy" value="${requestItem.orderId}"
                                            class="btn btn-outline-primary"> Køb
                                    </button>

                                </c:if>
                            </td>

                            </c:forEach>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="col-3">
            </div>
        </div>
    </div>
</div>
<%@include file="../includes/footer.inc" %>
