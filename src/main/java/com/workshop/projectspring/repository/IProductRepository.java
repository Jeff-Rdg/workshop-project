package com.workshop.projectspring.repository;

import com.workshop.projectspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
}
