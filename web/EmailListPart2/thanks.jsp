<%-- 
    Document   : thanks
    Created on : Aug 28, 2024, 8:59:37 PM
    Author     : HUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Murach's  Java servlets and JSP</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/style/emailList.css" type="text/css">
    </head>
    <body>
        <h1>Thank for joining our email list</h1>
        <p>Here is  the information that you entered</p>
        <label>Email:</label>
        <span>${user.email}</span><br>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        
        <form action="/ProjectCaNhan/EmailListPart2/index.html" method="post">
          <input type="submit" value="Return">
        </form>

    </body>
</html>
