package com.jumpstart.food_ordering_system.controller;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import com.jumpstart.food_ordering_system.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
// Category REST Controller - handles HTTP requests for categories
// The controller is the entry point of the application.
// It receives HTTP requests from the client and returns responses.
// This controller handles all requests that start with /api/category
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    // Spring automatically injects the service here
    @Autowired
    private CategoryService categoryService;

    // This method handles GET requests to /api/category
    // It returns a list of all categories from the database
    @GetMapping
    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }
}


