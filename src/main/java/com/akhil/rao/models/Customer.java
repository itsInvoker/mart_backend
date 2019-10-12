package com.akhil.rao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Column(unique = true)
    private String username;
    private String password;
    private Date dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Customer(int id, String name, String username, String password, Date dob) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.dob = dob;
    }

    public Customer() {
    }
}