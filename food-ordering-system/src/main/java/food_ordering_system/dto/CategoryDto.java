package com.jumpstart.food_ordering_system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// A DTO (Data Transfer Object) carries data between layers.
// It keeps the database entity separate from what the client sees.
public class CategoryDto {

    private Long id;

    // Validation: name must not be blank and must be 2-50 characters
    @NotBlank(message = "Category name is required")
    @Size(min = 2, max = 50, message = "Name must be 2-50 characters")
    private String name;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}