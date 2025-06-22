package com.drafted.orderservice.repository;
import com.drafted.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepo extends JpaRepository<Order,Long> {}
