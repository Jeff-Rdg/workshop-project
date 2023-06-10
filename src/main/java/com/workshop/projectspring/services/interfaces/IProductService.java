package com.workshop.projectspring.services.interfaces;

import com.workshop.projectspring.entities.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();

    public Product findById(Integer id);
}
