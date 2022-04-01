package com.example.hexagonal.architecture.port;

import com.example.hexagonal.architecture.domain.model.Product;
import java.util.List;
import java.util.Optional;

/**
 * The interface is an inbound port provides the flow and the application functionality to the outside
 */
public interface ProductService {

    List<Product> getProducts();

    Optional<Product> getProductById(Integer productId);

    Product addProduct(Product product);

    Optional<Product> removeProduct(Integer productId);
}
