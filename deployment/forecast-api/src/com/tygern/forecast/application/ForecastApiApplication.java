package com.tygern.forecast.application;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
@ComponentScan("com.tygern")
public class ForecastApiApplication {
    private final Logger logger = getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(ForecastApiApplication.class, args);
    }

}
