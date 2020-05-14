<%--
  Created by IntelliJ IDEA.
  User: Bruger
  Date: 21-04-2020
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.inc" %>

<div class="container-fluid">

    <div class="row mb-5">


        <div class="col-9"></div>

    </div>

    <h1 class="text-center my-5 ">Ordre information</h1>


    <div class="row mb-3">

        <div class="col-4"></div>

        <div class="col-4 ">
            <table class="table table-striped">
                <tbody>
                <tr>
                    <th scope="row">Carport længde</th>
                    <td>${requestScope.carportlength}</td>
                </tr>
                <tr>
                    <th scope="row">Carport bredde</th>
                    <td>${requestScope.carportwidth}</td>
                </tr>
                <tr>
                    <th scope="row">Carport tag</th>
                    <td>${requestScope.carportrooftype}</td>
                </tr>
                <tr>
                    <th scope="row">Taghældning</th>
                    <td>${requestScope.carporttilt}</td>
                </tr>
                <tr>
                    <th scope="row">Redskabsrums længde</th>
                    <td>${requestScope.toolshedlength}</td>
                </tr>
                <tr>
                    <th scope="row">Redskabsrums bredde</th>
                    <td>${requestScope.toolshedwidth}</td>
                </tr>
                <tr>
                    <th scope="row">Kommentarer</th>
                    <td>${requestScope.comments}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="row mb-2">

        <div class="col-4"></div>
        <form action="FrontController" method="post">
        <input type="hidden" name="target" value="managerequest">
            <div class="col-1 text-right">

                <button type="submit" name="seedrawing" value="${request.ordernumber}"
                        class="btn btn-outline-primary"> Se tegning
                </button>
            </div>

            <div class="col-2 text-left">
                <button type="submit" name="seebomline" value="${request.ordernumber}"
                        class="btn btn-outline-primary"> Se stykliste
                </button>
            </div>
            <div class="col-1 text-right">
                <input type="hidden" name="target" value="køb"/>
                <button type="submit" name="authorize" value="${request.ordernumber}"
                        class="btn btn-outline-primary"> Godkend
                </button>
            </div>
        </form>
        <div class="col-4"></div>

    </div>
</div>

<%@include file="/includes/footer.inc" %>
