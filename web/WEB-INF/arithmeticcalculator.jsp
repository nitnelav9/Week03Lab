<%-- 
    Document   : arithmeticcalculator
    Created on : 17-Sep-2022, 2:45:32 PM
    Author     : mmval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="add">
            <input type="submit" value="-" name="sub">
            <input type="submit" value="*" name="mul">
            <input type="submit" value="%" name="per"><br>
            <a href="age">Age Calculator</a>
            <br>
            <p>Result: <span name="result">${result}</span></p>
            
        </form>
    </body>
</html>
