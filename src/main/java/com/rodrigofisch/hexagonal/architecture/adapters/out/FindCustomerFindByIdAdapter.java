package com.rodrigofisch.hexagonal.architecture.adapters.out;

import com.rodrigofisch.hexagonal.architecture.adapters.out.repository.CustomerRepository;
import com.rodrigofisch.hexagonal.architecture.adapters.out.repository.mapper.CustomerEntityMapper;
import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerFindByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
