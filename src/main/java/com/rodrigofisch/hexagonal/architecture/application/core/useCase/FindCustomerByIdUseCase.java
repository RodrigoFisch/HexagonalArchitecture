package com.rodrigofisch.hexagonal.architecture.application.core.useCase;

import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;
import com.rodrigofisch.hexagonal.architecture.application.ports.in.FindCustomerByIdInputPort;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(()-> new RuntimeException("Customer not foud"));
    };
}
