/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bookexchange.domain;

/**
 *
 * @author raminorujov
 */
public class User extends BaseDomain {
    private static final long serialVersionUID = -6989060742595185677L;
    private String name;
    private String surname;
    private String username;
    private String about;
    private String email;
    private String facebookProfile;
    
    
    public User() {
        this.name = "";
        this.surname = "";
        this.username = "";
        this.about = "";
        this.facebookProfile = "";
        this.email = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookProfile() {
        return facebookProfile;
    }

    public void setFacebookProfile(String facebookProfile) {
        this.facebookProfile = facebookProfile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", username=" + username + ", about=" + about + ", email=" + email + ", facebookProfile=" + facebookProfile + '}';
    }    
    
    
}
