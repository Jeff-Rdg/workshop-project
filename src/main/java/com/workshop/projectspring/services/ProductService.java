package com.workshop.projectspring.services;

import com.workshop.projectspring.entities.Product;
import com.workshop.projectspring.repository.IProductRepository;
import com.workshop.projectspring.services.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }
}
