package com.rodrigofisch.hexagonal.architecture.adapters.out.client.mapper;

import com.rodrigofisch.hexagonal.architecture.adapters.out.client.response.AddressResponse;
import com.rodrigofisch.hexagonal.architecture.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
