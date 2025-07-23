package com.rodrigofisch.hexagonal.architecture.config;

import com.rodrigofisch.hexagonal.architecture.adapters.out.FindAddressByZipCodeAdapter;
import com.rodrigofisch.hexagonal.architecture.adapters.out.UpdateCustomerAdapter;
import com.rodrigofisch.hexagonal.architecture.application.core.useCase.FindCustomerByIdUseCase;
import com.rodrigofisch.hexagonal.architecture.application.core.useCase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
