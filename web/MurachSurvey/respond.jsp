<%-- 
    Document   : respond
    Created on : Sep 6, 2024, 8:27:41 AM
    Author     : HUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respond Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/style/survey.css" type="text/css">
    </head>
    <body>
        <h1>Thank for joining our survey</h1>
        <p>You have known us through: ${customerInfo.heared}</p>
        <p>Here is  the information that you entered</p>
        <label class="lblInfo">Email:</label>
        <span>${customerInfo.email}</span><br>
        <label class="lblInfo">First Name:</label>
        <span>${customerInfo.firstName}</span><br>
        <label class="lblInfo">Last Name:</label>
        <span>${customerInfo.lastName}</span><br>
        <label class="lblInfo">Day of Birth:</label>
        <span>${customerInfo.birth}</span><br>
        <label>Your requires: </label><br>
        <p>${customerInfo.like}</p>
        <p>${customerInfo.contact}</p>
        <h1>${customerInfo.respond}</h1>
    </body>
</html>