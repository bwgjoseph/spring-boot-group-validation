package com.bwgjoseph.springbootgroupvalidation;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bwgjoseph.springbootgroupvalidation.group.HomeGroup;
import com.bwgjoseph.springbootgroupvalidation.group.OfficeGroup;

@RestController
public class AddressController {
    @PostMapping("/address/home")
    public AddressDto createHome(@Validated({HomeGroup.class}) @RequestBody AddressDto addressDto) {
        return addressDto;
    }

    @PostMapping("/address/office")
    public AddressDto createOffice(@Validated({OfficeGroup.class}) @RequestBody AddressDto addressDto) {
        return addressDto;
    }
}
