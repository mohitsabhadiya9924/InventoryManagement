package com.InventoryManagement.InventoryManagement.Repository;

import com.InventoryManagement.InventoryManagement.Model_Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
