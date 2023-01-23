<%-- 
    Document   : callApplet
    Created on : 23 Jan, 2023, 3:35:43 PM
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
        <jsp:plugin type="applet" code="call.class" codebase="test" height="400" width="700">
            <jsp:fallback>
                Plugin tag not supported
            </jsp:fallback>
        </jsp:plugin>
        <h4><font color = "red">
            The above applet is loaded using the java plugin from a jsp page using the plugin tag.
        </font></h4>
    </body>
</html>
