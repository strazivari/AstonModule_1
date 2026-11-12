package org.example;

import java.util.Objects;

public class ValidationUtils {
    public static String verifyData(String value) {
        Objects.requireNonNull(value, "Exception - Data is null");

        if (value.isBlank()) {
            throw new IllegalArgumentException("Data is empty");
        }

        return value;
    }
}
