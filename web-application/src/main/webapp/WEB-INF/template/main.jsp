<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%--javascript--%>
    <script type="application/javascript"
            src="<c:url value="/node_modules/jquery/dist/jquery.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/moment/min/moment.min.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/datatables.net/js/jquery.dataTables.js"></c:url>"></script>
    <script type="application/javascript"
            src="<c:url value="/node_modules/jquery-serializejson/jquery.serializejson.min.js"></c:url>"></script>
    <%--css--%>
    <link rel="stylesheet"
          href="<c:url value="/node_modules/bootstrap/dist/css/bootstrap.min.css"></c:url>"/>
    <link rel="stylesheet"
          href="<c:url value="/node_modules/font-awesome/css/font-awesome.min.css"></c:url>"/>
    <link rel="stylesheet"
          href="<c:url value="/node_modules/datatables.net-dt/css/jquery.dataTables.css"></c:url>"/>
    <link rel="stylesheet"
          href="<c:url value="/node_modules/bootbox/bootbox.min.js"></c:url>"/>
    <title>Aplikasi Scheduler</title>

    <%
        final java.util.Date currentDate = new java.util.Date();
        final java.text.SimpleDateFormat DATE_FORMAT = new java.text.SimpleDateFormat("dd/MM/yyyy");
        final String date = DATE_FORMAT.format(currentDate);
    %>
</head>
<body class="container">
<div>
    <sitemesh:write property='body'/>
</div>
</body>
</html>