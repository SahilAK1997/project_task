package com.restapifor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapifor.model.pro;

public interface ProductsRepository extends JpaRepository<pro, Long> {
}
