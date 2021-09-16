package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

//  ----------  Adding the word 'final' makes customerService immutable.
    private final CustomerService customerService;

//  ----------  Adding a [dependency injection] with @Autowired to CustomerService.
    @Autowired

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
/*
  ----------  @GetMapping is part of the REST Layer
  ----------  It is used to handle HTTP Request
  ----------  [POST - (GET) - DELETE - PUT]
*/
    @GetMapping
    List<Customer> getCustomer() {

        return customerService.getCustomer();
    }
}
