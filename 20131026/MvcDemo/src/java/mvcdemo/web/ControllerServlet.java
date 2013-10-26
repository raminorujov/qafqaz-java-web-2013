package mvcdemo.web;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvcdemo.domain.ExamResult;
import mvcdomain.service.ExamService;

/**
 *
 * @author raminorujov
 */
public class ControllerServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = "";
        
        if(request.getParameter("action") != null) {
            action = request.getParameter("action");
        }
        
        if(action.equals("getExamResult")) {
            
//            process exam result action
//            get exam id from request parameter
//            validate exam id
                    
            String id =  request.getParameter("id");
            int examId = 0;
            boolean isValid = false;
            if(id != null) {
                try {
                    examId = Integer.parseInt(id);
                    isValid = true;
                } catch(NumberFormatException e) {
                    isValid = false;
                }                                
            } 
            
            if(isValid) {
//                get exam result from model
                ExamService examService = new ExamService();
                List<ExamResult> resultList = examService.getExamResult(examId);
                request.setAttribute("examResult", resultList);
//                forward to view for showing exam result
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/exam/result2.jsp");
                rd.forward(request, response);
            } else {
//                save error 
//                forward to error page
            }            
            
        } else if(action.equals("updateExamResult")) {
        
        } else {
            response.sendRedirect("index.jsp");
        }        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }   
}
