package com.bwgjoseph.springbootgroupvalidation;

@ValidateForHome(message = "ownership is a must!")
// ownership is only required if type is home
public record AddressDto(String address, String postalCode, String country, String type, String ownership) {}
