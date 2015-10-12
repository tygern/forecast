package com.tygern.forecast.weatherhttpadapter;

import com.tygern.forecast.forecastconnector.Forecast;
import com.tygern.forecast.forecastconnector.ForecastSource;
import com.tygern.forecast.forecastconnector.ForecastWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class WeatherAdapter implements ForecastSource {
    private RestTemplate restTemplate;
    String weatherUrl;
    String weatherApiKey;

    public WeatherAdapter(RestTemplate restTemplate, String weatherUrl, String weatherApiKey) {
        this.restTemplate = restTemplate;
        this.weatherUrl = weatherUrl;
        this.weatherApiKey = weatherApiKey;
    }

    public Forecast getForecast() {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(weatherUrl)
                .queryParam("q", "Dublin,ie")
                .queryParam("APPID", weatherApiKey);

        ResponseEntity<ForecastWrapper> response = restTemplate.getForEntity(uriBuilder.toUriString(), ForecastWrapper.class);

        if (!response.getStatusCode().is2xxSuccessful()) {
            return null;
        }

        return response.getBody().getMain();
    }
}
