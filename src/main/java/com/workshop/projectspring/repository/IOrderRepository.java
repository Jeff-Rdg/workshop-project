package com.workshop.projectspring.repository;

import com.workshop.projectspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Integer> {
}
