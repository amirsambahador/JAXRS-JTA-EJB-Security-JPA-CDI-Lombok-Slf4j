<%--
  Created by IntelliJ IDEA.
  User: amirsam, bahador
  Date: 5/13/2023
  Time: 1:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TEST</title>
</head>
<body>
<a href="/api/v1/person/save?name=amirsam&family=bahador">SAVE RECORD</a>
<br/>
<a href="/api/v1/person/update?id=1&name=amir&family=bahador">UPDATE RECORD 1</a>
<br/>
<a href="/api/v1/person/remove?id=2">REMOVE RECORD 2</a>
<br/>
<a href="/api/v1/person/findOne?id=3">FIND ONE RECORD 3</a>
<br/>
<a href="/api/v1/person/findAll">FIND ALL RECORD</a>
<br/>
<a href="/api/v1/person/search?content=amirsam">FIND ALL RECORD BY SEARCH</a>
</body>
</html>
