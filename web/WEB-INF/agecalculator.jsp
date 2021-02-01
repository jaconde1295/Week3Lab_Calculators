<%-- 
    Document   : agecalculator
    Created on : Jan 30, 2021, 11:43:01 PM
    Author     : 631503
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age Next Birthday">
        </form>
        <p>${message}</p>  
        <p><a href="arithmetic">Arithmetic Calculator</a></p> 
    </body>
</html>
