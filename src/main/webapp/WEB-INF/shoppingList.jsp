<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
   <title> <c:if test="${error == null}"> ${shoppingList.getName()} </c:if> </title>
</head>
<body>
	
    <h1>Liste de courses : <c:if test="${error == null}"> ${shoppingList.getName()} </c:if></h1>
    
    <c:if test="${error == null}">
	    <ul>
	        <c:forEach var="article" items="${shoppingList.getList()}">
	            <li>${article.key.getName()} - ${article.value}</li>
	        </c:forEach> 
	    </ul>
	 </c:if>
	 
	<c:if test="${error != null}">
		<p>${error }</p>
	</c:if>
	    
    <a href="/ShoppingList/Home">Retourner à la liste des courses</a>
</body>
</html>	       