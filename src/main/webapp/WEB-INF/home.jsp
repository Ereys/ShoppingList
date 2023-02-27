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
            <li> <a href="/ShoppingList/List/${list.getName()}"> <c:out value="${list.getName()}"> </c:out> </a> </li>
        </c:forEach>
    </ul>
    
    <a href="/ShoppingList/CreateList">Add shopping list</a>
</body>
</html>