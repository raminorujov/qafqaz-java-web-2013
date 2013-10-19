/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sessiondemo;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author raminorujov
 */
public class AdminFilter implements Filter {       
   
    private FilterConfig filterConfig = null;  
   
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
       
        
        Throwable problem = null;
        try {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;
            HttpSession session = req.getSession();
            
            String username = session.getAttribute("username").toString();
            if(username.equals("mammad")) {            
                System.out.println("Allow mammad access to admin page");
                chain.doFilter(request, response);
            } else {
                System.out.println("User " + username + " doesn't have access to admin page. Redirect to access denied page.");
                res.sendRedirect("accessDenied.jsp");
            }   
        } catch (Throwable t) {
            
            problem = t;
            t.printStackTrace();
        }        
    }

    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;       
    }

}
