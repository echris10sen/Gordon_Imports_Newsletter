package com.example.gordonimportsnewsletter;

import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public String string = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String apiKey = "1O9wDZGr2eWvkOIHKdQ2EIMjw50KOnuPpojvwj-byKj0";
    private String sheetUrl = "https://sheets.googleapis.com/v4/spreadsheets/1O9wDZGr2eWvkOIHKdQ2EIMjw50KOnuPpojvwj-byKj0/?fields=sheets.properties.title"

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
        String url = ""
    }


}
// Third attempt
// Awesome job Eric
// This is my second attempt to push it.

/*

public class MainActivity extends AppCompatActivity {


    private Button temp;
    private Button wethforc;
    private TextView tempResults;
    private ListView forecastResults;
    private EditText city;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp = (Button) findViewById(R.id.tempbut);
        wethforc = (Button) findViewById(R.id.weatherForcast);
        tempResults = (View) findViewById(R.id.tempView);
        forecastResults = (ListView) findViewById(R.id.displayBox);
        city = (EditText) findViewById(R.id.cityName);
    }

    private final String key = "&apiKey=12458339b3d9f04ad5c9a013d4b6463d";
    private final String baseUrl = "https://api.openweathermap.org/data/2.5/weather?q=";
    private Gson gson;
    private List<WeatherForecastSummary> summaries;
    private HTTPHelper httpHelper;

    void WeatherManager() {
        gson = new Gson();
        httpHelper = new HTTPHelper();
        summaries = new ArrayList<WeatherForecastSummary>();
    }

    public void updateActivityDisplay(WeatherConditions conditions) {
        //pull temperature out of conditions
        Float value = conditions.getMeasurements().get("temp");
        Toast.makeText(this, "temperature" +  value, Toast.LENGTH_SHORT).show();
    }

    public void updateForecastListView(WeatherForecast forecast) {
        ArrayAdapter<WeatherForecastItem> adapter = new ArrayAdapter<WeatherForecastItem>(this, android.R.layout.simple_list_item_1, forecast.getForecastItems());
        forecastResults.setAdapter(adapter);
    }

    public void weatherCaller(View view) {
        String userInputCity = city.getText().toString();
        WeatherManager weathermanager = new WeatherManager(this, userInputCity, true);
        weathermanager.start();
    }

    public void forecastCaller(View view) {
        String userInputCity = city.getText().toString();
        WeatherManager weathermanager = new WeatherManager(this, userInputCity, false);
        weathermanager.start();

    }
}
 */