<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CLIENTS</title>
</head>
<body>

<h2>Clients</h2>
<table>
    <tr>
        <th>id</th>
        <th>fullName</th>
        <th>discount</th>
    </tr>
    <c:forEach var="client" items="${clientsList}">
        <tr>
            <td>${client.id}</td>
            <td>${client.fullName}</td>
            <td>${client.discount}</td>
            <td>
                <a href="/edit/${client.id}">edit</a>
            </td>
            <td>
                <a href="/delete/${client.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add client</a>
</body>
</html>
