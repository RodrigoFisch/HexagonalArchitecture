package com.rodrigofisch.hexagonal.architecture.adapters.out;

import com.rodrigofisch.hexagonal.architecture.adapters.out.client.FindAdressByZipCodeClient;
import com.rodrigofisch.hexagonal.architecture.adapters.out.client.mapper.AddressResponseMapper;
import com.rodrigofisch.hexagonal.architecture.application.core.domain.Address;
import com.rodrigofisch.hexagonal.architecture.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAdressByZipCodeClient findAdressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAdressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
