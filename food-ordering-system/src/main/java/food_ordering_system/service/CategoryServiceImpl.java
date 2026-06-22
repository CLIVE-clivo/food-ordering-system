package com.jumpstart.food_ordering_system.service;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import com.jumpstart.food_ordering_system.entity.Category;
import com.jumpstart.food_ordering_system.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

// The service layer contains the business logic of the application.
// It gets data from the repository and converts it into DTOs
// before sending it to the controller.
@Service
public class CategoryServiceImpl implements CategoryService {

    // Spring automatically injects the repository here
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAllCategories() {

        // Get all Category entities from the database
        List<Category> categories = categoryRepository.findAll();

        // Create an empty list to store the DTOs
        List<CategoryDto> categoryDtos = new ArrayList<>();

        // Loop through each category and convert it to a DTO
        for (Category category : categories) {
            CategoryDto dto = new CategoryDto();
            dto.setId(category.getId());
            dto.setName(category.getName());
            categoryDtos.add(dto);
        }

        // Return the list of DTOs
        return categoryDtos;
    }
}