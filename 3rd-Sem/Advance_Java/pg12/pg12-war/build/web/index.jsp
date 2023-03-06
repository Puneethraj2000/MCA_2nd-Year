<%-- 
    Document   : index
    Created on : 6 Mar, 2023, 2:41:31 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="MsgServlet">
            <table cellspacing = "20">
                <tbody>
                    <tr>
                        <td>Enter Message:</td>
                        <td>
                            <input type = "text" name = "message" value = "Enter your message here" width = "30" />
                        </td>
                    </tr>
                </tbody>
            </table>
            <input type ="submit" value = "Send the Message" name ="send" />
        </form>
        </center>
    </body>
</html>
