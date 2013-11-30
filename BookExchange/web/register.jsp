<%-- 
    Document   : register
    Created on : Nov 23, 2013, 2:40:11 PM
    Author     : raminorujov
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
                                <fieldset>  
                                    <c:choose>
                                        <c:when test="${not empty sessionScope.registrationErrors.username}">
                                            <div class="control-group error">
                                                <label class="control-label" for="username">Username </label>
                                                <div class="controls">
                                                    <input type="text" class="input-xlarge" id="username" name="username" value="${sessionScope.registrationForm.username}">
                                                    <span class="help-inline">
                                                        <c:forEach var="err" items="${sessionScope.registrationErrors.username}">
                                                            ${err} <br/>
                                                        </c:forEach>
                                                    </span>

                                                </div>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="control-group">
                                                <label class="control-label" for="username">Username </label>
                                                <div class="controls">
                                                    <input type="text" class="input-xlarge" id="username" name="username">                                                   
                                                </div>
                                            </div>
                                        </c:otherwise>

                                    </c:choose> 

                                    <c:choose>
                                        <c:when test="${not empty sessionScope.registrationErrors.name}">
                                            <div class="control-group error">
                                                <label class="control-label" for="name">Name </label>
                                                <div class="controls">
                                                    <input type="text" class="input-xlarge" id="name" name="name" value="${sessionScope.registrationForm.name}">

                                                    <c:if test="${not empty sessionScope.registrationErrors.name}">
                                                        <span class="help-inline">
                                                            <c:forEach var="err" items="${sessionScope.registrationErrors.name}">
                                                                ${err} <br/>
                                                            </c:forEach>
                                                        </span>
                                                    </c:if> 
                                                </div>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="control-group">
                                                <label class="control-label" for="name">Name </label>
                                                <div class="controls">
                                                    <input type="text" class="input-xlarge" id="name" name="name">            
                                                </div>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${not empty sessionScope.registrationErrors.surname}">
                                            <div class="control-group error">
                                                <label class="control-label" for="surname">Surname </label>
                                                <div class="controls">
                                                    <input type="text" class="input-xlarge" id="surname" name="surname" value="${sessionScope.registrationForm.surname}">

                                                    <c:if test="${not empty sessionScope.registrationErrors.surname}">
                                                        <span class="help-inline">
                                                            <c:forEach var="err" items="${sessionScope.registrationErrors.surname}">
                                                                ${err} <br/>
                                                            </c:forEach>
                                                        </span>
                                                    </c:if> 
                                                </div>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="control-group">
                                                <label class="control-label" for="surname">Surname </label>
                                                <div class="controls">
                                                    <input type="text" class="input-xlarge" id="surname" name="surname">            
                                                </div>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                    

                                    <div class="control-group">
                                        <label class="control-label" for="email">Email </label>
                                        <div class="controls">
                                            <input type="text" class="input-xlarge" id="email" name="email">

                                            <c:if test="${not empty sessionScope.registrationErrors.email}">
                                                <span class="help-inline">
                                                    <c:forEach var="err" items="${sessionScope.registrationErrors.email}">
                                                        ${err} <br/>
                                                    </c:forEach>
                                                </span>
                                            </c:if> 
                                        </div>
                                    </div>

                                    <div class="control-group">
                                        <label class="control-label" for="password">Password </label>
                                        <div class="controls">
                                            <input type="password" class="input-xlarge" id="password" name="password">

                                            <c:if test="${not empty sessionScope.registrationErrors.password}">
                                                <span class="help-inline">
                                                    <c:forEach var="err" items="${sessionScope.registrationErrors.password}">
                                                        ${err} <br/>
                                                    </c:forEach>
                                                </span>
                                            </c:if> 
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
                                            <input type="text" class="input-xlarge" id="captcha" name="captcha">
                                            <c:if test="${not empty sessionScope.registrationErrors.captcha}">
                                                <span class="help-inline">
                                                    <c:forEach var="err" items="${sessionScope.registrationErrors.captcha}">
                                                        ${err} <br/>
                                                    </c:forEach>
                                                </span>
                                            </c:if> 
                                        </div>
                                    </div>


                                    <div class="control-group">
                                        <label class="control-label" for="about">About</label>
                                        <div class="controls">
                                            <textarea class="cleditor" id="about" rows="3"></textarea>

                                            <c:if test="${not empty sessionScope.registrationErrors.about}">
                                                <span class="help-inline">
                                                    <c:forEach var="err" items="${sessionScope.registrationErrors.about}">
                                                        ${err} <br/>
                                                    </c:forEach>
                                                </span>
                                            </c:if> 

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
