package org.coldstone.springboot.saml.okta.user;

/**
 *
 */
public class User {

    private Long id;

    private String username;

    private String emailId;

    public User(Long id, String username, String emailId) {
        this.id = id;
        this.username = username;
        this.emailId = emailId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
