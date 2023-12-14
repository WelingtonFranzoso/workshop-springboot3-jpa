package com.welingtonfranzoso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welingtonfranzoso.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
