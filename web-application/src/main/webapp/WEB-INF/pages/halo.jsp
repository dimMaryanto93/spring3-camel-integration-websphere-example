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
    <script type="application/javascript"
            src="<c:url value="/node_modules/jquery/dist/jquery.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/moment/min/moment.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/popper.js/dist/popper.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/datatables.net/js/jquery.dataTables.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/jquery-serializejson/jquery.serializejson.min.js"></c:url>"></script>
    <%--css--%>
    <link rel="stylesheet"
          href="<c:url value="/node_modules/bootstrap/dist/css/bootstrap.min.css"></c:url>"/>
    <link rel="stylesheet"
          href="<c:url value="/node_modules/datatables.net-dt/css/jquery.dataTables.css"></c:url>"/>
    <link rel="stylesheet"
          href="<c:url value="/node_modules/bootbox/bootbox.min.js"></c:url>"/>
</head>
<body class="container">
Halo ${employee.firstName} ${employee.lastName} salarynya adalah ${employee.salary}
</body>
</html>
