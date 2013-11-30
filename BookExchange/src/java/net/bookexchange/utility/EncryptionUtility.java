/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.utility;

import java.security.*;

/**
 *
 * @author raminorujov
 */
public class EncryptionUtility {
    
    public static String sha1(String input) {
        String hash = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");            
            digest.update(input.getBytes());
            hash = new String(digest.digest());
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        
        return hash;

    }
}
