package com.example;

import com.example.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Lou-Evans on 09/12/2016.
 */

@Controller
public class Test {

    @Autowired
    public WeatherRepository weatherRepository;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "test meteo  " +
                weatherRepository.findAll().get(0);
    }

    public Test() {
    }
}
