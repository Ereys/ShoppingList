<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
    <title>Cr�ation d'une liste de courses</title>
</head>
<body>
<div class="container">
    <h1>Cr�ation d'une liste de courses</h1>
    <form action="CreateList" method="post">
    <div class="form-group">
        <label for="nomListe">Nom de la liste :</label>
        <input type="text" id="nomListe" name="name"><br><br>
        <input type="submit" value="Cr�er">
        
    </div>
    </form>
    </div>
</body>
</html>