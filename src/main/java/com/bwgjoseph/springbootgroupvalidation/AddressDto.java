package com.bwgjoseph.springbootgroupvalidation;

import com.bwgjoseph.springbootgroupvalidation.group.HomeGroup;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

// @ValidateForHome(message = "ownership is a must!") // simple
// @Conditional(selected = "type", values = {"home"}, required = {"ownership"}) // conditional
// ownership is only required if type is home
public record AddressDto(String address, String postalCode, @Min(10) String country, String type, @NotBlank(groups = HomeGroup.class) String ownership) {}
