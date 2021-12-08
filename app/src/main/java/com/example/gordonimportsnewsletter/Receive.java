package com.example.gordonimportsnewsletter;

import android.app.Activity;

public class Receive implements java.lang.Runnable {
    public Receive (String name, String location, String email, String phoneNumber) {
        this.name = name;
        this.location = location;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    private Activity activity;

    @Override
    public void run(){

    }

    // variables for our first name,
    // last name, email and avatar
    private String name;
    private String location;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String avatar) {
        this.phoneNumber = phoneNumber;
    }


}
