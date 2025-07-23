package com.rodrigofisch.hexagonal.architecture.application.core.useCase;

import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;
import com.rodrigofisch.hexagonal.architecture.application.ports.in.FindCustomerByIdInputPort;
import com.rodrigofisch.hexagonal.architecture.application.ports.in.UpdateCustomerInputPort;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.FindAddressByZipCodeOutputPort;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort
    ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String ziCode){
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(ziCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
