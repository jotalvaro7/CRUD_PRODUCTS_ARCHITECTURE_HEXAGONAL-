package com.example.hexagonal.architecture.config;

import com.example.hexagonal.architecture.adapter.repositorios.SpringDataJpaProductRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//se utiliza en un proyecto de git pero al comentarlo no altera los resultados en nada
@EnableJpaRepositories(basePackageClasses = SpringDataJpaProductRepository.class)
public class JpaDbConfiguration {
}
