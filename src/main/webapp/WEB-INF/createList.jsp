<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
    <title>Cr�ation d'une liste de courses</title>
</head>
<body>
    <h1>Cr�ation d'une liste de courses</h1>
    <form action="CreateList" method="post">
        <label for="nomListe">Nom de la liste :</label>
        <input type="text" id="nomListe" name="name"><br><br>
        <input type="submit" value="Cr�er">
    </form>
</body>
</html>