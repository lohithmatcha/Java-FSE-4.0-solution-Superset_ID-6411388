package com.loui.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        int result = 3 + 4;
        assertEquals(7, result);
    }
}
