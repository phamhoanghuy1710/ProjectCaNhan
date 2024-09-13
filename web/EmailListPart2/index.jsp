<%-- 
    Document   : index
    Created on : Sep 11, 2024, 11:18:24 AM
    Author     : HUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Murach's  Java servlets and JSP</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/style/emailList.css" type="text/css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Join our email list</h1>
        <p>join our email list, enter your name and email address below </p>
        <form action="/ProjectCaNhan/emailList2" method="post">
            <input type="hidden" name="action" value="add">
            <label>Email:</label>
            <input type="email" name="email" value=${user.email}><br>
            <label>First name:</label>
            <input type="text" name="firstName"value=${user.firstName}><br>
            <label>Last name:</label>
            <input type="text" name="lastName" value=${user.lastName}><br>
            <h2>${message}</h2>
            <label>&nbsp;</label>
            <input type="submit" value="Join now" id="submit"><br>
            
            
        </form>
    </body>
</html>
