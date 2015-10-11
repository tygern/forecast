package com.tygern.forecastapi.weatherservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {
    @RequestMapping(value = "/weather/today", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String today() {
        return "rain looks likely";
    }
}
