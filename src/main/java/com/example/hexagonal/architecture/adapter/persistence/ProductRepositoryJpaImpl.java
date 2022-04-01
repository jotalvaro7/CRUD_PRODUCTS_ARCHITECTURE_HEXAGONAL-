package com.example.hexagonal.architecture.adapter.persistence;

import com.example.hexagonal.architecture.adapter.repositorios.SpringDataJpaProductRepository;
import com.example.hexagonal.architecture.domain.model.Product;
import com.example.hexagonal.architecture.port.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * The interface defines an output adapter which is an implementation of the outbound port. It enables the core application to communicate to external dependency such as the database.
 */
@Repository
public class ProductRepositoryJpaImpl implements ProductRepository {

    private SpringDataJpaProductRepository springDataJpaProductRepository;

    public ProductRepositoryJpaImpl(SpringDataJpaProductRepository springDataJpaProductRepository) {
        this.springDataJpaProductRepository = springDataJpaProductRepository;
    }

    @Override
    public List<Product> getProducts() {
        return springDataJpaProductRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Integer productId) {
        return springDataJpaProductRepository.findById(productId);
    }

    @Override
    public Product addProduct(Product product) {
        return springDataJpaProductRepository.save(product);
    }

    @Override
    public Optional<Product> removeProduct(Integer productId) {
        Optional<Product> product = springDataJpaProductRepository.findById(productId);
        if(product.isPresent()){
            springDataJpaProductRepository.deleteById(productId);
            return product;
        }
        return Optional.empty();
    }
}
