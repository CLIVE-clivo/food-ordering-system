package com.jumpstart.food_ordering_system.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

// Generic response wrapper used by all endpoints.
// <T> means this class can wrap any type of data.
// @JsonInclude removes null fields from the JSON output.
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

    // HTTP status code e.g. 200, 201, 404
    private int statusCode;

    // Human readable message describing the result
    private String message;

    // The actual data payload - can be any type
    private T data;

    // When this response was created
    private LocalDateTime timestamp;

    // Static factory method for successful responses
    public static <T> Response<T> success(String message, T data) {
        return Response.<T>builder()
                .statusCode(200)
                .message(message)
                .data(data)
                .timestamp(LocalDateTime.now())
                .build();
    }

    // Static factory method for created responses (201)
    public static <T> Response<T> created(String message, T data) {
        return Response.<T>builder()
                .statusCode(201)
                .message(message)
                .data(data)
                .timestamp(LocalDateTime.now())
                .build();
    }

    // Static factory method for error responses
    public static <T> Response<T> error(int code, String message) {
        return Response.<T>builder()
                .statusCode(code)
                .message(message)
                .timestamp(LocalDateTime.now())
                .build();
    }
}
