package com.microservices.addressms.service;

import com.microservices.addressms.collection.Address;
import com.microservices.addressms.collection.AddressResponse;
import com.microservices.addressms.collection.CreateAddressRequest;
import com.microservices.addressms.repository.Addressrepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{

    Logger logger= LoggerFactory.getLogger(AddressResponse.class);

    @Autowired
    Addressrepository addressrepository;

    @Override
    public AddressResponse createAddress(CreateAddressRequest request) {
        logger.info("Inside createAddress() entered :: " + getClass() );

        Address address = new Address();
        address.setCity(request.getCity());
        address.setStreet(request.getStreet());

        Address savedaddress  =
                addressrepository.save(address);

        logger.info("Inside createAddress() exit :: " + getClass() );

        return new AddressResponse(savedaddress );
    }

    @Override
    public AddressResponse getAddressById(String id) {
        logger.info("Inside getAddressById() entred :: " + getClass() );

        Address address= addressrepository.findById(id).get();
        logger.info("Inside getAddressById() exit :: " + getClass() );

        return new AddressResponse(address);
    }
}
