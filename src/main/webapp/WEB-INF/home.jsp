<%@ include file="tagLib.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Listes de courses</h1>
    <ul>
        <c:forEach var="listeCourses" items="${utilisateur.listesCourses}">
            <li><a href="AfficherListeServlet?nomListe=${listeCourses.nom}">${listeCourses.nom}</a></li>
        </c:forEach>
    </ul>
</body>
</html>