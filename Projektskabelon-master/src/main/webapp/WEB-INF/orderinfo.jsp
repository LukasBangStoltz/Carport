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

<div id="container">
    <div id="main">

        <div class="row my-3">


            <div class="col-9"></div>

        </div>

        <div class="jumbotron" style="font-weight: bold">
            <h1 class="text-center">Ordre information</h1>
        </div>

        <div class="row">

            <div class="col-4"></div>

            <div class="col-4 my-3">
                <table class="table">
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
                        <td>${requestScope.carportroof}</td>
                    </tr>
                    <tr>
                        <th scope="row">Taghældning</th>
                        <td>${requestScope.rooftilt}</td>
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

            <div class="col-1 text-right">
                <form action="FrontController" method="post">
                    <input type="hidden" name="target" value="drawing"/>
                    <button type="button" class="btn btn-info">Se tegning</button>
                </form>
            </div>

            <div class="col-2 text-left">
                <form action="FrontController" method="post">
                    <input type="hidden" name="target" value="gembestilling"/>
                    <button type="button" class="btn btn-primary">Se stykliste</button>
                </form>
            </div>

            <div class="col-1 text-right">
                <form action="FrontController" method="post">
                    <input type="hidden" name="target" value="køb"/>
                    <button type="button" class="btn btn-primary">Godkend</button>
                </form>
            </div>

            <div class="col-4"></div>

        </div>
    </div>
</div>

<%@include file="/includes/footer.inc" %>
