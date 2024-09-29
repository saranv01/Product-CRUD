package com.shopcrud1.shopicrud1.controller;

import com.shopcrud1.shopicrud1.model.Product;
import com.shopcrud1.shopicrud1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

        @Autowired
        private ProductService service;

        @RequestMapping("/product")
        public List<Product> getAllProducts(){
            return service.getAllProducts();
        }

        @RequestMapping("/product/{id}")
        public Product getProductById(@PathVariable int id){
                return service.getPrductById(id);
        }

        @PutMapping("/product/{id}")
        public ResponseEntity<String>updateProduct(@PathVariable int id, @RequestBody Product product){
            Product prod= null;
            try {
                prod = service.updateProductById(id,product);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if(prod!=null){
                        return new ResponseEntity<>("Updated", HttpStatus.OK);
                }
                else{
                        return new ResponseEntity<>("Not Updated",HttpStatus.BAD_REQUEST);
                }
        }
        @DeleteMapping("/product/{id}")
        public ResponseEntity<String> deleteProduct(@PathVariable int id){
                Product prod= service.getPrductById(id);
                if(prod!=null){
                        service.deleteProduct(id);
                        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
                }
                else{
                        return new ResponseEntity<>("Sorry, Product not found",HttpStatus.BAD_REQUEST);
                }
        }
}
