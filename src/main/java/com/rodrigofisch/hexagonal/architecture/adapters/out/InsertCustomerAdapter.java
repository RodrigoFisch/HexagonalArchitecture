package com.rodrigofisch.hexagonal.architecture.adapters.out;

import com.rodrigofisch.hexagonal.architecture.adapters.out.repository.CustomerRepository;
import com.rodrigofisch.hexagonal.architecture.adapters.out.repository.mapper.CustomerEntityMapper;
import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer){
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);

    }
}
