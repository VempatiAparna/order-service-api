package com.drafted.orderservice.model;
import jakarta.persistence.*;
@Entity
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String item;
    private int quantity;
    // getters and setters omitted for brevity
}
