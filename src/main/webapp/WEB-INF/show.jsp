<%--
  Created by IntelliJ IDEA.
  User: SYSCOM
  Date: 1/8/2021
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dojo Survey Index</title>
</head>
<body>
<h3>Submitted Info</h3>
<p>Name: <c:out value="${name}"/> </p>
<p>Dojo location: <c:out value="${location}"/> </p>
<p>Favorite language: <c:out value="${language}"/> </p>
<p>Comment: <c:out value="${comment}"/> </p>
<button><a href="/">Back</a></button>
</body>
</html>
