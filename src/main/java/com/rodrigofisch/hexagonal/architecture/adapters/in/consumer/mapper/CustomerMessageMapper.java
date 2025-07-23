package com.rodrigofisch.hexagonal.architecture.adapters.in.consumer.mapper;

import com.rodrigofisch.hexagonal.architecture.adapters.in.consumer.CustomerMessage;
import com.rodrigofisch.hexagonal.architecture.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
