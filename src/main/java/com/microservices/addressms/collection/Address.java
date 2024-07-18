package com.microservices.addressms.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor @NoArgsConstructor
@Document(collection = "address")
public class Address {
    @Id
    private String addressId;
    private String street;
    private String city;
}
