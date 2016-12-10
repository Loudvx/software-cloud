package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Created by Lou-Evans on 09/12/2016.
 */
@Entity
@Table(name = "weather", schema = "public")
@Data
public class WeatherEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String timezone;
    private int time;
    private double temperaturemax;
    private String summary;
    private String day;
}
