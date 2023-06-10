package com.workshop.projectspring.repository;

import com.workshop.projectspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
