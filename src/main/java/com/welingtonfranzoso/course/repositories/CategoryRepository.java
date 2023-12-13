package com.welingtonfranzoso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welingtonfranzoso.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
