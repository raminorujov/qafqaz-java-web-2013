/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.database;

import net.bookexchange.domain.RegistrationForm;

/**
 *
 * @author raminorujov
 */
public interface RegistrationDao {
    
    public boolean isUniqueUsername(String username);
    
    public boolean register(RegistrationForm form);
    
}
