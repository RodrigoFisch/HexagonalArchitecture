package com.rodrigofisch.hexagonal.architecture.adapters.out.repository.entity;

import lombok.Data;

@Data
public class AddressEntity {

    private String Street;
    private String city;
    private String state;

}
