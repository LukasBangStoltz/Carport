<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="MyUtils.InitializeLists" %>
<%@include file="../includes/headerEmployee.inc" %>
<%@include file="../includes/initializearraylister.inc" %>

<%
    if (request.getServletContext().getAttribute("requestList") == null) {
        request.getServletContext().setAttribute("requestList", InitializeLists.getRequestList());
    }
%>


<div class="row">


    <div class="col-3">
    </div>
    <div class="col-6">

        <h2 class="text-center my-5 font-weight-bold">Oversigt over forespørgsler</h2>

        <form action="FrontController" method="post">
            <input type="hidden" name="target" value="managerequest">
            <table class="table table-striped my-3">

                <c:forEach var="requestItem" items="${applicationScope.requestList}">

                <tr>
                    <td><p style="color: black">Ordre ID: ${requestItem.orderId}</p></td>
                    <td>

                        <button type="submit" name="seeorder" value="${requestItem.orderId}"
                                class="btn btn-outline-primary"> Se ordre
                        </button>

                    </td>

                    </c:forEach>
                </tr>
            </table>
        </form>
    </div>
    <div class="col-3">
    </div>
</div>


<%@include file="../includes/footer.inc" %>
