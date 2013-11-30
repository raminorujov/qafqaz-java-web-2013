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
    public static final String LOGIN = "SELECT id, name, surname, about, email FROM book_exhange.BE_USER where username = ? and passwd = ?";
    
    public static final String CHECK_USERNAME = "SELECT id FROM book_exhange.BE_USER where username = ?";
    
    public static final String REGISTER_USER = "insert into book_exhange.BE_USER(id, name, surname, username, passwd, email, about) values(null, ?, ?, ?, ?, ?, ?);";
}
