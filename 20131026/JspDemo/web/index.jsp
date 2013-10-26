<%-- 
    Document   : index
    Created on : Oct 26, 2013, 12:40:15 PM
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
        
        <%-- JSP comment --%>        
        <!-- HTML comment -->
        
       
        
        <%-- JSP expression --%>
        <%=hello()%> &nbsp; Welcome to java world!
        
        <%=5+15%>
        
        <%
            //Java scriptlet
            int a = 5;
            if(a > 10) {
                out.println(a + " > 10");
            } else {
                out.println(a + " < 10");
            }
        %>
        
         <%!
            // JSP declaration block
            public String hello() {
                return "hello";
            }
        %>
        
    </body>
</html>
