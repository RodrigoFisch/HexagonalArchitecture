package com.rodrigofisch.hexagonal.architecture.config;

import com.rodrigofisch.hexagonal.architecture.adapters.out.FindCustomerFindByIdAdapter;
import com.rodrigofisch.hexagonal.architecture.application.core.useCase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerFindByIdAdapter findCustomerFindByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerFindByIdAdapter);
    }
}
