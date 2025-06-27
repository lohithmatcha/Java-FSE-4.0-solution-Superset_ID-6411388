package com.lohith.example;

/**
 * Simple utility class that reverses a string.
 */
public class StringReverser {

    public String reverse(String input) {
        if (input == null)
            return null;
        return new StringBuilder(input).reverse().toString();
    }
}
