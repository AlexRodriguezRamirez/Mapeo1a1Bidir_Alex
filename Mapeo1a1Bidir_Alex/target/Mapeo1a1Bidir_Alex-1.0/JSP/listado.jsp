<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilo.css" />
    </head>
    <body>

        <div id="principal">
            <c:choose>
                <c:when test="${sessionScope.control == \"presidente\"}">
                    <h2>Listado de presidentes</h2>

                    <ul>
                        <c:forEach var="item" items="${listaPresi}">
                            <li>${item.nombrePresidente}</li>
                            <small> ${item.pais.nombrePais}</small>
                        </c:forEach>
                    </ul>
                </c:when>

                <c:otherwise>
                    <h2>Listado de países</h2>

                    <ul>
                        <c:forEach var="item" items="${listaPais}">
                            <li>${item.nombrePais}</li>
                            <small> ${item.presidente.nombrePresidente}</small>
                        </c:forEach>
                    </ul>
                </c:otherwise>

            </c:choose>





            <br />
            <p><a href="${contexto}/" class="enlace">Men&uacute; inicial</a></p>
        </div>


    </body>
</html>