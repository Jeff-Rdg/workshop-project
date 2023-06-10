package com.workshop.projectspring.services;

import com.workshop.projectspring.entities.Category;
import com.workshop.projectspring.repository.ICategoryRepository;
import com.workshop.projectspring.services.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Integer id) {
        Optional<Category> order = categoryRepository.findById(id);
        return order.get();
    }
}
