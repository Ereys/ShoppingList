<%@ include file="tagLib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<div class="container">
		<form action="Register" method="POST">
			<h1>S'enregistrer</h1>
			<div class="form-group">
				<label for="username">Nom d'utilisateur</label> <input type="text"
					placeholder="Entrer le nom d'utilisateur" name="username"
					id="username" required>
			</div>
			<div class="form-group">
				<label for="password">Mot de passe</label> <input type="password"
					placeholder="Entrer le mot de passe" name="password" id="password"
					required>
			</div>
			<input type="submit" id='submit' value='REGISTER'>
		</form>
		<div class="register-link">
			<p>Déjà enregistré?</p>
			<a href="/ShoppingList/Login">Se connecter</a>
		</div>
	</div>
</body>
</html>
