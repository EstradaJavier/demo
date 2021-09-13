package com.example.demo.customer;

public class Customer {
    private final Long id;
    private final String name;

    Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

//  ----------  id
    public Long getId() {
        return id;
    }

//  ----------  customerId
    public Long getCustomerId() {
        return id;
    }
//  ----------  name
    public String getName() {
        return name;
    }

/*
  ----------  The @Override annotation indicates that the child class method is
  ----------  over-writing its base class method. It extracts a warning from the
  ----------  compiler if the annotated method doesn't actually override anything
*/
@Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
