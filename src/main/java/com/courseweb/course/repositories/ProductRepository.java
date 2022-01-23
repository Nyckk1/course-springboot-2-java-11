package com.courseweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
