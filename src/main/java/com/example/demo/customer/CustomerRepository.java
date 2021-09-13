package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/*
  ----------  When we annotate a class with @Component,
  ----------  Spring creates a new instance of the class [CustomerRepository].
*/
@Repository
@Primary
//  ----------  This class will be used to implement a real db.
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
//  ----------  TODO: connect to real db  ----------  //
        return Collections.singletonList(
                new Customer(1L, "TODO. Implement real db")
        );

    }
}