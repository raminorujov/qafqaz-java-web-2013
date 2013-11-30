/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.database;

/**
 *
 * @author raminorujov
 */
public class SqlQuery {
    public static final String LOGIN = "SELECT id, name, surname, about, email FROM manads_beta.BE_USER where username = ? and passwd = ?";
}
