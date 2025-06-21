package com.drafted.orderservice.service;
import com.drafted.orderservice.model.Order;
import com.drafted.orderservice.repository.OrderRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepo repo;
    public OrderService(OrderRepo repo) { this.repo = repo; }
    public List<Order> findAll() { return repo.findAll(); }
    public Order save(Order o) { return repo.save(o); }
}
