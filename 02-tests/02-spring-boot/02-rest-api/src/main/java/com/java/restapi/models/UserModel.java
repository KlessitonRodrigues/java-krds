package com.java.restapi.models;

import java.util.Date;

public class UserModel {
    private long userId;
    private String userName;
    private String userPhone;
    private String userEmail;

    public UserModel(String name, String phone, String email) {
        this.userName = name;
        this.userPhone = phone;
        this.userEmail = email;

        this.userId = new Date().getTime();
    }

    public long getId() {
        return this.userId;
    }

    public String getName() {
        return this.userName;
    }

    public String getPhone() {
        return this.userPhone;
    }

    public String getEmail() {
        return this.userEmail;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public void setPhone(String phone) {
        this.userPhone = phone;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }
}
