<%-- 
    Document   : file2
    Created on : 2 Jan, 2023, 3:00:16 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: grey">
    <center><br><br><br><br>
        <h2><b>STUDENT DETAILS RETRIEVED FROM STUDENT BEAN</b></h2> 
        <jsp:useBean id="stud" scope="session" class="program.StudentBean" />
        <table>
            <tr><td>STUDENT NAME:</td><td><jsp:getProperty name="stud" property="name" /></td></tr>
            <tr><td>USN:</td><td><jsp:getProperty name="stud" property="usn" /></td></tr>
            <tr><td>BRANCH:</td><td><jsp:getProperty name="stud" property="branch" /></td></tr>
            <tr><td>EMAIL ID:</td><td><jsp:getProperty name="stud" property="email" /></td></tr>
            <tr><td>CONTACT NUMBER:</td><td><jsp:getProperty name="stud" property="phone" /></td></tr>
        </table>
    </center>
    </body>
</html>
