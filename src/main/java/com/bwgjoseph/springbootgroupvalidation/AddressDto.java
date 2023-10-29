package com.bwgjoseph.springbootgroupvalidation;

import jakarta.validation.constraints.Min;

// @ValidateForHome(message = "ownership is a must!")
@Conditional(selected = "type", values = {"home"}, required = {"ownership"})
// ownership is only required if type is home
public record AddressDto(String address, String postalCode, @Min(10) String country, String type, String ownership) {}
