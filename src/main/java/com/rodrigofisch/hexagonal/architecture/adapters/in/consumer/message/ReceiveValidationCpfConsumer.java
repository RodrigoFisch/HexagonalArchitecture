package com.rodrigofisch.hexagonal.architecture.adapters.in.consumer.message;

import com.rodrigofisch.hexagonal.architecture.adapters.in.consumer.CustomerMessage;
import com.rodrigofisch.hexagonal.architecture.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.rodrigofisch.hexagonal.architecture.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidationCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-valideted", groupId = "arantes")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());

    }
}
