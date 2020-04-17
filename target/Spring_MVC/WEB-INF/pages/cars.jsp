<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${car}</title>
</head>
<body>
<c:forEach var="car" items="${carsList}">
    <table>
        <tr>
            <td>${car.model}</td>
            <td>${car.maxSpeed}</td>
            <td>${car.yearOfProduction}</td>
        </tr>
    </table>
</c:forEach>
</body>
</html>
