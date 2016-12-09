package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Lou-Evans on 09/12/2016.
 */
@Entity
public class WeatherEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String timezone;
    private int time;
    private double temperature;
    private String summary;
    private String day;
}
