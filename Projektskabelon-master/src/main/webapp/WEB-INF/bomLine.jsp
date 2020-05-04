
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h3></h3>

<table class="table table-bordered">
    <thead>
    <tr>
        <th scope="col">Navn</th>
        <th scope="col">Længde</th>
        <th scope="col">Antal</th>
        <th scope="col">Enhed</th>
        <th scope="col">Beskrivelse</th>

    </tr>
    </thead>
    <tbody>
   <c:forEach var="bomitems" items="${sessionScope.listOfBomLines}">

       <tr>
           <th scope="row">1</th>
           <td>Mark</td>
           <td>Otto</td>
           <td>@mdo</td>
           <td>@mdo</td>
           <td>@mdo</td>
       </tr>


   </c:forEach>


    </tbody>
</table>


<%@include file="../includes/footer.inc" %>