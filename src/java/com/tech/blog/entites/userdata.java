
package com.tech.blog.entites;
import java.sql.*;

public class userdata {

    private String name;
    private String email;
    private String password;
    private String gender;
    private Date date;


    public userdata(String name, String email, String password, String gender, Date date) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.date = date;
    }

    public userdata(String name, String email, String password, String gender)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public userdata() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
   
    
}
