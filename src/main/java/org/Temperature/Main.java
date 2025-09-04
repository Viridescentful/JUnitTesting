package org.Temperature;
import org.Temperature.Converter;

public class Main {
    public static void main(String[] args) {
        Converter newConverter = new Converter();

        double celsius = 30.0;
        double fahrenheit = 86.0;

        System.out.println(newConverter.celsiusToFahrenheit(celsius));
        System.out.println(newConverter.fahrenheitToCelsius(fahrenheit));

        System.out.println(newConverter.isExtreme(celsius));
    }
}
