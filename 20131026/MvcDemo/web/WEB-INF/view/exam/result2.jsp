<%-- 
    Document   : result2
    Created on : Oct 26, 2013, 1:17:49 PM
    Author     : raminorujov
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam result page</title>
    </head>
    <body>
        <h1>Exam results</h1>
        
        <c:if test="${not empty requestScope.examResult}">
            <table border="1">
                <thead>
                <td>No</td>    
                    <td>Student No</td>
                        <td>Student name</td>
                        <td>Lesson No</td>
                        <td>Lesson</td>
                        <td>Result</td>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.examResult}" var="r" varStatus="status">
                        <tr>
                            <td>${status.index+1}</td>
                            <td>${r.studentNo}</td>
                            <td>${r.student}</td>
                            <td>${r.lessonNo}</td>
                            <td>${r.lesson}</td>
                            <td>${r.result}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    
    </body>
</html>
