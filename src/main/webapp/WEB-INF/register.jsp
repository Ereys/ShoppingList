<%@ include file="tagLib.jsp" %>
<html>
<meta charset="UTF-8">
<title>Register</title>
</head>

<body>
	<form action="Register" method="POST">
 <h1>S'enregistrer</h1>
 <label><b>Nom d'utilisateur</b></label>
 <input type="text" placeholder="Entrer le nom d'utilisateur" name="username" required>
 <label><b>Mot de passe</b></label>
 <input type="password" placeholder="Entrer le mot de passe" name="password" required>
 <input type="submit" id='submit' value='REGISTER' >
</form>

<a href="/ShoppingList">Se connecter</a>
</body>
</html>