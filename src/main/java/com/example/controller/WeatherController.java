package com.example.controller;

import com.example.Entity.WeatherEntity;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Lou-Evans on 09/12/2016.
 */


public class WeatherController {

    public static ArrayList<WeatherEntity> getWeather()
    {
        final String uri = "https://api.forecast.io/forecast/98cc69fbd6adb6fdda5ef34e963d6b49/48.85341,2.3488";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        JSONObject forecast = new JSONObject(result);
        JSONObject currently = forecast.getJSONObject(("currently"));

        JSONObject daily = forecast.getJSONObject("daily");
        JSONArray data = daily.getJSONArray("data");

        ArrayList<WeatherEntity> weatherEntities = new ArrayList<>();
        for(int i = 0; i < data.length(); i++){
            WeatherEntity weatherEntity = new WeatherEntity();

            weatherEntity.setTimezone(forecast.getString("timezone"));
            weatherEntity.setTime(currently.getInt("time"));

            JSONObject jsonDay = data.getJSONObject(i);
            Date d = new Date((jsonDay.getLong("time"))*1000);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            weatherEntity.setSummary(jsonDay.getString("summary"));
            weatherEntity.setTemperature(jsonDay.getDouble("temperatureMax"));
            weatherEntity.setDay(df.format(d));

            weatherEntities.add(weatherEntity);
        }

        return weatherEntities;
    }
}
