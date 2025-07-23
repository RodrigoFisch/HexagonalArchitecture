package com.rodrigofisch.hexagonal.architecture.adapters.in.controller.response;

import lombok.Data;

@Data
public class AddressResponse {

    private String street;
    private String city;
    private String state;
}
