package com.rodrigofisch.hexagonal.architecture.config;

import com.rodrigofisch.hexagonal.architecture.adapters.out.FindAddressByZipCodeAdapter;
import com.rodrigofisch.hexagonal.architecture.adapters.out.InsertCustomerAdapter;
import com.rodrigofisch.hexagonal.architecture.application.core.useCase.InsertCustomerUseCase;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.SendCpfValidationOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationOutputPort sendCpfValidationOutputPort
    ){
        return new InsertCustomerUseCase(
                findAddressByZipCodeAdapter,
                insertCustomerAdapter,
                sendCpfValidationOutputPort
        );
    }
}
