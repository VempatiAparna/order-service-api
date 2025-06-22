package com.drafted.orderservice.controller;
import com.drafted.orderservice.model.Order;
import com.drafted.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService svc;
    public OrderController(OrderService svc) { this.svc = svc; }
    @GetMapping
    public List<Order> all() { return svc.findAll(); }
    @PostMapping
    public Order create(@RequestBody Order o) { return svc.save(o); }
}
