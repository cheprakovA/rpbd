<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty client.fullName}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty client.fullName}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty client.fullName}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty client.fullName}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty client.fullName}">
        <input type="hidden" name="id" value="${client.id}">
    </c:if>
    <label for="fullName">FullName</label>
    <input type="text" name="fullName" id="fullName">
    <label for="discount">Discount</label>
    <input type="text" name="discount" id="discount">
    <c:if test="${!empty client.fullName}">
        <input type="submit" value="Edit client">
    </c:if>
    <c:if test="${empty client.fullName}">
        <input type="submit" value="Add client">
    </c:if>
</form>
</body>
</html>