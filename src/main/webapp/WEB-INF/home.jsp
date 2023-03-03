<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
    <div class="container">
        <h1>Shopping List : </h1>
        <ul class="form-group">
            <c:forEach var="list" items="${shoppingList}">
                <li> <a href="/ShoppingList/List/${list.getName()}"> <c:out value="${list.getName()}"> </c:out> </a> </li>
            </c:forEach>
        </ul>
        
        <a href="/ShoppingList/CreateList" class="register-link">Add shopping list</a>
    </div>
</body>
</html>
