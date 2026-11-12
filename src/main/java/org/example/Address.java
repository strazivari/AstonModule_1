package org.example;

import java.util.Objects;

public class Address {
    private String city;

    public Address(String city){
        this.city = ValidationUtils.verifyData(city);
    }

    public Address(Address other){
        Objects.requireNonNull(other, "Exception - Data is null");
        this.city = ValidationUtils.verifyData(other.city);
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = ValidationUtils.verifyData(city);
    }
}
