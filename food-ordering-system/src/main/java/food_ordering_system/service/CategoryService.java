package com.jumpstart.food_ordering_system.service;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import java.util.List;

// This interface defines what the service layer can do.
// The actual logic is written in CategoryServiceImpl.
public interface CategoryService {
    List<CategoryDto> getAllCategories();
}
