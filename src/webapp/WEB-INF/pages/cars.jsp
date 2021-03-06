<%@ taglib uri="http://www.springframework.org/tags" prefix="locale" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Car</title>
</head>
<body>
<span style="float: right">
    <a href="?locale=en">en</a>
    |
    <a href="?locale=ru">ru</a>
</span>
<locale:message code="cars"/>
<table>
    <tr>
        <td>
            <locale:message code="model"/>
        </td>
        <td>
            <locale:message code="maxSpeed"/>
        </td>
        <td>
            <locale:message code="year"/>
        </td>
    </tr>
    <c:forEach var="car" items="${carsList}">
        <tr>
            <td>${car.model}</td>
            <td>${car.maxSpeed}</td>
            <td>${car.yearOfProduction}</td>
        </tr>
    </c:forEach>
</table>
<div>

</div>
</body>
</html>
