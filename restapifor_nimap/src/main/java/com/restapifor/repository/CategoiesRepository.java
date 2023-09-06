package com.restapifor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapifor.model.cat;

public interface CategoiesRepository extends JpaRepository<cat, Long> {
}
