package com.workshop.projectspring.repository;

import com.workshop.projectspring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
