package com.rodrigofisch.hexagonal.architecture.application.ports.out;

import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    public void insert(Customer customer){

    }

    void insert(Customer customer);
}
