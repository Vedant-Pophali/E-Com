package com.ecommerce.project.Repositories;

import com.ecommerce.project.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderItem, Integer> {
}
