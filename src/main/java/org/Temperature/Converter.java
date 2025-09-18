package org.Temperature;

public class Converter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double kelvinToCelsius(double kelvin) {
        return (kelvin - 273.15);
    }

    public Boolean isExtreme(double celsius) {
        return celsius > 50 || celsius < -40;
    }
}
