package com.courseweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
