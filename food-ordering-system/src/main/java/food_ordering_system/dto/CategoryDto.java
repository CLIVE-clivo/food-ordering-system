package com.jumpstart.food_ordering_system.dto;

// A DTO (Data Transfer Object) is used to carry data between layers.
// Instead of sending the full entity to the client, we send a DTO.
// This keeps our database structure hidden from the outside world.
public class CategoryDto {

    private Long id;
    private String name;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}