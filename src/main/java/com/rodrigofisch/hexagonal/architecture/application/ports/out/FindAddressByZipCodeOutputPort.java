package com.rodrigofisch.hexagonal.architecture.application.ports.out;


import com.rodrigofisch.hexagonal.architecture.application.core.domain.Address;

//porta de saida para buscar enderecos por CEP
public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
