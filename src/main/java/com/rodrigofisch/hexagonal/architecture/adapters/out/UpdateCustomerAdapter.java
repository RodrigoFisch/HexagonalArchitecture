package com.rodrigofisch.hexagonal.architecture.adapters.out;

import com.rodrigofisch.hexagonal.architecture.adapters.out.repository.CustomerRepository;
import com.rodrigofisch.hexagonal.architecture.adapters.out.repository.mapper.CustomerEntityMapper;
import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    private CustomerRepository customerRepository;

    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);

    }
}
