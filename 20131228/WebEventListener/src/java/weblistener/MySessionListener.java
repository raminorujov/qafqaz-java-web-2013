/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weblistener;

import java.util.Date;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author raminorujov
 */
@WebListener()
public class MySessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        session.setMaxInactiveInterval(10);
        System.out.println("New session " + session.getId() + " is created at " + new Date(session.getCreationTime()));
                
        Object mylock = new Object();
        synchronized(mylock){
            int counter = new Integer(se.getSession().getServletContext().getAttribute("counter").toString());
            counter++;
        
            se.getSession().getServletContext().setAttribute("counter", counter);
            System.out.println("counter = " + counter);
        }        
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("Session " + session.getId() + " is destroyed at " + new Date(session.getLastAccessedTime()));
                       
        Object mylock = new Object();
        synchronized(mylock){
            int counter = new Integer(se.getSession().getServletContext().getAttribute("counter").toString());
            counter--;
        
            se.getSession().getServletContext().setAttribute("counter", counter);        
            System.out.println("counter = " + counter);
        }        
    }
}
