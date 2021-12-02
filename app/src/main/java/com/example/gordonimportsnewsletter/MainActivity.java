package com.example.gordonimportsnewsletter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void buttonSend(View view){
        Intent intent = new Intent(this, SendActivity.class);
        startActivity(intent);
        //new Thread(new Send(this)).start();
    }
    
    public void buttonReceive(View view){
        new Thread(new Receive(this)).start();
    }

}