package com.shopcrud1.shopicrud1.service;

import com.shopcrud1.shopicrud1.model.Product;
import com.shopcrud1.shopicrud1.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getPrductById(int id) {
        return productRepo.findById(id).orElse(new Product());

    }

    public Product updateProductById(int id, Product product)throws IOException {

        return productRepo.save(product);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
}
