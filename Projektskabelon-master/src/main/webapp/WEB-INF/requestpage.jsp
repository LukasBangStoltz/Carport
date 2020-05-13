<%@ page import="MyUtils.InitializeLists" %>
<%@include file="../includes/headerEmployee.inc" %>
<%@include file="../includes/initializearraylister.inc" %>
<%
    if(request.getServletContext().getAttribute("requestList") == null){
        request.getServletContext().setAttribute("requestList", InitializeLists.getRequestList());
    }
%>

<div class="container-fluid">

    <div class="row">

        <div class="col">
    <form action="FrontController" method="post">
        <input type="hidden" name="target" value="managerequests">
        <table class="table">

            <c:forEach var="requestItem" items="${applicationScope.requestList}">

            <tr>
                <td>Ordre ID: ${requestItem.orderId}</td>
                <td>
                    <button type="submit" name="godkend" value="${requestItem.orderId}" class="btn btn-primary">
                       Godkend
                    </button>
                    <button type="submit" name="seordre" value="${requestItem.orderId}" class="btn btn-primary"> Se ordre
                    </button>
                </td>

                </c:forEach>
            </tr>
        </table>
    </form>
    </div>
    </div>
</div>

<%@include file="../includes/footer.inc" %>
