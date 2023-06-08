package com.workshop.projectspring.services.interfaces;

import com.workshop.projectspring.entities.Order;

import java.util.List;

public interface IOrderService {
    public List<Order> findAll();

    public Order findById(Integer id);
}
