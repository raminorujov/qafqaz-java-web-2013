<%-- 
    Document   : register
    Created on : Nov 23, 2013, 2:40:11 PM
    Author     : raminorujov
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="common/meta.jsp"/>
        <jsp:include page="common/style.jsp"/>		
    </head>

    <body>
        <div class="container-fluid">
            <div class="row-fluid">

                <div class="row-fluid">
                    <div class="span12 center login-header">
                        <h2>Book Exchange Registration Page</h2>
                    </div><!--/span-->
                </div><!--/row-->

                <div class="row-fluid sortable">
                    <div class="box span12">
                        <div class="box-header well" data-original-title>
                            <h2><i class="icon-edit"></i>Registration form</h2>                            
                        </div>
                        <div class="box-content">
                            <form class="form-horizontal" method="POST" action="cs?action=register">
                                <%
                                    Map<String, List<String>> errors = (Map<String, List<String>>) session.getAttribute("registrationErrors");
                                %>
                            <!--<form class="form-horizontal" method="POST" action="register">-->
                                <fieldset>                                   
                                    <div class="control-group">
                                        <label class="control-label" for="username">Username </label>
                                        <div class="controls">
                                            <input type="text" class="input-xlarge" id="username" name="username">
                                            
                                            <%
                                                if(errors != null) {
                                                List<String> userErrors = errors.get("username");
                                                
                                                if(userErrors != null && !userErrors.isEmpty()) {                                                                                                   
                                            %>
                                            <span class="help-inline"><%
                                                    for(String err : userErrors) {
                                                        out.print(err + "<br/>");
                                                    }
                                            %></span>
                                            <% } }%>
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" for="name">Name </label>
                                        <div class="controls">
                                            <input type="text" class="input-xlarge" id="name" name="name">
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" for="surname">Surname </label>
                                        <div class="controls">
                                            <input type="text" class="input-xlarge" id="surname" name="surname">
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" for="email">Email </label>
                                        <div class="controls">
                                            <input type="text" class="input-xlarge" id="email" name="email">
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" for="password">Password </label>
                                        <div class="controls">
                                            <input type="password" class="input-xlarge" id="password" name="password">
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" for="password">Password confirmation</label>
                                        <div class="controls">
                                            <input type="password" class="input-xlarge" id="passwordConfirmation" name="passwordConfirmation">
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" for="password">Captcha</label>
                                        <div class="controls">
                                            <input type="password" class="input-xlarge" id="captcha" name="captcha">
                                        </div>
                                    </div>

                                             
                                    <div class="control-group">
                                        <label class="control-label" for="about">About</label>
                                        <div class="controls">
                                            <textarea class="cleditor" id="about" rows="3"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-primary">Register</button>
                                        <button type="reset" class="btn">Clear</button>
                                    </div>
                                </fieldset>
                            </form>   

                        </div>
                    </div><!--/span-->
                    <!--/row-->
                </div><!--/fluid-row-->

            </div><!--/.fluid-container-->

            <jsp:include page="common/javascript.jsp"/>
    </body>
</html>
