package com.jumpstart.food_ordering_system.controller;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import com.jumpstart.food_ordering_system.response.Response;
import com.jumpstart.food_ordering_system.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controller handles all HTTP requests for /api/categories
// Every method now returns a consistent Response<T> wrapper
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // GET /api/categories - returns all categories
    @GetMapping
    public ResponseEntity<Response<List<CategoryDto>>> getAllCategories() {
        List<CategoryDto> categories = categoryService.getAllCategories();
        return ResponseEntity.ok(
                Response.success("Categories retrieved successfully", categories)
        );
    }

    // GET /api/categories/{id} - returns one category by id
    @GetMapping("/{id}")
    public ResponseEntity<Response<CategoryDto>> getCategoryById(
            @PathVariable Long id) {
        CategoryDto dto = categoryService.getCategoryById(id);
        return ResponseEntity.ok(
                Response.success("Category retrieved successfully", dto)
        );
    }

    // POST /api/categories - creates a new category
    @PostMapping
    public ResponseEntity<Response<CategoryDto>> addCategory(
            @RequestBody @Valid CategoryDto dto) {
        CategoryDto created = categoryService.addCategory(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Response.created("Category created successfully", created)
        );
    }

    // PUT /api/categories/{id} - updates an existing category
    @PutMapping("/{id}")
    public ResponseEntity<Response<CategoryDto>> updateCategory(
            @PathVariable Long id,
            @RequestBody @Valid CategoryDto dto) {
        CategoryDto updated = categoryService.updateCategory(id, dto);
        return ResponseEntity.ok(
                Response.success("Category updated successfully", updated)
        );
    }

    // DELETE /api/categories/{id} - deletes a category (returns 204)
    @DeleteMapping("/{id}")
    public ResponseEntity<Response<Void>> deleteCategory(
            @PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}