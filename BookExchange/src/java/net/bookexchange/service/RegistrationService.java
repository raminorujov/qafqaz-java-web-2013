/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.service;

import net.bookexchange.domain.RegistrationForm;

/**
 *
 * @author raminorujov
 */
public interface RegistrationService {
 
    public boolean isUniqueUsername(String username);
    
    public boolean register(RegistrationForm form);
}
