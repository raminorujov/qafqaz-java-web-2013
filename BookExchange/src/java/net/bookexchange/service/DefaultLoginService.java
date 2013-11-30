/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.service;

import net.bookexchange.database.LoginDao;
import net.bookexchange.domain.User;

/**
 *
 * @author raminorujov
 */
public class DefaultLoginService implements LoginService {
    
    private LoginDao loginDao;
    
    public DefaultLoginService(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
    
    @Override
    public User login(String username, String password) {
        return loginDao.login(username, password);
    }           
}
