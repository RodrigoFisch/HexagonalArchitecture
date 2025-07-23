package com.rodrigofisch.hexagonal.architecture.adapters.in.controller.mapper;

import com.rodrigofisch.hexagonal.architecture.adapters.in.controller.request.CustomerRequest;
import com.rodrigofisch.hexagonal.architecture.adapters.in.controller.response.CustomerResponse;
import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true )
    @Mapping(target = "address", ignore = true )
    @Mapping(target = "cpf", ignore = true )
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
