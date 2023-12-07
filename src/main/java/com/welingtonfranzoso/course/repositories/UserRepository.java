package com.welingtonfranzoso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welingtonfranzoso.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
