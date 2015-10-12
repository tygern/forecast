package com.tygern.forecast.weatherservice;

import com.tygern.forecast.forecastconnector.Forecast;
import com.tygern.forecast.forecastconnector.ForecastSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {

    @Autowired
    ForecastSource forecastSource;

    @RequestMapping(value = "/weather/today", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Forecast today() {
        return forecastSource.getForecast();
    }
}
