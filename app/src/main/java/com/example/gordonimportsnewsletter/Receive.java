package com.example.gordonimportsnewsletter;

import android.app.Activity;

public class Receive implements java.lang.Runnable {
    private String name;
    private String textMessage;
    private String phoneNumber;

    private Activity activity;
    private String api = "";

    public Receive(Activity activity){
        this.activity = activity;
    }
    public Receive (String name, String phoneNumber, String message) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.textMessage = textMessage;
    }

    @Override
    public void run(){

    }

    public String getApi() {

    }

    // variables for our first name,
    // last name, email and avatar


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return textMessage;
    }

    public void setLocation(String location) {
        this.textMessage = textMessage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String avatar) {
        this.phoneNumber = phoneNumber;
    }


}
