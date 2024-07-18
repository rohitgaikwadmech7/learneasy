package com.microservices.addressms.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class AddressResponse {

    private String addressId;
    private String street;
    private String city;

    public AddressResponse(Address address){
        this.street=address.getStreet();
        this.city=address.getCity();
        this.addressId=address.getAddressId();
    }
}
