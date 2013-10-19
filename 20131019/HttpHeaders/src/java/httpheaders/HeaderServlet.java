/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package httpheaders;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author raminorujov
 */
public class HeaderServlet extends HttpServlet {

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
            out.println("<title>Servlet HeaderServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HeaderServlet at " + request.getContextPath() + "</h1>");
            
            out.println("<h1>Request headers</h1>");
            Enumeration<String> requestHeaders = request.getHeaderNames();
            while(requestHeaders.hasMoreElements()) {
                String headerName = requestHeaders.nextElement();
                String headerValue = request.getHeader(headerName);
                out.println(headerName + " = " + headerValue + "<br/>");
            }
            
            response.addHeader("X-POWERED-BY", "QU Computer Engineers :) ");
            out.println("<h1>Response headers</h1>");
            Collection<String> responseHeaders = response.getHeaderNames();
            Iterator<String> iterator = responseHeaders.iterator();
            while(iterator.hasNext()) {
                String headerName = iterator.next();
                String headerValue = response.getHeader(headerName);
                out.println(headerName + " = " + headerValue + "<br/>");
            }
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
