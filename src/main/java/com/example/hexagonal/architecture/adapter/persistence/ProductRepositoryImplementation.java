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
public class ProductRepositoryImplementation implements ProductRepository {

    private SpringDataJpaProductRepository springDataJpaProductRepository;

    public ProductRepositoryImplementation(SpringDataJpaProductRepository springDataJpaProductRepository) {
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

/*
    private static final Map<Integer, Product> productMap = new HashMap<Integer, Product>(0);

    @Override
    public List<Product> getProducts() {
        return new ArrayList<Product>(productMap.values());
    }

    @Override
    public Product getProductById(Integer productId) {
        return productMap.get(productId);
    }

    @Override
    public Product addProduct(Product product) {
        productMap.put(product.getProductId(), product);
        return product;
    }

    @Override
    public Product removeProduct(Integer productId) {
        if(productMap.get(productId)!= null){
            Product product = productMap.get(productId);
            productMap.remove(productId);
            return product;
        } else
            return null;

    }
*/
}
