package com.rodrigofisch.hexagonal.architecture.application.ports.out;

import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
