package com.microservices.addressms.repository;

import com.microservices.addressms.collection.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Addressrepository extends MongoRepository<Address,String> {
}
