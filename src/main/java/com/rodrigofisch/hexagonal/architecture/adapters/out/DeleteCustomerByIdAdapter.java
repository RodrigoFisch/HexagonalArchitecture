package com.rodrigofisch.hexagonal.architecture.adapters.out;

import com.rodrigofisch.hexagonal.architecture.adapters.out.repository.CustomerRepository;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);

    }
}
