package com.ecommerce.project.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @Email
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "order" , cascade = {CascadeType.PERSIST,CascadeType.MERGE},orphanRemoval = false)
    private List<OrderItem> orderItems = new ArrayList<>();

    private LocalDate orderDate;

    @OneToOne
    @JoinColumn(name="payment_id")
    private Payment payment;

    private Double totalAmount;
    private String orderStatus;

    @ManyToOne
    @JoinColumn(name="address_id")
    private Address address;
}