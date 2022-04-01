package com.example.hexagonal.architecture.adapter.persistence;

import com.example.hexagonal.architecture.domain.model.Product;
import com.example.hexagonal.architecture.port.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

/*
@Repository
public class ProductRespositoryInMemoryImpl implements ProductRepository {

    private static final Map<Integer, Product> productMap = new HashMap<Integer, Product>(0);

    @Override
    public List<Product> getProducts() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Optional<Product> getProductById(Integer productId) {
        return Optional.ofNullable(productMap.get(productId));
    }

    @Override
    public Product addProduct(Product product) {
        productMap.put(product.getProductId(), product);
        return product;
    }

    @Override
    public Optional<Product> removeProduct(Integer productId) {
        if(productMap.get(productId)!= null){
            Product product = productMap.get(productId);
            productMap.remove(productId);
            return Optional.ofNullable(product);
        } else
            return Optional.empty();

    }


}
*/
