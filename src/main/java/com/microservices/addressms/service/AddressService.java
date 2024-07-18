package com.microservices.addressms.service;

import com.microservices.addressms.collection.AddressResponse;
import com.microservices.addressms.collection.CreateAddressRequest;

public interface AddressService {
    AddressResponse createAddress(CreateAddressRequest request);

    AddressResponse getAddressById(String id);
}
