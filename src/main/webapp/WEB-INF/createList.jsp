<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
    <title>Création d'une liste de courses</title>
</head>
<body>
    <h1>Création d'une liste de courses</h1>
    <form action="CreateList" method="post">
        <label for="nomListe">Nom de la liste :</label>
        <input type="text" id="nomListe" name="name"><br><br>
        <input type="submit" value="Créer">
    </form>
</body>
</html>