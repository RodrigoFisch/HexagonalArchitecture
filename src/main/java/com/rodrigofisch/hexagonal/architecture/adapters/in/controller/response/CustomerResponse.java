package com.rodrigofisch.hexagonal.architecture.adapters.in.controller.response;

import com.rodrigofisch.hexagonal.architecture.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
