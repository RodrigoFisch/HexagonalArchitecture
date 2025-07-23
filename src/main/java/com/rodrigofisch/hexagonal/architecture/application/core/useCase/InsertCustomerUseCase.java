package com.rodrigofisch.hexagonal.architecture.application.core.useCase;

import com.rodrigofisch.hexagonal.architecture.adapters.out.InsertCustomerAdapter;
import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;
import com.rodrigofisch.hexagonal.architecture.application.ports.in.InsertCustomerInputPort;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.FindAddressByZipCodeOutputPort;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.InsertCustomerOutputPort;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.SendCpfValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCpfValidationOutputPort sendCpfValidationOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerAdapter insertCustomerOutputPort, SendCpfValidationOutputPort sendCpfValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfValidationOutputPort = sendCpfValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        //criacao de variavel CEP. necessario conexao comportas de saida
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfValidationOutputPort.send(customer.getCpf());
    }
}
