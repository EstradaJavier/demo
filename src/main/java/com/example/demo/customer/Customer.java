package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private final Long id;
    private final String name;
    private final String password;

    Customer(Long id,
             String name,
             String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @JsonProperty("customerId")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

/*
  ----------  Using the @JsonIgnore annotation stops the server from
  ----------  sending the password to the browser.
*/
@JsonIgnore
    public String getPassword() {
        return password;
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
                ", password='" + password + '\'' +
                '}';
    }
}
