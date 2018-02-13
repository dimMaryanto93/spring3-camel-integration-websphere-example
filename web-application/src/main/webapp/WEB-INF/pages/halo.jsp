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
            src="<c:url value="/webjars/jquery/3.3.1/jquery.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/webjars/moment/2.20.1/min/moment.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/webjars/popper.js/1.13.0/dist/popper.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/webjars/datatables/1.10.16/js/jquery.dataTables.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/webjars/datatables/1.10.16/js/dataTables.bootstrap4.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/webjars/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></c:url>"></script>
    <%--css--%>
    <link rel="stylesheet"
          href="<c:url value="/webjars/bootstrap/4.0.0/css/bootstrap.min.css"></c:url>"/>
    <link rel="stylesheet"
          href="<c:url value="/webjars/datatables/1.10.16/css/jquery.dataTables.min.css"></c:url>"/>
    <link rel="stylesheet"
          href="<c:url value="/webjars/datatables/1.10.16/css/dataTables.bootstrap4.min.css"></c:url>"/>
</head>
<body class="container">
Halo ${employee.firstName} ${employee.lastName} salarynya adalah ${employee.salary}
</body>
</html>
