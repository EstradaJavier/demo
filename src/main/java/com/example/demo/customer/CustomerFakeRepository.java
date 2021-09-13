package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/*
  ----------  @Repository(value = "fake") --> We do not need this annotation
  ----------  if we are instantiating this class [CustomerFakeRepository].
*/
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Javier Estrada"),
                new Customer(2L, "Alesha Estrada"),
                new Customer(3L, "Bear Estrada")
        );
    }
}