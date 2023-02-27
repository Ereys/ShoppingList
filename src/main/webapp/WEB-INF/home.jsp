<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Listes de courses</h1>
    <ul>
        <c:forEach var="list" items="${shoppingList}">
            <li> <c:out value="${list.getName()}"> </c:out> </li>
        </c:forEach>
    </ul>
</body>
</html>