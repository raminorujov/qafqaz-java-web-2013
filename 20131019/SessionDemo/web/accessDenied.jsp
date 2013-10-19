<%-- 
    Document   : accessDenied
    Created on : Oct 19, 2013, 1:54:39 PM
    Author     : raminorujov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access Denied!!!</title>
    </head>
    <body>
        <h3>
            Dear ${sessionScope.username}, sorry, you don't have access to admin page.
            Please, contact administrator for additional information.
        </h3>
    </body>
</html>
