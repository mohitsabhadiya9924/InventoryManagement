package com.InventoryManagement.InventoryManagement.Service;

import com.InventoryManagement.InventoryManagement.Model_Entity.Customer;
import com.InventoryManagement.InventoryManagement.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void addData(List<Customer> customers) {
        customerRepository.saveAll(customers);
    }
}
