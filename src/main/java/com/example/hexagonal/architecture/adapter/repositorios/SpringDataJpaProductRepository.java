package com.example.hexagonal.architecture.adapter.repositorios;

import com.example.hexagonal.architecture.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaProductRepository extends JpaRepository<Product, Integer> {
}
