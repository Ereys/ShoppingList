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
	    
		<form action="${shoppingList.getName()}" method="POST">

			 <label><b>Nom de l'article : </b></label>
			 <input type="text" placeholder="Entrer le nom de l'article" name="articleName" required>
			 
			 <label><b>Quantité : </b></label>
			 <input type="text" placeholder="Entrer la quantité" name="qtt" required>
			 <input type="submit" id='submit' value='addArticle' >
		</form>
	    
	    
	 </c:if>
	 
	<c:if test="${error != null}">
		<p>${error }</p>
	</c:if>
	    
    <a href="/ShoppingList/Home">Retourner à la liste des courses</a>
</body>
</html>	       