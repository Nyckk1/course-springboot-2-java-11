package com.courseweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
