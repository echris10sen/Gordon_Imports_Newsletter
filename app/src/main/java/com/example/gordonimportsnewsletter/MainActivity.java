package com.example.gordonimportsnewsletter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.gson.Gson;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;






public class MainActivity extends AppCompatActivity {
    public String string = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String apiKey = "1O9wDZGr2eWvkOIHKdQ2EIMjw50KOnuPpojvwj-byKj0";
    private String sheetUrl = "https://sheets.googleapis.com/v4/spreadsheets/1O9wDZGr2eWvkOIHKdQ2EIMjw50KOnuPpojvwj-byKj0/?fields=sheets.properties.title";

    private List<Receive> googleSheetData;

    public void buttonSend(View view){
        Intent intent = new Intent(this, SendActivity.class);
        intent.putExtra("API", string);
        startActivity(intent);
        //new Thread(new Send(this)).start();
    }
    
    public void buttonReceive(View view){
        Receive receive = new Receive(this);
        Thread thread = new Thread(receive);
        thread.start();
        try {
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void getDataFromAPI() {
    }


}
