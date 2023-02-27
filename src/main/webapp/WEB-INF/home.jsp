<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
    <h1>Shopping List : </h1>
    <ul>
        <c:forEach var="list" items="${shoppingList}">
            <li> <c:out value="${list.getName()}"> </c:out> </li>
        </c:forEach>
    </ul>
    
    <a href="/ShoppingList/CreateList">Add shopping list</a>
</body>
</html>