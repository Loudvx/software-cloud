package com.example.controller;

import org.springframework.web.client.RestTemplate;

/**
 * Created by Lou-Evans on 09/12/2016.
 */


public class WeatherController {

    private static void getEmployees()
    {
        final String uri = "http://localhost:8080/springrestexample/employees.xml";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }
}
