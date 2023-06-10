package com.workshop.projectspring.services.interfaces;

import com.workshop.projectspring.entities.Category;

import java.util.List;

public interface ICategoryService {
    public List<Category> findAll();

    public Category findById(Integer id);
}
