package com.tygern.forecast.forecastconnector;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Forecast {
    private double temp;

    @JsonProperty("temp_min")
    private double tempMin;

    @JsonProperty("temp_max")
    private double tempMax;

    public double getTemp() {
        return toCelcius(temp);
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTempMin() {
        return toCelcius(tempMin);
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return toCelcius(tempMax);
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    private double toCelcius(double tempKelvin) {
        return tempKelvin - 273.15;
    }
}
