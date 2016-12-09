package com.example;

import com.example.Entity.WeatherEntity;
import com.example.controller.WeatherController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class CloudMeteoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudMeteoApplication.class, args);

		ArrayList<WeatherEntity> weatherEntities = WeatherController.getWeather();
	}
}
