package com.example.di_xml_configuration.di.constructor_injection._2_dependent_object;

public class Address {
    private String addressLine;
    private String city;
    private String state;
    private String country;

    public Address(String addressLine, String city, String state, String country) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
