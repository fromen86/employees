<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Отделы</title>
</head>
<body>
<c:forEach var="dep" items="${departments}">
    <jsp:text>${dep.name}</jsp:text>
</c:forEach>
</body>
</html>
