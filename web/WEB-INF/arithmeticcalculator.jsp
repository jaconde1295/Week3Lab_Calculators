<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 31, 2021, 11:30:45 AM
    Author     : 631503
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="Addition" value="+">
            <input type="submit" name="Subtraction" value="-">
            <input type="submit" name="Multiplication" value="*">
            <input type="submit" name="Modulus" value="%">
        </form>
        <p>Result: ${message}</p>  
        <p><a href="age">Age Calculator</a></p> 
    </body>
</html>
