
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
    <%--jquery cdn--%>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <title><tiles:getAsString name="title"/></title>
    <link rel="shortcut icon" href="../img/favicon.ico" type="image/x-icon">
</head>

<body>

<div class="container">
<center><tiles:insertAttribute name="header"/>
<table class="table table-responsive table-condensed">
    <tr>
        <td><center><tiles:insertAttribute name="search"/></center></td>
        <td><center><tiles:insertAttribute name="body"/></center></td>
        <td><center><tiles:insertAttribute name="insert"/></center></td>
    </tr>
</table>
<tiles:insertAttribute name="footer"/></center>
</div>
</body>
</html>
