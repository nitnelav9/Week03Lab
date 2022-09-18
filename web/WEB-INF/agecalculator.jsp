<%-- 
    Document   : agecalculator
    Created on : 16-Sep-2022, 10:32:58 PM
    Author     : mmval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday"><br>
            <span name="message">${message}</span>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
            
    </body>
</html>
