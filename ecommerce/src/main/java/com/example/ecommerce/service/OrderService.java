package com.example.ecommerce.service;

import com.example.ecommerce.entity.Order;
import com.example.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public Order placeOrder(Order o) {
        return repo.save(o);
    }

    public List<Order> getOrders() {
        return repo.findAll();
    }
}