package com.InventoryManagement.InventoryManagement.Repository;

import com.InventoryManagement.InventoryManagement.Model_Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
