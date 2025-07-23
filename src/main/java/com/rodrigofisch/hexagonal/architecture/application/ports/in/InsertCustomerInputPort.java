package com.rodrigofisch.hexagonal.architecture.application.ports.in;

import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert (Customer customer, String zipCode);
}
