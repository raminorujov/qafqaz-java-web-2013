/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formprocessing;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author raminorujov
 */
public class RegistrationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationServlet</title>");
            out.println("</head>");
            out.println("<body>");

            String name = "";
            String surname = "";
            String maritalStatus = "";
            String[] foreignLanguages = null;
            String country = "";
            String[] visitedCountries = null;
            String about = "";

            if (request.getParameter("name") != null) {
                name = request.getParameter("name");
            }

            if (request.getParameter("surname") != null) {
                surname = request.getParameter("surname");
            }
            
            if(request.getParameter("maritalStatus") != null) {
                maritalStatus = request.getParameter("maritalStatus");
            }
                        
            if(request.getParameterValues("foreignLanguages") != null) {
                foreignLanguages = request.getParameterValues("foreignLanguages");
            }
            
            if(request.getParameter("country") != null) {
                country = request.getParameter("country");
            }
            
            if(request.getParameterValues("visitedCountries") != null) {
                visitedCountries = request.getParameterValues("visitedCountries");
            }
            
            if(request.getParameter("about") != null) {
                about = request.getParameter("about");
            }

            out.println("<h1>Your data</h1>");
            out.println("Name = " + name + "<br/>");
            out.println("Surname = " + surname + "<br/>");
            out.println("Marital status = " + maritalStatus + "<br/>");
            
            out.println("Foreign language skills = ");
            if(foreignLanguages != null) {
                for(String lang: foreignLanguages) {
                    out.print(lang + " ");
                }                
            }
            out.println("<br/>");
            
            out.println("Your country = " + country + "<br/>");

            out.println("Your visited countries: ");
            if(visitedCountries != null) {
                for(String c: visitedCountries) {
                    out.print(c + " ");
                }                
            }
            out.println("<br/>");
            
            out.println("About you: " + about + "<br/>");
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
