package com.rodrigofisch.hexagonal.architecture.config;

import com.rodrigofisch.hexagonal.architecture.adapters.out.DeleteCustomerByIdAdapter;
import com.rodrigofisch.hexagonal.architecture.application.core.useCase.DeleteCustomerByIdUseCase;
import com.rodrigofisch.hexagonal.architecture.application.core.useCase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
