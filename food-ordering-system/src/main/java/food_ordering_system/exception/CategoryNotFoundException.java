package com.jumpstart.food_ordering_system.exception;

// Custom exceptions give us more meaningful error messages.
// Instead of a generic error, we can tell the user exactly what went wrong.
public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(String message) {
        super(message);
    }
}
