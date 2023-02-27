<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="Login" method="POST">
		 <h1>Connexion</h1>
		 <label><b>Nom d'utilisateur</b></label>
		 <input type="text" placeholder="Entrer le nom d'utilisateur" name="username" required>
		 <label><b>Mot de passe</b></label>
		 <input type="password" placeholder="Entrer le mot de passe" name="password" required>
		 <input type="submit" id='submit' value='LOGIN' >
	</form>
	
	<c:if test="${erreur != null }">
		<p> ${erreur} </p>
	</c:if>

<a href="/ShoppingList/Register">S'enregistrer</a>
</body>
</html>