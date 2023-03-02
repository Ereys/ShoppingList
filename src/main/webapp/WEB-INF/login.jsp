<%@ include file="tagLib.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div class="container">
		<form action="Login" method="POST">
			<h1>Connexion</h1>
			<div class="form-group">
				<label for="username">Nom d'utilisateur</label> <input type="text"
					placeholder="Entrer le nom d'utilisateur" name="username" required>
			</div>
			<div class="form-group">
				<label for="password">Mot de passe</label> <input type="password"
					placeholder="Entrer le mot de passe" name="password" required>
			</div>
			<input type="submit" id='submit' value='LOGIN'>
		</form>

		<c:if test="${erreur != null }">
			<p>${erreur}</p>
		</c:if>
		<div class="register-link">
			<a href="/ShoppingList/Register">S'enregistrer</a>
		</div>
	</div>
</body>
</html>