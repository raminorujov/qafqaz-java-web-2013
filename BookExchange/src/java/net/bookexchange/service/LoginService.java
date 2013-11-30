/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.service;

import net.bookexchange.domain.User;

/**
 *
 * @author raminorujov
 */
public interface LoginService {
    User login(String username, String password);
}
