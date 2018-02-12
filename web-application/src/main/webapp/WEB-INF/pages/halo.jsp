<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 02/12/2018
  Time: 14.17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Belajar Spring Web MVC</title>
    <%--javascript--%>
    <script type="application/javascript" src="<c:url value="/static/jquery-3.3.1.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/static/bootstrap-4.0/js/bootstrap.bundle.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/static/bootstrap-4.0/js/bootstrap.min.js"></c:url>"></script>
    <%--css--%>
    <link rel="stylesheet" href="<c:url value="/static/bootstrap-4.0/css/bootstrap.min.css"></c:url>"/>
</head>
<body class="container">
Halo ${employee.firstName} ${employee.lastName} salarynya adalah ${employee.salary}
</body>
</html>
