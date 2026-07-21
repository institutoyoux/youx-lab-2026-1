package com.startjava.spring.repositories;

import com.startjava.spring.entities.OrderItem;
import com.startjava.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
