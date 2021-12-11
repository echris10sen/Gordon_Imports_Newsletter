package com.example.gordonimportsnewsletter;

import android.app.Activity;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.Spreadsheet;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

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
        try {
            Receive.test();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }

    public void getApi() {

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

    public static void test() throws IOException, GeneralSecurityException {
        // The spreadsheet to request.
        String spreadsheetId = "1O9wDZGr2eWvkOIHKdQ2EIMjw50KOnuPpojvwj-byKj0"; // TODO: Update placeholder value.

        // The ranges to retrieve from the spreadsheet.
        List<String> ranges = new ArrayList<>(); // TODO: Update placeholder value.
        ranges.add("A2:C3");

        // True if grid data should be returned.
        // This parameter is ignored if a field mask was set in the request.
        boolean includeGridData = false; // TODO: Update placeholder value.

        Sheets sheetsService = createSheetsService();
        Sheets.Spreadsheets.Get request = sheetsService.spreadsheets().get(spreadsheetId);
        request.setRanges(ranges);
        request.setIncludeGridData(includeGridData);

        Spreadsheet response = request.execute();

        // TODO: Change code below to process the `response` object:
        System.out.println(response);
    }

    public static Sheets createSheetsService() throws IOException, GeneralSecurityException {
        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        JsonFactory jsonFactory = new JacksonFactory();

        // TODO: Change placeholder below to generate authentication credentials. See
        // https://developers.google.com/sheets/quickstart/java#step_3_set_up_the_sample
        //   "https://www.googleapis.com/auth/spreadsheets.readonly"
        GoogleCredential credential = new GoogleCredential().setAccessToken("AIzaSyC6EprcaT_R8V1jeesJY-vl3HP6bph6jP0");


        return new Sheets.Builder(httpTransport, jsonFactory, credential)
                .setApplicationName("Google-SheetsSample/0.1")
                .build();
    }


}
