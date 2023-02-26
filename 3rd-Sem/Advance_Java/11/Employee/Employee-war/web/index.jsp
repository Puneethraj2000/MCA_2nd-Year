<%-- 
    Document   : form
    Created on : 20 Feb, 2023, 2:47:36 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="pink">
        <h1>calculator</h1>
        <form action="CalculatorServlet" method="post">
            <table>
                <tr>
                    <td>Enter first value:</td>
                    <td><input type="text" name="num1" size="25"/></td>
                </tr>
                <tr>
                    <td>Enter second value:</td>
                    <td><input type="text" name="num2" size="25"/></td>
                </tr>
                <tr>
                    <b>select your choice:</b><br><br>
                    <input type="radio" name="group" value="add"/>Addition<br></td></tr>
                    <input type="radio" name="group" value="sub"/>Subtraction<br></td></tr>
                    <input type="radio" name="group" value="mul"/>Multiplication<br></td></tr>
                    <input type="radio" name="group" value="div"/>Division<br></td></tr>
                    <tr>
                        <td><input type="submit" value="Submit"</td>
                        <td><input type="reset" value="clear"/></td>
                    </tr>
                    </table>
        </form>
    </body>
</html>
