<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
    <title>Création d'une liste de courses</title>
</head>
<body>
<div class="container">
    <h1>Création d'une liste de courses</h1>
    
    
    <ul class="list">
        <c:forEach var="shoppingList" items="${shoppingLists}">
            <li>
                ${shoppingList.getName()}
                <button onclick="editList('${list.key.getName()}')">Modifier</button>
                <button onclick="deleteList('${list.key.getName()}')">Supprimer</button>
            </li>
        </c:forEach>
    </ul>
    
    
    
    <form action="CreateList" method="post">
    <div class="form-group">
        <label for="nomListe">Nom de la liste :</label>
        <input type="text" id="nomListe" name="name"><br><br>
        <input type="submit" value="Créer">
        
    </div>
    </form>
    </div>
</body>
</html>