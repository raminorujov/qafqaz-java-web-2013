/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.domain;

import java.io.Serializable;

/**
 *
 * @author raminorujov
 */
public class BaseDomain implements Serializable {
    private static final long serialVersionUID = -2165477053388880248L;
    
    protected long id;
    protected Status status;
    
}
