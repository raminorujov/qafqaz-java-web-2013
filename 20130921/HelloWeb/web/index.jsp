<%-- 
    Document   : index
    Created on : Sep 21, 2013, 10:26:42 AM
    Author     : raminorujov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="hello" method="get">
            Name: <input type="text" name="username" /> <br/>
            <input type="submit" name="send" value="Send"/> &nbsp;
            <input type="reset" name="clear" value="Clear"/>
        </form>
    </body>
</html>
