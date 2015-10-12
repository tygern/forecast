package com.tygern.forecast.application;

import com.tygern.forecast.forecastconnector.ForecastSource;
import com.tygern.forecast.weatherhttpadapter.WeatherAdapter;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
@ComponentScan("com.tygern")
public class ForecastApiApplication {
    private final Logger logger = getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(ForecastApiApplication.class, args);
    }

    @Bean
    public ForecastSource forecastSource(
            @Value("${forecast.url}") String forecastUrl,
            @Value("${forecast.apiKey}") String forecastApiKey
    ) {
        return new WeatherAdapter(
                new RestTemplate(),
                forecastUrl,
                forecastApiKey
        );
    }
}
