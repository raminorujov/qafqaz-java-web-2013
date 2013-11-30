/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import net.bookexchange.database.DatabaseUtility;
import net.bookexchange.database.MySqlRegistrationDao;
import net.bookexchange.database.RegistrationDao;
import net.bookexchange.domain.RegistrationForm;
import net.bookexchange.service.DefaultRegistrationService;
import net.bookexchange.service.RegistrationService;

/**
 *
 * @author raminorujov
 */
public class ControllerServlet extends HttpServlet {

    
    private RegistrationForm readRegistrationData(HttpServletRequest request) {
        RegistrationForm form = new RegistrationForm();
        
        if(request.getParameter("username") != null) {
            form.setUsername(request.getParameter("username").trim());
        }
        
        if(request.getParameter("name") != null) {
            form.setName(request.getParameter("name").trim());
        }
        
        if(request.getParameter("surname") != null) {
            form.setSurname(request.getParameter("surname").trim());
        }
        
        if(request.getParameter("email") != null) {
            form.setEmail(request.getParameter("email").trim());
        }
        
        if(request.getParameter("password") != null) {
            form.setPassword(request.getParameter("password").trim());
        }
        
        if(request.getParameter("passwordConfirmation") != null) {
            form.setPasswordConfirmation(request.getParameter("passwordConfirmation").trim());
        }
        
        if(request.getParameter("about") != null) {
            form.setAbout(request.getParameter("about").trim());
        }
        
        if(request.getParameter("captcha") != null) {
            form.setCaptcha(request.getParameter("captcha").trim());
        }
        
        return form;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            DataSource ds = DatabaseUtility.connect();
            RegistrationDao registrationDao = new MySqlRegistrationDao(ds);
            RegistrationService registrationService = new DefaultRegistrationService(registrationDao);
            
            
            HttpSession session = request.getSession();
            String action = "";
            
            if(request.getParameter("action") != null) {
                action = request.getParameter("action").trim();
            }
            
            
            if(action.equals("register")) {
                // Action plan
                // 1.read registration form data
                // 2.validate form data
                // 3.process registration business logic
                // 4.redirect/forward user to required page
                
                //1.read registration form data
                RegistrationForm form = readRegistrationData(request);
                
                Map<String, List<String>> errors = ValidationUtility.validateRegistrationForm(form);
                
                if(!registrationService.isUniqueUsername(form.getUsername())) {
                    errors.get("username").add("Username must be unique");
                }
                
                boolean isValidForm = true;
                
                for(String key : errors.keySet()) {
                    List<String> validationErrors = errors.get(key);
                    if(!validationErrors.isEmpty()) {
                        isValidForm = false;
                        break;
                    }
                }
                
                // 3.process registration business logic
                // 3a.if data is valid, continue registration processing
                // 3b.save reg data and redirect user to registration page, show errors
                if(isValidForm) {
                    // 3a.if data is valid, continue registration processing
                    boolean success = registrationService.register(form);
                    String registrationResult = "";
                    if(success) {
                        registrationResult = "You've successfully registered";
                    } else {
                        registrationResult = "Your registration failed. Please try again or contact support";
                    }
                    
                    RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
                    request.setAttribute("message", registrationResult);
                    rd.forward(request, response);
                } else {
                    // 3b.save reg data and redirect user to registration page, show errors
                    session.setAttribute("registrationErrors", errors);
                    session.setAttribute("registrationForm", form);
//                    response.sendRedirect("register.jsp");
                    response.sendRedirect("register.jsp");
                }
                
            } else {
                
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {            
            out.close();
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
