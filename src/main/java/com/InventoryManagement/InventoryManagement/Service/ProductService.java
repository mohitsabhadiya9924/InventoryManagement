package com.InventoryManagement.InventoryManagement.Service;

import com.InventoryManagement.InventoryManagement.Model_Entity.Product;
import com.InventoryManagement.InventoryManagement.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public void addProducts(List<Product> products) {
        productRepository.saveAll(products);
    }
}
