package com.mazzie.moviedatabase.entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class DBUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userID")
    private Integer userID;

    @Column(name = "username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

       /* @OneToMany(fetch = FetchType.LAZY)
        @JoinColumn(name="userID")
        private MovieReaction movieReaction;*/

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


