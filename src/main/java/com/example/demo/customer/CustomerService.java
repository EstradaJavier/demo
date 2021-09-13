package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
  ----------  When we annotate a class with @Component,
  ----------  Spring creates a new instance of the class. In this case,
  ----------  it creates a new instance of [CustomerService].

  ----------  @Component was replaced with @Service. It is a more
  ----------  specific annotation for this type of class.
  ----------  This class is mean to be used as a service.
*/
@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

//  ----------  Adding a [dependency injection] with @Autowired to CustomerService.
    @Autowired
    public CustomerService(
            CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
}