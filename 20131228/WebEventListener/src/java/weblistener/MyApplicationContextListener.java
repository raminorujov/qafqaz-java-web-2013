/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weblistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author raminorujov
 */
@WebListener()
public class MyApplicationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("My web app is initialized");
        sce.getServletContext().setAttribute("counter", 0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("My web app is destroyed");
        sce.getServletContext().removeAttribute("counter");
    }
}
