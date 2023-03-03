<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
   <title> <c:if test="${error == null}"> ${shoppingList.getName()} </c:if> </title>
   <link href="../css/shoppingList.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
    <h1 class="text-center">Liste de courses : <c:if test="${error == null}"> ${shoppingList.getName()} </c:if></h1>
    
    <c:if test="${error == null}">
	    <ul class="list">
	        <c:forEach var="article" items="${shoppingList.getList()}">
	            <li>${article.key.getName()} - ${article.value}</li>
	        </c:forEach> 
	    </ul>
	    
		<form action="${shoppingList.getName()}" method="POST" class="form">

			 <label class="label"><b>Nom de l'article : </b></label>
			 <input type="text" placeholder="Entrer le nom de l'article" name="articleName" required class="input">
			 
			 <label class="label"><b>Quantité : </b></label>
			 <input type="text" placeholder="Entrer la quantité" name="qtt" required class="input">
			 <input type="submit" id='submit' value='addArticle' class="button">
		</form>
	 </c:if>
	 
	<c:if test="${error != null}">
		<p>${error }</p>
	</c:if>
	    
    <div class="register-link">
        <a href="/ShoppingList/Home">Retourner à la liste des courses</a>
    </div>
    
</div>
</body>
</html>
