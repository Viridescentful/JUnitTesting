package org.Temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    void celsiusToFahrenheit() {
        assertEquals(86, new Converter().celsiusToFahrenheit(30));
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(30, new Converter().fahrenheitToCelsius(86));
    }

    @Test
    void notCelsiusToFahrenheit() {
        assertNotEquals(43, new Converter().celsiusToFahrenheit(30));
    }

    @Test
    void notFahrenheitToCelsius() {
        assertNotEquals(88, new Converter().celsiusToFahrenheit(86));
    }

    @Test
    void isExtreme() {
        assertTrue(new Converter().isExtreme(60));
    }

    @Test
    void isNotExtreme() {
        assertFalse(new Converter().isExtreme(30));
    }
}