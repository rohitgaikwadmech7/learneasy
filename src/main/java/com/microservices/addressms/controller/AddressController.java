package com.microservices.addressms.controller;

import com.microservices.addressms.collection.AddressResponse;
import com.microservices.addressms.collection.CreateAddressRequest;
import com.microservices.addressms.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/address")
@AllArgsConstructor
public class AddressController {

    private AddressService addressService;

    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest request){
        return addressService.createAddress(request);
    }

    @GetMapping("/getById/{id}")
    public AddressResponse getById(@PathVariable String id){
        return addressService.getAddressById(id);
    }



}
