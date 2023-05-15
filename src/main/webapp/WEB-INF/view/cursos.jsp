<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Cursos</title>
    <style>
        .caption {
            max-width: 100%;
            overflow-wrap: break-word;
            padding-right: 12px !important;
            padding-left: 12px !important;

        }
        table {
            border-collapse: collapse;
            margin-left: 50px;
            margin-top: 20px;
        }
        th, td {
            padding: 10px;
            border: 1px solid black;
        }
</style>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Cursos a DAM</h1>
            <p>Llista de cursos de Carlos Pons</p>
        </div>
    </div>
</section>
<section class="container">
    <div class="row">
        <c:forEach items="${cursos}" var="aCursos">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${aCursos.cursId}</h3>
                        <p>${aCursos.titolCurs}</p>
                        <p>${aCursos.descCurs}</p>
                        <p>${aCursos.urlCurs}</p>
                        <h3>Estudiants</h3>
                        <table>
                            <thead class="thead-dark">
                            <tr>
                                <th>Id</th>
                                <th>Nom</th>
                                <th>Cognoms</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${aCursos.estudiants}" var="e">
                                <tr>
                                    <td>${e.estudiantId}</td>
                                    <td>${e.estudiantNom}</td>
                                    <td>${e.estudiantCognom}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </c:forEach>

    </div>
</section>
</body>
</html>
