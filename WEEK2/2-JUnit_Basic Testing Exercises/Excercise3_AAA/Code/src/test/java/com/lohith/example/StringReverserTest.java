package com.lohith.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class StringReverserTest {
    private StringReverser reverser;

    @Before
    public void setUp() {
        reverser = new StringReverser();
    }

    @After
    public void tearDown() {
        reverser = null;
    }

    @Test
    public void testReverseNormalString() {
        // Arrange
        String input = "hello";

        // Act
        String output = reverser.reverse(input);

        // Assert
        assertEquals("olleh", output);
    }

    @Test
    public void testReverseEmptyString() {
        // Arrange
        String input = "";

        // Act
        String output = reverser.reverse(input);

        // Assert
        assertEquals("", output);
    }

    @Test
    public void testReverseNull() {
        // Arrange
        String input = null;

        // Act
        String output = reverser.reverse(input);

        // Assert
        assertNull(output);
    }
}
