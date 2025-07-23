package com.rodrigofisch.hexagonal.architecture.application.ports.out;

import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
