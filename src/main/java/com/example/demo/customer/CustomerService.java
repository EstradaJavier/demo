package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//  ----------  Adding @Component here, creates a bean that we can
//  ----------  injected into many different classes.
@Component
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(
            CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
}