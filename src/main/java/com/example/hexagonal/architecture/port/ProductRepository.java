package com.example.hexagonal.architecture.port;

import com.example.hexagonal.architecture.domain.model.Product;

import java.util.List;
import java.util.Optional;

/**
 * The repository interface is an outbound port that enables communication from the core application to a database
 */
public interface ProductRepository {

    List<Product> getProducts();

    Optional<Product> getProductById(Integer productId);

    Product addProduct(Product product);

    Optional<Product> removeProduct(Integer productId);
}
