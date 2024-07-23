package com.InventoryManagement.InventoryManagement.Repository;

import com.InventoryManagement.InventoryManagement.Model_Entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {
}
