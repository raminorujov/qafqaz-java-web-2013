<%-- 
    Document   : result
    Created on : Oct 26, 2013, 11:20:31 AM
    Author     : raminorujov
--%>

<%@page import="java.util.List"%>
<%@page import="mvcdemo.domain.ExamResult"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam result page</title>
    </head>
    <body>
        <h1>Exam results</h1>
        <%
            if(request.getAttribute("examResult") != null) {
                List<ExamResult> resultList = (List<ExamResult>) request.getAttribute("examResult");
                %>
                <table border="1">
                    <thead>
                        <td>Student No</td><td>Student name</td>
                        <td>Lesson No</td>
                        <td>Lesson code</td>
                        <td>Result</td>
                    </thead>
                <%
                out.println("<tbody>");
                for(ExamResult r : resultList) {
                    out.print("<tr>");
                    out.println("<td>" + r.getStudentNo() + "</td>");
                    out.println("<td>" + r.getStudent() + "</td>");
                    out.println("<td>" + r.getLessonNo() + "</td>");
                    out.println("<td>" + r.getLesson() + "</td>");
                    out.println("<td>" + r.getResult() + "</td>");
                    out.println("");
                    out.println();
                    out.print("</tr>");
                }
                out.println("</tbody>");
                %>
                </table>
                <%
            }
        %>
    </body>
</html>
