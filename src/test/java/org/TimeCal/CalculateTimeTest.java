package org.TimeCal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTimeTest {
    CalculateTime calc;

    @BeforeEach
    void setUp() {
        calc = new CalculateTime();
    }

    @Test
    void calculateTime() {
        assertEquals(1.5, calc.calculateTime(150.0, 100.0));
    }
}