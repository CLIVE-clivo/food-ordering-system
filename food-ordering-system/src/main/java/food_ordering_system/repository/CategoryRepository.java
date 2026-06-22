package com.jumpstart.food_ordering_system.repository;

import com.jumpstart.food_ordering_system.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// The repository is responsible for talking to the database.
// By extending JpaRepository, we get all basic database operations
// like findAll(), findById(), save() and delete() for free.
public interface CategoryRepository extends JpaRepository<Category, Long> {

}