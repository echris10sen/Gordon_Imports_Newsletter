package com.example.gordonimportsnewsletter;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.SmsManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class Send implements java.lang.Runnable{
    private Activity activity;
    public Send(Activity activity) {this.activity = activity;}

    public String mobileNumber = "9717575846";
    public String msg = "Test!";
    @Override
    public void run() {

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(mobileNumber, null, msg,null, null);
        System.out.println("hello");
    }

    public void sendSMSMessage() {
      //  if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED)
      //  {
      //      if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.SEND_SMS)) {
      //      }
       //     else{
      //          ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},MY_PERMISSIONS_REQUEST_SEND_SMS);
      //      }
      }
    }

   // @Override
   // public void onRequestPermissionsResult () {

   // }

