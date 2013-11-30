/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.database;

import net.bookexchange.domain.User;

/**
 *
 * @author raminorujov
 */
public interface LoginDao {
    User login(String username, String password); 
    
}
