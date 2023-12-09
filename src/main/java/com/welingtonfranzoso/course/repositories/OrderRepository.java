package com.welingtonfranzoso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welingtonfranzoso.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
