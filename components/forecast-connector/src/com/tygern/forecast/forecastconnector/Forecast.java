package com.tygern.forecast.forecastconnector;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Forecast {
        @JsonProperty("temperature") private float temperature;
        @JsonProperty("description") private String description;

        public float getTemperature() {
                return temperature;
        }

        public void setTemperature(float temperature) {
                this.temperature = temperature;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }
}
