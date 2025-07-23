package com.rodrigofisch.hexagonal.architecture.application.ports.in;

import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
